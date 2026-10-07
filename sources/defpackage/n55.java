package defpackage;

import android.graphics.Bitmap;
import android.net.Uri;
import com.facebook.fresco.middleware.HasExtraData;
import com.facebook.imagepipeline.decoder.DecodeException;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n55 implements ip8, s72 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ n55(vt4 vt4Var, int i, qf7 qf7Var) {
        this.b = vt4Var;
        this.a = i;
        this.c = qf7Var;
    }

    @Override // defpackage.s72
    public Object Q(r72 r72Var) {
        vt4 vt4Var = (vt4) this.b;
        qf7 qf7Var = (qf7) this.c;
        r72Var.a(new e6(19, (vo8) vt4Var.x0(nhb.h)), hm5.a);
        return yab.i0(cqk.a(vt4Var), null, this.a, new gz(qf7Var, r72Var, (lq4) null, 10), 1);
    }

    @Override // defpackage.ip8
    public void b(p76 p76Var, int i) {
        String str;
        long j;
        boolean z;
        s98 s98Var;
        String str2;
        xt3 xt3VarA;
        p55 p55Var = (p55) this.b;
        q55 q55Var = (q55) this.c;
        int i2 = this.a;
        es0 es0Var = p55Var.c;
        if (p76Var == null) {
            return;
        }
        v78 v78Var = es0Var.a;
        p76Var.Y();
        es0Var.putExtra(HasExtraData.KEY_IMAGE_FORMAT, p76Var.b.a);
        Uri uri = v78Var.b;
        p76Var.j = uri != null ? uri.toString() : null;
        at5 at5Var = v78Var.q;
        if (at5Var == null) {
            at5Var = q55Var.e;
        }
        boolean zL = lq0.l(i, 16);
        if ((at5Var == at5.a || (at5Var == at5.b && !zL)) && (q55Var.f || !rki.d(v78Var.b))) {
            p76Var.g = gm0.p(v78Var.i, v78Var.h, p76Var, i2);
        }
        es0Var.l.w.getClass();
        int i3 = p55Var.h;
        String str3 = "unknown";
        d68 d68Var = p55Var.e;
        pjd pjdVar = p55Var.d;
        p76Var.Y();
        if ((p76Var.b != kb5.a && lq0.b(i)) || p55Var.f || !p76.P(p76Var)) {
            return;
        }
        p76Var.Y();
        if (cqk.d(p76Var.b, kb5.c)) {
            p76Var.Y();
            long j2 = p76Var.e;
            p76Var.Y();
            if (j2 * ((long) p76Var.f) * ((long) oy0.b(d68Var.a)) > 104857600) {
                p76Var.Y();
                int i4 = p76Var.e;
                p76Var.Y();
                int i5 = p76Var.f;
                Bitmap.Config config = d68Var.a;
                StringBuilder sbP = qv1.p("Image is too big to attempt decoding: w = ", i4, ", h = ", i5, ", pixel config = ");
                sbP.append(config);
                sbP.append(", max bitmap size = 104857600");
                IllegalStateException illegalStateException = new IllegalStateException(sbP.toString());
                pjdVar.b(es0Var, "DecodeProducer", illegalStateException, null);
                p55Var.p(illegalStateException);
                return;
            }
        }
        p76Var.Y();
        String str4 = p76Var.b.a;
        p76Var.Y();
        int i6 = p76Var.e;
        p76Var.Y();
        String str5 = i6 + "x" + p76Var.f;
        String strValueOf = String.valueOf(p76Var.g);
        boolean zA = lq0.a(i);
        boolean z2 = zA && !lq0.l(i, 8);
        boolean zL2 = lq0.l(i, 4);
        bne bneVar = v78Var.h;
        if (bneVar != null) {
            str3 = bneVar.a + "x" + bneVar.b;
        }
        try {
            jp8 jp8Var = p55Var.g;
            synchronized (jp8Var) {
                str = str3;
                j = jp8Var.i - jp8Var.h;
            }
            String string = v78Var.b.toString();
            int iE = (z2 != 0 || zL2) ? p76Var.E() : p55Var.n(p76Var);
            s98 s98VarO = (z2 || zL2) ? s98.d : p55Var.o();
            pjdVar.a(es0Var, "DecodeProducer");
            try {
                try {
                    xt3VarA = p55Var.i.c.a(p76Var, iE, s98VarO, p55Var.e);
                    try {
                        int i7 = p76Var.g != 1 ? i | 16 : i;
                        pjdVar.d(es0Var, "DecodeProducer", p55Var.m(xt3VarA, j, s98VarO, zA, str4, str5, str, strValueOf));
                        p55Var.r(p76Var, xt3VarA, i3);
                        au3 au3VarL = p55Var.i.i.l(xt3VarA);
                        try {
                            p55Var.q(lq0.a(i7));
                            p55Var.b.g(i7, au3VarL);
                            au3.E(au3VarL);
                            p76Var.close();
                        } catch (Throwable th) {
                            au3.E(au3VarL);
                            throw th;
                        }
                    } catch (Exception e) {
                        e = e;
                        pjdVar = pjdVar;
                        j = j;
                        z = zA;
                        s98Var = s98VarO;
                        str2 = str;
                        pjdVar.b(es0Var, "DecodeProducer", e, p55Var.m(xt3VarA, j, s98Var, z, str4, str5, str2, strValueOf));
                        p55Var.p(e);
                        p76Var.close();
                    }
                } catch (DecodeException e2) {
                    e = e2;
                    j = j;
                    z = zA;
                    s98Var = s98VarO;
                    str2 = str;
                    try {
                        p76 p76Var2 = e.a;
                        DecodeException decodeException = e;
                        try {
                            long j3 = j;
                            try {
                                pj6.l("ProgressiveDecoder", "%s, {uri: %s, firstEncodedBytes: %s, length: %d}", decodeException.getMessage(), string, p76Var2.y(), Integer.valueOf(p76Var2.E()));
                                throw decodeException;
                            } catch (Exception e3) {
                                e = e3;
                                p55Var = p55Var;
                                j = j3;
                                xt3VarA = null;
                                pjdVar.b(es0Var, "DecodeProducer", e, p55Var.m(xt3VarA, j, s98Var, z, str4, str5, str2, strValueOf));
                                p55Var.p(e);
                                p76Var.close();
                            }
                        } catch (Exception e4) {
                            e = e4;
                            p55Var = p55Var;
                        }
                    } catch (Exception e5) {
                        e = e5;
                    }
                } catch (Exception e6) {
                    e = e6;
                    j = j;
                    z = zA;
                    s98Var = s98VarO;
                    str2 = str;
                    xt3VarA = null;
                    pjdVar.b(es0Var, "DecodeProducer", e, p55Var.m(xt3VarA, j, s98Var, z, str4, str5, str2, strValueOf));
                    p55Var.p(e);
                    p76Var.close();
                }
            } catch (DecodeException e7) {
                e = e7;
            } catch (Exception e8) {
                e = e8;
            }
        } catch (Throwable th2) {
            p76Var.close();
            throw th2;
        }
    }

    public /* synthetic */ n55(p55 p55Var, q55 q55Var, int i) {
        this.b = p55Var;
        this.c = q55Var;
        this.a = i;
    }
}
