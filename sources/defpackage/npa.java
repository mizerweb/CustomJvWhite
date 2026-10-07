package defpackage;

import android.content.Context;
import android.text.Layout;
import android.text.TextPaint;
import java.util.concurrent.ConcurrentHashMap;
import org.apache.http.HttpStatus;

/* JADX INFO: loaded from: classes.dex */
public final class npa {
    public final Context a;
    public final gu4 b;
    public final ny8 d;
    public final ny8 e;
    public final ny8 f;
    public final ifh i;
    public final String c = npa.class.getName();
    public final ifh g = new ifh(new j68(12));
    public final ConcurrentHashMap h = new ConcurrentHashMap();

    public npa(pa4 pa4Var, ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, Context context, wmi wmiVar) {
        this.a = context;
        this.b = wmiVar;
        this.d = ny8Var;
        this.e = ny8Var2;
        this.f = ny8Var3;
        this.i = new ifh(new fu(ny8Var, 7));
        pa4Var.a(pa4.d | pa4.e, new qz(2, this));
    }

    public static /* synthetic */ void b(npa npaVar, rt2 rt2Var, fda fdaVar, CharSequence charSequence, boolean z, boolean z2, int i) {
        if ((i & 4) != 0) {
            charSequence = null;
        }
        CharSequence charSequence2 = charSequence;
        if ((i & 16) != 0) {
            z2 = false;
        }
        npaVar.a(rt2Var, fdaVar, charSequence2, z, z2);
    }

    public static aka d(npa npaVar, rt2 rt2Var, fda fdaVar, boolean z, boolean z2, int i) {
        boolean z3 = (i & 16) != 0 ? false : z2;
        npaVar.getClass();
        my8 my8Var = (my8) kuk.a(npaVar.f(), new jpa(rt2Var, fdaVar, false, z3), new n17(1, npaVar, rt2Var, fdaVar, z3));
        return z ? my8Var.b() : my8Var.a();
    }

