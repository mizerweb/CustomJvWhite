package defpackage;

import androidx.media3.session.MediaSessionService;

/* JADX INFO: loaded from: classes.dex */
public final class l0a implements gu9, j3d {
    public final MediaSessionService a;
    public final k2a b;
    public final /* synthetic */ m0a c;

    public l0a(m0a m0aVar, MediaSessionService mediaSessionService, k2a k2aVar) {
        this.c = m0aVar;
        this.a = mediaSessionService;
        this.b = k2aVar;
    }

    @Override // defpackage.gu9
    public final void o() {
        this.a.g(this.b, false);
    }

    @Override // defpackage.gu9
    public final void s() {
        this.a.g(this.b, false);
    }

    @Override // defpackage.gu9
    public final void t(iu9 iu9Var) {
        MediaSessionService mediaSessionService = this.a;
        k2a k2aVar = this.b;
        if (mediaSessionService.d(k2aVar)) {
            mediaSessionService.h(k2aVar);
        }
        mediaSessionService.g(k2aVar, false);
    }

    @Override // defpackage.gu9
    public final h88 u(emf emfVar) {
        int i;
        if (emfVar.b.equals("androidx.media3.session.NOTIFICATION_DISMISSED_EVENT_KEY")) {
            k0a k0aVar = (k0a) this.c.g.get(this.b);
            if (k0aVar != null) {
                k0aVar.b = true;
            }
            i = 0;
        } else {
            i = -6;
        }
        return rx8.J(new wmf(i));
    }

    @Override // defpackage.j3d
    public final void u0(l3d l3dVar, i3d i3dVar) {
        if (i3dVar.a.a(4, 5, 14, 0)) {
            this.a.g(this.b, false);
        }
    }
}
