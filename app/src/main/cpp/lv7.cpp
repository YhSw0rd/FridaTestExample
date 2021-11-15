//
// Created by YangHS on 2021/11/3.
//

#include <jni.h>

#define JNIREG_CLASS "com/example/fridatestexample/lv/lv7/Lv7"


jstring lv7GetPassword(JNIEnv *env, jobject){
    return env->NewStringUTF("lv7Password");
}

JNINativeMethod  methods[] = {
        {"getPassword", "()Ljava/lang/String;",(void*)lv7GetPassword}
};

JNIEXPORT jint JNICALL JNI_OnLoad(JavaVM* vm,void* reserved){
    JNIEnv* env = NULL;
    jint result = -1;
    if( vm->GetEnv((void **) &env, JNI_VERSION_1_6) != JNI_OK ){
        return JNI_ERR;
    }
    jclass clazz = env->FindClass(JNIREG_CLASS);
    if( env->RegisterNatives(clazz,methods, sizeof(methods)/ sizeof(methods[0])) != JNI_OK ){
        return JNI_ERR;
    }
    return JNI_VERSION_1_6;

}