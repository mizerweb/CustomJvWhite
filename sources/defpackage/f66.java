package defpackage;

import android.app.Activity;
import android.content.Context;
import android.text.Spannable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class f66 implements w46 {
    public final Context a;
    public final i56 b;
    public final yt4 c;
    public final ifh d;
    public final n56 e;
    public final ifh f;
    public final ifh g;

    public f66(yt4 yt4Var, i56 i56Var, ny8 ny8Var, Context context) {
        this.a = context;
        this.b = i56Var;
        this.c = yt4Var;
        final int i = 0;
        this.d = new ifh(new af7(this) { // from class: e66
            public final /* synthetic */ f66 b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                v56 v56Var;
                int i2 = i;
                f66 f66Var = this.b;
                switch (i2) {
                    case 0:
                        try {
                            v56Var = new v56(f66Var.a.getResources());
                            break;
                        } catch (Exception unused) {
                            v56Var = null;
                        } catch (y56 e) {
                            throw e;
                        }
                        return new a56(v56Var);
                    default:
                        return new f56((a56) f66Var.d.getValue(), f66Var.b, f66Var.e, f66Var.f);
                }
            }
        });
        this.e = new n56(context);
        this.f = new ifh(new x5(this, 12, ny8Var));
        final int i2 = 1;
        this.g = new ifh(new af7(this) { // from class: e66
            public final /* synthetic */ f66 b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                v56 v56Var;
                int i3 = i2;
                f66 f66Var = this.b;
                switch (i3) {
                    case 0:
                        try {
                            v56Var = new v56(f66Var.a.getResources());
                            break;
                        } catch (Exception unused) {
                            v56Var = null;
                        } catch (y56 e) {
                            throw e;
                        }
                        return new a56(v56Var);
                    default:
                        return new f56((a56) f66Var.d.getValue(), f66Var.b, f66Var.e, f66Var.f);
                }
            }
        });
    }

    @Override // defpackage.w46
    public final xx6 a() {
        return ((l56) this.f.getValue()).e;
    }

    @Override // defpackage.w46
    public final void b(Activity activity) {
        ((l56) this.f.getValue()).b(activity);
    }

    public final kfg c(String str) {
        w56 w56VarA = ((a56) this.d.getValue()).a(0, str.length(), str);
        if (w56VarA == null) {
            return null;
        }
        n56 n56Var = this.e;
        n56Var.getClass();
        return new kfg(w56VarA, gm0.K(28.0f * yl5.d().getDisplayMetrics().density), new c46(this.b, n56Var, (l56) this.f.getValue()));
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0067  */
    public final List d(CharSequence charSequence) {
        int i;
        if (charSequence == null || charSequence.length() == 0) {
            return r66.a;
        }
        f56 f56Var = (f56) this.g.getValue();
        int length = charSequence.length();
        f56Var.getClass();
        je9 je9Var = je9.g;
        Spannable spannableNewSpannable = charSequence instanceof Spannable ? (Spannable) charSequence : Spannable.Factory.getInstance().newSpannable(charSequence);
        w4 w4Var = new w4(spannableNewSpannable);
        ArrayList arrayList = new ArrayList();
        a56 a56Var = f56Var.a;
        int iK = 0;
        while (iK < length) {
            int iT = w4Var.t(iK);
            feg fegVar = iT < 0 ? null : ((feg[]) w4Var.a)[iT];
            if (fegVar == null) {
                int iT2 = w4Var.t(iK);
                if (iT2 >= 0) {
                    feg[] fegVarArr = (feg[]) w4Var.a;
                    if (iT2 <= fegVarArr.length - 1) {
                        i = fegVarArr[iT2 + 1].a;
                    } else {
                        i = -1;
                    }
                } else {
                    i = -1;
                }
                if (i == -1) {
                    i = length;
                }
                w56 w56VarA = a56Var.a(iK, i, spannableNewSpannable);
                if (w56VarA != null) {
                    int iK2 = w56VarA.k() + iK;
                    try {
                        arrayList.add(new ylc(spannableNewSpannable.subSequence(iK, iK2), new hj8(iK, iK2, 1)));
                    } catch (Exception unused) {
                        String name = f56.class.getName();
                        a4c a4cVar = gm0.f;
                        if (a4cVar != null && a4cVar.b(je9Var)) {
                            a4cVar.c(je9Var, name, qt4.l("Can't subSequence by ", iK, iK2, ", "), null);
                        }
                    }
                    iK += w56VarA.k();
                } else {
                    iK++;
                }
            } else {
                try {
                    arrayList.add(new ylc(spannableNewSpannable.subSequence(fegVar.a, fegVar.b), new hj8(fegVar.a, fegVar.b, 1)));
                } catch (Exception unused2) {
                    String name2 = f56.class.getName();
                    a4c a4cVar2 = gm0.f;
                    if (a4cVar2 != null && a4cVar2.b(je9Var)) {
                        a4cVar2.c(je9Var, name2, qt4.l("Can't subSequence by ", fegVar.a, fegVar.b, ", "), null);
                    }
                }
                iK = fegVar.b;
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0050  */
    public final Spannable e(int i, int i2, CharSequence charSequence) {
        int i3;
        kfg kfgVar;
        if (charSequence == null) {
            return null;
        }
        f56 f56Var = (f56) this.g.getValue();
        f56Var.getClass();
        Spannable spannableNewSpannable = charSequence instanceof Spannable ? (Spannable) charSequence : Spannable.Factory.getInstance().newSpannable(charSequence);
        w4 w4Var = new w4(spannableNewSpannable);
        a56 a56Var = f56Var.a;
        int iK = 0;
        while (iK < i) {
            int iT = w4Var.t(iK);
            feg fegVar = iT < 0 ? null : ((feg[]) w4Var.a)[iT];
            if (fegVar == null) {
                int iT2 = w4Var.t(iK);
                if (iT2 >= 0) {
                    feg[] fegVarArr = (feg[]) w4Var.a;
                    if (iT2 <= fegVarArr.length - 1) {
                        i3 = fegVarArr[iT2 + 1].a;
                    } else {
                        i3 = -1;
                    }
                } else {
                    i3 = -1;
                }
                if (i3 == -1) {
                    i3 = i;
                }
                w56 w56VarA = a56Var.a(iK, i3, spannableNewSpannable);
                if (w56VarA != null) {
                    i56 i56Var = f56Var.b;
                    c46 c46Var = new c46(i56Var, f56Var.c, (l56) f56Var.d.getValue());
                    synchronized (i56Var) {
                        try {
                            keg kegVar = (keg) i56Var.c.c(w56VarA);
                            if (kegVar == null) {
                                kegVar = new keg(0);
                                i56Var.c.d(w56VarA, kegVar);
                            }
                            kfgVar = (kfg) kegVar.a(i2);
                            if (kfgVar == null) {
                                kfgVar = new kfg(w56VarA, i2, c46Var);
                                kegVar.b(i2, kfgVar);
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    spannableNewSpannable.setSpan(new h56(kfgVar), iK, w56VarA.k() + iK, 33);
                    iK += w56VarA.k();
                } else {
                    iK++;
                }
            } else {
                iK = fegVar.b;
            }
        }
        return spannableNewSpannable;
    }

    public final Spannable f(int i, CharSequence charSequence) {
        if (charSequence == null) {
            return null;
        }
        return e(charSequence.length(), i, charSequence);
    }
}
