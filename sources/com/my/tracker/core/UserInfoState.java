package com.my.tracker.core;

/* JADX INFO: loaded from: classes.dex */
public final class UserInfoState {
    public static final UserInfoState EMPTY = new UserInfoState(-1, -1, null, null, null, null, null, null, null);
    public final int age;
    public final String[] customUserIds;
    public final String[] emails;
    public final int gender;
    public final String[] icqIds;
    public final String[] okIds;
    public final String[] phones;
    public final String[] vkConnectIds;
    public final String[] vkIds;

    public UserInfoState(int i, int i2, String[] strArr, String[] strArr2, String[] strArr3, String[] strArr4, String[] strArr5, String[] strArr6, String[] strArr7) {
        this.age = i;
        this.gender = i2;
        this.okIds = strArr;
        this.vkIds = strArr2;
        this.emails = strArr3;
        this.icqIds = strArr4;
        this.customUserIds = strArr5;
        this.phones = strArr6;
        this.vkConnectIds = strArr7;
    }
}
