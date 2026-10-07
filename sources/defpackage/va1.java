package defpackage;

import java.util.AbstractMap;
import java.util.concurrent.atomic.AtomicBoolean;
import ru.ok.android.externcalls.sdk.media.mute.MediaMuteManager;
import ru.ok.android.externcalls.sdk.media.mute.listener.MediaMuteManagerListener;

/* JADX INFO: loaded from: classes4.dex */
public final class va1 implements MediaMuteManagerListener {
    public final /* synthetic */ ya1 a;
    public final /* synthetic */ ny8 b;
    public final /* synthetic */ ny8 c;
    public final /* synthetic */ ny8 d;

    public va1(ya1 ya1Var, ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3) {
        this.a = ya1Var;
        this.b = ny8Var;
        this.c = ny8Var2;
        this.d = ny8Var3;
    }

    @Override // ru.ok.android.externcalls.sdk.media.mute.listener.MediaMuteManagerListener
    public final void onMuteChanged(h9b h9bVar) {
        boolean zC;
        Object value;
        Object value2;
        boolean zC2;
        Object value3;
        o0a o0aVar = o0a.a;
        je9 je9Var = je9.d;
        o0a o0aVar2 = (o0a) h9bVar.a.get(n0a.b);
        if (o0aVar2 != null) {
            ya1 ya1Var = this.a;
            ny8 ny8Var = this.b;
            boolean z = o0aVar2 == o0aVar;
            a4c a4cVar = gm0.f;
            if (a4cVar != null && a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, "CallAdminSettingsController", "Video was disabled by admin to " + o0aVar2, null);
            }
            if (z) {
                zC2 = false;
            } else {
                zC2 = ((rd1) ny8Var.getValue()).c();
                ((rd1) ny8Var.getValue()).d(false);
            }
            mjg mjgVar = ya1Var.u;
            do {
                value3 = mjgVar.getValue();
            } while (!mjgVar.h(value3, gc.a((gc) value3, false, ya1.o(o0aVar2), false, false, false, false, 125)));
            if (!ya1.o(o0aVar2)) {
                ya1Var.s.a(new ld(true, false));
            } else if (zC2) {
                ya1Var.s.a(fd.a);
            }
        }
        o0a o0aVar3 = (o0a) h9bVar.a.get(n0a.a);
        if (o0aVar3 != null) {
            ya1 ya1Var2 = this.a;
            ny8 ny8Var2 = this.c;
            boolean z2 = o0aVar3 == o0aVar;
            a4c a4cVar2 = gm0.f;
            if (a4cVar2 != null && a4cVar2.b(je9Var)) {
                a4cVar2.c(je9Var, "CallAdminSettingsController", "Microphone was changed by admin to " + o0aVar3, null);
            }
            if (!z2) {
                ((ac1) ((zb1) ny8Var2.getValue())).c();
                ((ac1) ((zb1) ny8Var2.getValue())).d(false);
            }
            mjg mjgVar2 = ya1Var2.u;
            do {
                value2 = mjgVar2.getValue();
            } while (!mjgVar2.h(value2, gc.a((gc) value2, false, false, ya1.o(o0aVar3), false, false, false, 123)));
            if (!ya1Var2.m()) {
                if (!ya1.o(o0aVar3)) {
                    ya1Var2.s.a(new nd(true, false));
                } else if (!z2) {
                    ya1Var2.s.a(gd.a);
                }
            }
        }
        o0a o0aVar4 = (o0a) h9bVar.a.get(n0a.c);
        if (o0aVar4 != null) {
            ya1 ya1Var3 = this.a;
            ny8 ny8Var3 = this.d;
            boolean z3 = o0aVar4 == o0aVar;
            a4c a4cVar3 = gm0.f;
            if (a4cVar3 != null && a4cVar3.b(je9Var)) {
                a4cVar3.c(je9Var, "CallAdminSettingsController", "Screen sharing was disabled by admin to " + o0aVar4, null);
            }
            if (z3) {
                zC = false;
            } else {
                zC = ((z3f) ny8Var3.getValue()).c();
                ((z3f) ny8Var3.getValue()).b(false);
            }
            mjg mjgVar3 = ya1Var3.u;
            do {
                value = mjgVar3.getValue();
            } while (!mjgVar3.h(value, gc.a((gc) value, false, false, false, ya1.o(o0aVar4), false, false, 119)));
            if (!ya1.o(o0aVar4) && zC) {
                ya1Var3.s.a(new rd(true, false));
            } else if (zC) {
                ya1Var3.s.a(jd.a);
            }
        }
    }

    @Override // ru.ok.android.externcalls.sdk.media.mute.listener.MediaMuteManagerListener
    public final void onMuteStateInitialized(h9b h9bVar) {
        boolean zO;
        p0a mediaOptionsForCall$default;
        o0a o0aVar;
        AbstractMap abstractMap = h9bVar.a;
        ya1 ya1Var = this.a;
        AtomicBoolean atomicBoolean = ya1Var.k;
        if (atomicBoolean.get()) {
            gm0.Y(va1.class.getName(), "Early return in onMuteStateInitialized cuz of isSettingsInitialized.get()");
            return;
        }
        o0a o0aVar2 = (o0a) abstractMap.get(n0a.b);
        boolean zO2 = o0aVar2 != null ? ya1.o(o0aVar2) : ya1Var.k();
        o0a o0aVar3 = (o0a) abstractMap.get(n0a.a);
        boolean zO3 = o0aVar3 != null ? ya1.o(o0aVar3) : ya1Var.l();
        o0a o0aVar4 = (o0a) abstractMap.get(n0a.c);
        if (o0aVar4 != null) {
            zO = ya1.o(o0aVar4);
        } else {
            MediaMuteManager mediaMuteManagerG = ya1Var.g();
            zO = (mediaMuteManagerG == null || (mediaOptionsForCall$default = MediaMuteManager.getMediaOptionsForCall$default(mediaMuteManagerG, null, 1, null)) == null || (o0aVar = mediaOptionsForCall$default.c) == null) ? false : ya1.o(o0aVar);
        }
        ya1Var.v(zO2, zO3, zO);
        atomicBoolean.set(true);
        ya1Var.t();
    }
}
