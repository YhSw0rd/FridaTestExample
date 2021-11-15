//
// Created by YangHS on 2021/11/15.
//
#include <jni.h>
#include "main.h"


extern "C" JNIEXPORT jstring JNICALL Java_com_example_fridatestexample_MainActivity_getHelloWorld(JNIEnv *env, jobject) {
    return env->NewStringUTF("Main Hello World");
}