//
// Created by YangHS on 2021/10/29.
//

#include <jni.h>
#include <stdio.h>
#include <string>
#include <stdlib.h>
#include "lv6.h"

extern "C" JNIEXPORT jboolean JNICALL Java_com_example_fridatestexample_lv_lv6_Lv6Activity_isDebuging(JNIEnv *, jobject instance, jint pid){
    char path[100] = "proc/";
    char strPid[100];
    sprintf(strPid, "%d" , pid);
    strcat(path,strPid);
    strcat(path,"/status");
    FILE *fp = fopen(path,"r");
    char strLine[1024];
    for(int i = 0 ; i < 8 ; i++){
        fgets(strLine,1024,fp);
    }
    if(strcmp(strLine,"TracerPid:\t0\n") == 0){
        return false;
    }
    return true;
}