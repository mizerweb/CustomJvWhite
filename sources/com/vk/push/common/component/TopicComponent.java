package com.vk.push.common.component;

import defpackage.ljh;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\b\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/vk/push/common/component/TopicComponent;", "", "", "topic", "Lljh;", "Lsbi;", "subscribeToTopic", "(Ljava/lang/String;)Lljh;", "unsubscribeFromTopic", "common_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public interface TopicComponent {
    ljh subscribeToTopic(String topic);

    ljh unsubscribeFromTopic(String topic);
}
