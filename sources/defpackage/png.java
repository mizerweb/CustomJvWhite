package defpackage;

import java.lang.reflect.InvocationTargetException;
import one.me.stickerssearch.StickersSearchScreen;

/* JADX INFO: loaded from: classes3.dex */
public final class png implements p7c {
    public final /* synthetic */ StickersSearchScreen a;

    public png(StickersSearchScreen stickersSearchScreen) {
        this.a = stickersSearchScreen;
    }

    @Override // defpackage.p7c
    public final void E0(CharSequence charSequence) throws IllegalAccessException, InvocationTargetException {
        zv8[] zv8VarArr = StickersSearchScreen.l;
        vng vngVarP1 = this.a.p1();
        if (cqk.d(charSequence, ((sng) vngVarP1.m.get()).a)) {
            return;
        }
        sgg sggVar = vngVarP1.o;
        if (sggVar != null) {
            sggVar.b(null);
        }
        mjg mjgVar = vngVarP1.h;
        mjgVar.j(null, new p9f(1, ((p9f) mjgVar.getValue()).b));
        vngVarP1.k.setValue(charSequence != null ? charSequence.toString() : null);
    }

    @Override // defpackage.p7c
    public final void o() {
        this.a.getRouter().D();
    }
}
