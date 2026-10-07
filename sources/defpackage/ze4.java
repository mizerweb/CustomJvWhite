package defpackage;

import android.net.Uri;

/* JADX INFO: loaded from: classes4.dex */
public final class ze4 extends mj9 {
    public final /* synthetic */ int g = 2;
    public final /* synthetic */ Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ze4(xv9 xv9Var) {
        super(8);
        this.h = xv9Var;
    }

    @Override // defpackage.mj9
    public final Object a(Object obj) {
        Object poeVar;
        long jG;
        switch (this.g) {
            case 0:
                return ((af4) this.h).a.O0((String) obj);
            case 1:
                Uri uri = (Uri) obj;
                xv9 xv9Var = (xv9) this.h;
                try {
                    poeVar = Long.valueOf(((yx9) xv9Var.a.get()).a(uri).b);
                    break;
                } catch (Throwable th) {
                    poeVar = new poe(th);
                }
                Throwable thA = roe.a(poeVar);
                if (thA != null) {
                    String str = xv9Var.b;
                    a4c a4cVar = gm0.f;
                    if (a4cVar != null) {
                        je9 je9Var = je9.f;
                        if (a4cVar.b(je9Var)) {
                            a4cVar.c(je9Var, str, "mediaInfoRetriever resolve duration failed", thA);
                        }
                    }
                }
                Long l = (Long) (poeVar instanceof poe ? null : poeVar);
                if (l == null || l.longValue() <= 0) {
                    jG = -1;
                } else {
                    ghb ghbVar = ew5.b;
                    jG = ew5.g(qe7.P(l.longValue(), lw5.MICROSECONDS));
                }
                return Long.valueOf(jG);
            default:
                return null;
        }
    }

    @Override // defpackage.mj9
    public void b(boolean z, Object obj, Object obj2, Object obj3) throws Exception {
        switch (this.g) {
            case 0:
                ((vxe) obj2).close();
                break;
            case 2:
                lti ltiVar = (lti) obj2;
                pti ptiVar = (pti) this.h;
                if (z) {
                    String str = ptiVar.g;
                    a4c a4cVar = gm0.f;
                    if (a4cVar != null) {
                        je9 je9Var = je9.d;
                        if (a4cVar.b(je9Var)) {
                            long j = ltiVar.b;
                            String str2 = ltiVar.a;
                            int iG = ptiVar.y.g();
                            boolean zD = ltiVar.c.d();
                            StringBuilder sbT = qt4.t(j, "Player autoplay. State evicted, should free player, \n                                |msgId:", ", \n                                |attachId:", str2);
                            sbT.append("\n                                |states count:");
                            sbT.append(iG);
                            sbT.append("\n                                |playing:");
                            sbT.append(zD);
                            a4cVar.c(je9Var, str, s5h.y0(sbT.toString()), null);
                        }
                    }
                    ltiVar.d.a(ltiVar.c);
                    z5j z5jVar = (z5j) ltiVar.f.get();
                    if (z5jVar != null) {
                        z5jVar.J();
                    }
                }
                break;
        }
    }

    @Override // defpackage.mj9
    public int h(Object obj, Object obj2) {
        switch (this.g) {
            case 2:
                return 1;
            default:
                return super.h(obj, obj2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ze4(int i, pti ptiVar) {
        super(i);
        this.h = ptiVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ze4(af4 af4Var) {
        super(25);
        this.h = af4Var;
    }
}
