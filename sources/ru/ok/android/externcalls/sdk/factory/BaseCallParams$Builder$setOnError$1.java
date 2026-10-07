package ru.ok.android.externcalls.sdk.factory;

import defpackage.cf7;
import defpackage.fg7;
import defpackage.sbi;
import defpackage.sg4;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final /* synthetic */ class BaseCallParams$Builder$setOnError$1 extends fg7 implements cf7 {
    public BaseCallParams$Builder$setOnError$1(Object obj) {
        super(1, 0, sg4.class, obj, "accept", "accept(Ljava/lang/Object;)V");
    }

    @Override // defpackage.cf7
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return sbi.a;
    }

    public final void invoke(Throwable th) {
        ((sg4) this.receiver).accept(th);
    }
}
