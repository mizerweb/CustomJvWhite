package com.vk.push.core.domain;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0014\u0010\n\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0004¨\u0006\u000b"}, d2 = {"Lcom/vk/push/core/domain/ComponentActions;", "", "", "CLIENT_MESSAGING_SERVICE_ACTION", "Ljava/lang/String;", "TEST_PUSH_SERVICE_ACTION", "MASTER_HOST_UPDATE_ACTION", "GET_DEVICE_ID_ACTION", "WORK_EXECUTOR_ACTION", "WORK_REGISTRATOR_ACTION", "PUSH_SERVICE_ACTION", "core_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class ComponentActions {
    public static final String CLIENT_MESSAGING_SERVICE_ACTION = "ru.rustore.sdk.pushclient.MESSAGING_EVENT";
    public static final String GET_DEVICE_ID_ACTION = "com.vk.push.GET_DEVICE_ID";
    public static final ComponentActions INSTANCE = new ComponentActions();
    public static final String MASTER_HOST_UPDATE_ACTION = "com.vk.push.ACTION_MASTER_HOST_UPDATE";
    public static final String PUSH_SERVICE_ACTION = "com.vk.push.PUSH_SERVICE";
    public static final String TEST_PUSH_SERVICE_ACTION = "com.vk.push.TEST_PUSH";
    public static final String WORK_EXECUTOR_ACTION = "com.vk.push.WORK_EXECUTOR";
    public static final String WORK_REGISTRATOR_ACTION = "com.vk.push.WORK_REGISTRATOR";
}
