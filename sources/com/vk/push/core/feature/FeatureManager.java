package com.vk.push.core.feature;

import defpackage.lq4;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u001b\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\u0005\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0007H¦@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\tJ\u001b\u0010\u0005\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\nH¦@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\fJ\u000f\u0010\r\u001a\u00020\bH&¢\u0006\u0004\b\r\u0010\u000e\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000f"}, d2 = {"Lcom/vk/push/core/feature/FeatureManager;", "", "Lcom/vk/push/core/feature/Feature$BooleanFeature;", "feature", "", "getFeatureValue", "(Lcom/vk/push/core/feature/Feature$BooleanFeature;Llq4;)Ljava/lang/Object;", "Lcom/vk/push/core/feature/Feature$StringFeature;", "", "(Lcom/vk/push/core/feature/Feature$StringFeature;Llq4;)Ljava/lang/Object;", "Lcom/vk/push/core/feature/Feature$IntFeature;", "", "(Lcom/vk/push/core/feature/Feature$IntFeature;Llq4;)Ljava/lang/Object;", "getSegments", "()Ljava/lang/String;", "core_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public interface FeatureManager {
    Object getFeatureValue(Feature.BooleanFeature booleanFeature, lq4 lq4Var);

    Object getFeatureValue(Feature.IntFeature intFeature, lq4 lq4Var);

    Object getFeatureValue(Feature.StringFeature stringFeature, lq4 lq4Var);

    String getSegments();
}
