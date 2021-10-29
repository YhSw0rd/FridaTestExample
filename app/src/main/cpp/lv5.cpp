//
// Created by YangHS on 2021/10/28.
//

#include <jni.h>
#include <string.h>
#include "lv5.h"

extern "C" JNIEXPORT jboolean JNICALL Java_com_example_fridatestexample_lv_lv5_Lv5Activity_isSameString
(JNIEnv *env,jobject instance ,jstring string_){
    char* charArray = (char*)(env->GetStringUTFChars(string_, JNI_FALSE));

    char compareCharArray[] = "checkStringCheckString";
    //  如果长度不一样，那么肯定是修改了
    if(env->GetStringUTFLength(string_) != strlen(compareCharArray)){
        return false;
    }
    //  选字符串短的，要不怕溢出了
    int length = strlen(compareCharArray) < strlen(charArray) ? strlen(compareCharArray):strlen(charArray);
    int sameChars = 0;
    for(int i = 0 ; i < length ; i++) {
        if (charArray[i] == compareCharArray[i]) {
            ++sameChars;
        }
    }
    return sameChars == strlen(compareCharArray);
}