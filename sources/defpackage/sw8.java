package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import one.me.keyboardmedia.MediaKeyboardWidget;
import one.me.keyboardmedia.emoji.KeyboardEmojiWidget;
import one.me.keyboardmedia.stickers.KeyboardStickersWidget;

/* JADX INFO: loaded from: classes2.dex */
public final class sw8 extends kve {
    public final MediaKeyboardWidget k;
    public final dj9 l;
    public final long m;
    public final t3f n;
    public final boolean o;
    public final List p;
    public List q;
    public kbc r;

    public sw8(MediaKeyboardWidget mediaKeyboardWidget, dj9 dj9Var, long j, t3f t3fVar, boolean z, ArrayList arrayList) {
        super(mediaKeyboardWidget);
        this.k = mediaKeyboardWidget;
        this.l = dj9Var;
        this.m = j;
        this.n = t3fVar;
        this.o = z;
        this.p = arrayList;
        this.q = r66.a;
    }

    @Override // defpackage.kve
    public final void G(hve hveVar, int i) {
        KeyboardStickersWidget keyboardStickersWidget;
        br4 br4Var;
        if (!hveVar.o() && i >= 0 && i <= xw3.O0(this.q)) {
            int iOrdinal = ((ax8) this.q.get(i)).ordinal();
            xq4 xq4Var = xq4.b;
            t3f t3fVar = this.n;
            if (iOrdinal == 0) {
                keyboardStickersWidget = new KeyboardStickersWidget(this.m, t3fVar);
                keyboardStickersWidget.e = this.l;
                keyboardStickersWidget.setRetainViewMode(xq4Var);
                kbc kbcVar = this.r;
                keyboardStickersWidget.f = kbcVar;
                keyboardStickersWidget.i.i = kbcVar;
                keyboardStickersWidget.j.j = kbcVar;
                if (keyboardStickersWidget.getView() != null && kbcVar != null) {
                    keyboardStickersWidget.onThemeChanged(kbcVar);
                    br4Var = keyboardStickersWidget;
                }
            } else if (iOrdinal != 1) {
                if (iOrdinal == 2) {
                    return;
                }
                ore.o();
                return;
            } else {
                KeyboardEmojiWidget keyboardEmojiWidget = new KeyboardEmojiWidget(t3fVar, this.o, this.p);
                keyboardEmojiWidget.setRetainViewMode(xq4Var);
                kbc kbcVar2 = this.r;
                keyboardEmojiWidget.j = kbcVar2;
                keyboardEmojiWidget.g.h = kbcVar2;
                keyboardEmojiWidget.h.h = kbcVar2;
                br4Var = keyboardEmojiWidget;
            }
            br4Var = keyboardStickersWidget;
            br4Var = keyboardStickersWidget;
            br4 br4Var2 = br4Var;
            br4Var2.setTargetController(this.k);
            hveVar.T(new lve(br4Var2, null, null, null, false, -1));
        }
    }

    public final void L(kbc kbcVar) {
        this.r = kbcVar;
        int size = this.q.size();
        for (int i = 0; i < size; i++) {
            hve hveVar = (hve) this.h.get(i);
            if (hveVar != null) {
                Iterator it = hveVar.a.iterator();
                while (true) {
                    y1 y1Var = (y1) it;
                    if (y1Var.hasNext()) {
                        br4 br4Var = ((lve) y1Var.next()).a;
                        if (br4Var instanceof KeyboardEmojiWidget) {
                            KeyboardEmojiWidget keyboardEmojiWidget = (KeyboardEmojiWidget) br4Var;
                            keyboardEmojiWidget.j = kbcVar;
                            keyboardEmojiWidget.g.h = kbcVar;
                            keyboardEmojiWidget.h.h = kbcVar;
                        } else if (br4Var instanceof KeyboardStickersWidget) {
                            KeyboardStickersWidget keyboardStickersWidget = (KeyboardStickersWidget) br4Var;
                            keyboardStickersWidget.f = kbcVar;
                            keyboardStickersWidget.i.i = kbcVar;
                            keyboardStickersWidget.j.j = kbcVar;
                            if (keyboardStickersWidget.getView() != null && kbcVar != null) {
                                keyboardStickersWidget.onThemeChanged(kbcVar);
                            }
                        }
                    }
                }
            }
        }
    }

    @Override // defpackage.nee
    public final int l() {
        return this.q.size();
    }

    @Override // defpackage.kve, defpackage.nee
    public final long m(int i) {
        return ((ax8) this.q.get(i)).c;
    }
}