    public final my8 a(final rt2 rt2Var, final fda fdaVar, final CharSequence charSequence, final boolean z, boolean z2) {
        final npa npaVar;
        final rt2 rt2Var2;
        final fda fdaVar2;
        ifh ifhVar;
        npa npaVar2 = this;
        rt2 rt2Var3 = rt2Var;
        boolean z3 = z2;
        jpa jpaVar = new jpa(rt2Var3, fdaVar, z, z3);
        ((lac) npaVar2.e.getValue()).getClass();
        for (fda fdaVar3 : lac.a(fdaVar)) {
            if (fdaVar3 != fdaVar) {
                b(npaVar2, rt2Var3, fdaVar3, null, true, z3, 4);
            }
            npaVar2 = this;
            rt2Var3 = rt2Var;
            z3 = z2;
        }
        my8 my8Var = (my8) f().c(jpaVar);
        int iA = pfl.a(rt2Var, fdaVar);
        if (z2) {
            iA = sfl.b(iA, true);
        }
        final int iA2 = e().a(iA);
        final int iC = e().c(iA);
        final int i = 0;
        ifh ifhVar2 = new ifh(new af7(this) { // from class: hpa
            public final /* synthetic */ npa b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                switch (i) {
                    case 0:
                        return this.b.c(rt2Var, fdaVar, iA2, charSequence, z);
                    default:
                        return this.b.c(rt2Var, fdaVar, iA2, charSequence, z);
                }
            }
        });
        boolean z4 = iA2 == iC;
        if (z4) {
            npaVar = this;
            rt2Var2 = rt2Var;
            fdaVar2 = fdaVar;
            ifhVar = ifhVar2;
        } else {
            final int i2 = 1;
            npaVar = this;
            rt2Var2 = rt2Var;
            fdaVar2 = fdaVar;
            ifhVar = new ifh(new af7(npaVar) { // from class: hpa
                public final /* synthetic */ npa b;

                {
                    this.b = npaVar;
                }

                @Override // defpackage.af7
                public final Object invoke() {
                    switch (i2) {
                        case 0:
                            return this.b.c(rt2Var2, fdaVar2, iC, charSequence, z);
                        default:
                            return this.b.c(rt2Var2, fdaVar2, iC, charSequence, z);
                    }
                }
            });
        }
        boolean z5 = npaVar.a.getResources().getConfiguration().orientation == 1;
        gu4 gu4Var = npaVar.b;
        if (my8Var != null) {
            if (!z4 && !z5) {
                my8Var.a().c((Layout) ifhVar.getValue());
                yab.i0(gu4Var, null, 0, new kpa(my8Var, ifhVar2, null, 1), 3);
                return my8Var;
            }
            my8Var.b().c((Layout) ifhVar2.getValue());
            if (my8Var.b() != my8Var.a()) {
                yab.i0(gu4Var, null, 0, new kpa(my8Var, ifhVar, null, 0), 3);
            }
            return my8Var;
        }
        aka akaVar = new aka(rt2Var2, fdaVar2, ifhVar2);
        my8 my8Var2 = new my8(akaVar, z4 ? akaVar : new aka(rt2Var2, fdaVar2, ifhVar));
        npaVar.f().d(jpaVar, my8Var2);
        if (!z4 && !z5) {
            my8Var2.a().c((Layout) ifhVar.getValue());
            yab.i0(gu4Var, null, 0, new kpa(my8Var2, ifhVar2, null, 3), 3);
            return my8Var2;
        }
        my8Var2.b().c((Layout) ifhVar2.getValue());
        if (my8Var2.b() != my8Var2.a()) {
            yab.i0(gu4Var, null, 0, new kpa(my8Var2, ifhVar, null, 2), 3);
        }
        return my8Var2;
    }

    public final Layout c(rt2 rt2Var, fda fdaVar, int i, CharSequence charSequence, boolean z) {
        fda fdaVar2;
        CharSequence charSequence2;
        npa npaVar;
        ny8 ny8Var = this.e;
        roh rohVarB = ((lac) ny8Var.getValue()).b(rt2Var, fdaVar);
        if (rohVarB == null) {
            rohVarB = new roh(((vxb) e()).h(), fdaVar.c(rt2Var), true, HttpStatus.SC_GATEWAY_TIMEOUT);
        }
        if (charSequence != null) {
            rohVarB = roh.a(rohVarB, charSequence, HttpStatus.SC_NOT_IMPLEMENTED);
        }
        roh rohVarA = roh.a(rohVarB, ((lac) ny8Var.getValue()).c(rohVarB.h(), z), 509);
        CharSequence charSequenceH = rohVarA.h();
        if (rohVarA.f()) {
            fdaVar2 = fdaVar;
            charSequence2 = charSequenceH;
            npaVar = this;
            npaVar.h.compute(new jpa(rt2Var, fdaVar, z), new mw1(3, new ipa(npaVar, charSequence2, rt2Var, fdaVar2, z)));
        } else {
            fdaVar2 = fdaVar;
            charSequence2 = charSequenceH;
            npaVar = this;
        }
        if (!rohVarA.c()) {
            rohVarA = roh.a(rohVarA, null, 495);
        }
        Object objC = ((mpa) npaVar.i.getValue()).c(new e5i(Integer.valueOf(((vxb) npaVar.e()).g(fdaVar2.d())), Float.valueOf(rohVarA.i()), Boolean.valueOf(fdaVar2.d())));
        if (objC == null) {
            ore.p("Required value was null.");
            return null;
        }
        int iG = (i - rohVarA.g()) - rohVarA.b();
        return ky8.a((ky8) npaVar.f.getValue(), charSequence2, (TextPaint) objC, iG, rohVarA.e(), rohVarA.d(), rohVarA.j(), 0.0f, false, HttpStatus.SC_BAD_REQUEST);
    }

    public final a31 e() {
        return (a31) this.d.getValue();
    }

    public final mj9 f() {
        return (mj9) this.g.getValue();
    }
}
