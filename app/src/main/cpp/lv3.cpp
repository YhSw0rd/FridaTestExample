//
// Created by YangHS on 2021/10/26.
//
#include <jni.h>
#include "lv3.h"


extern "C" JNIEXPORT jstring JNICALL Java_com_example_myapplication2_lv_lv3_Lv3Activity_getLv3String__I
        (JNIEnv *env, jobject, jint){
    return env->NewStringUTF("111111");
}

extern "C" JNIEXPORT jstring JNICALL Java_com_example_myapplication2_lv_lv3_Lv3Activity_getLv3String__Z
        (JNIEnv *env, jobject, jboolean){
    return env->NewStringUTF("3333333");
}