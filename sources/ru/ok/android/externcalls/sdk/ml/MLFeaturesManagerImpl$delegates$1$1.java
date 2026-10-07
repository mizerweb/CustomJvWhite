package ru.ok.android.externcalls.sdk.ml;

import defpackage.cf7;
import defpackage.fg7;
import defpackage.sbi;
import java.io.File;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final /* synthetic */ class MLFeaturesManagerImpl$delegates$1$1 extends fg7 implements cf7 {
    public MLFeaturesManagerImpl$delegates$1$1(Object obj) {
        super(1, 0, MLFeaturesManagerImpl.class, obj, "setNsParams", "setNsParams(Ljava/io/File;)V");
    }

    @Override // defpackage.cf7
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((File) obj);
        return sbi.a;
    }

    public final void invoke(File file) {
        ((MLFeaturesManagerImpl) this.receiver).setNsParams(file);
    }
}
