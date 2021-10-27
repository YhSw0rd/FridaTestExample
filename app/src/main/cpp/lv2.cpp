//
// Created by YangHS on 2021/10/26.
//
#include <jni.h>
#include "lv2.h"

extern "C" JNIEXPORT jstring JNICALL Java_com_example_myapplication2_lv_lv2_Lv2Activity_getNativeUsername(JNIEnv *env, jobject){
    return env->NewStringUTF("admin2");
}

extern "C" JNIEXPORT jstring JNICALL Java_com_example_myapplication2_lv_lv2_Lv2Activity_getNativePassword(JNIEnv *env, jobject){
    return env->NewStringUTF("beinicaiduile2");
}