//
// Created by YangHS on 2021/10/29.
//

#include <jni.h>
#include <stdio.h>
#include <string>
#include <stdlib.h>
#include "lv6.h"

extern "C" JNIEXPORT jboolean JNICALL Java_com_example_fridatestexample_lv_lv6_Lv6Activity_isDebuging(JNIEnv *, jobject instance, jint pid){
    int charLength = 1024;
    char path[100] = "proc/";
    char strPid[100];
    sprintf(strPid, "%d" , pid);
    strcat(path,strPid);
    strcat(path,"/status");
    FILE *fp = fopen(path,"r");
    char strLine[charLength];
    while(!feof(fp)){
        fgets(strLine,charLength,fp);
        if( strstr(strLine,"TracerPid") != NULL){
            break;
        }
    }
    if(feof(fp)){
        return false;
    }
    if(strcmp(strLine,"TracerPid:\t0\n") == 0){
        return false;
    }
    return true;
}