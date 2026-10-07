package ru.ok.android.externcalls.sdk.ml.delegate;

import defpackage.cf7;
import defpackage.fg7;
import defpackage.sbi;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final /* synthetic */ class MLFeatureDelegate$clearDir$1$1 extends fg7 implements cf7 {
    public MLFeatureDelegate$clearDir$1$1(Object obj) {
        super(1, 0, MLFeatureDelegate.class, obj, "log", "log(Ljava/lang/String;)V");
    }

    @Override // defpackage.cf7
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((String) obj);
        return sbi.a;
    }

    public final void invoke(String str) {
        ((MLFeatureDelegate) this.receiver).log(str);
    }
}
