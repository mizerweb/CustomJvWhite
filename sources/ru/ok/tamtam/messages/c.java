package ru.ok.tamtam.messages;

import android.content.Context;
import android.text.SpannableStringBuilder;
import defpackage.bga;
import defpackage.bi4;
import defpackage.cga;
import defpackage.ch3;
import defpackage.e46;
import defpackage.e5d;
import defpackage.e8b;
import defpackage.g46;
import defpackage.gm0;
import defpackage.h60;
import defpackage.jeg;
import defpackage.jn;
import defpackage.k5d;
import defpackage.ku6;
import defpackage.nx2;
import defpackage.o5d;
import defpackage.oc9;
import defpackage.p4c;
import defpackage.qt4;
import defpackage.rt2;
import defpackage.s04;
import defpackage.sfa;
import defpackage.soc;
import defpackage.tre;
import defpackage.u8b;
import defpackage.vg4;
import defpackage.wcd;
import defpackage.woh;
import defpackage.xoh;
import defpackage.y35;
import defpackage.zed;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes.dex */
public final class c {
    public final p4c a;
    public final bi4 b;
    public final zed c;
    public final sfa d;
    public final jn e;
    public rt2 f;
    public CharSequence g;
    public CharSequence h;
    public CharSequence i;
    public CharSequence j;
    public String k;
    public String l;
    public y35 m;
    public wcd n;
    public boolean o;
    public boolean p;
    public boolean q;
    public boolean r;

    public c(p4c p4cVar, bi4 bi4Var, zed zedVar, sfa sfaVar, rt2 rt2Var, jn jnVar) {
        this.a = p4cVar;
        this.b = bi4Var;
        this.c = zedVar;
        this.d = sfaVar;
        this.e = jnVar;
        if (rt2Var != null) {
            l(rt2Var);
            return;
        }
        h();
        j();
        i();
        g(p4cVar.i());
        m(sfaVar);
    }

    public final void a(rt2 rt2Var) {
        if (rt2Var != null) {
            nx2 nx2Var = rt2Var.b;
            sfa sfaVar = this.d;
            if (sfaVar.h != rt2Var.a) {
                this.c.a.E(true);
                gm0.V("ru.ok.tamtam.messages.c", "invalid chat: " + nx2Var.a + " cid=" + nx2Var.l, new ChatException.WrongMessage(sfaVar.a, sfaVar.h, rt2Var.a));
            }
        }
    }

    public final List b(rt2 rt2Var) {
        List<cga> list = this.d.D;
        if (list == null || list.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        if (!(rt2Var instanceof s04)) {
            return list;
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (cga cgaVar : list) {
            bga bgaVar = cgaVar.c;
            if (bgaVar != bga.a && bgaVar != bga.b) {
                arrayList.add(cgaVar);
            }
        }
        return arrayList;
    }

    public final CharSequence c(rt2 rt2Var, sfa sfaVar) {
        zed zedVar = this.c;
        boolean z = zedVar.c.d.getBoolean("audio.transcription.enabled", true);
        e5d e5dVar = zedVar.b;
        o5d o5dVarU = sfaVar.u();
        String str = sfaVar.g;
        boolean zV = e5dVar.v(o5dVarU != null ? Integer.valueOf(sfaVar.u().g()) : null);
        if (!sfaVar.C() || (!sfaVar.W() && !ch3.r(str))) {
            return str;
        }
        p4c p4cVar = this.a;
        if (rt2Var == null || rt2Var.d0() || rt2Var.h0() || rt2Var.n0()) {
            return p4cVar.e.f(p4cVar.a, p4cVar, sfaVar, false, false, false, z, p4cVar.c.t(), true, zV);
        }
        CharSequence charSequenceF = p4cVar.e.f(p4cVar.a, p4cVar, sfaVar, false, false, false, z, p4cVar.c.t(), true, zV);
        p4cVar.e.f(p4cVar.a, p4cVar, sfaVar, false, false, false, z, p4cVar.c.t(), true, zV);
        return charSequenceF;
    }

    public final CharSequence d(rt2 rt2Var) {
        a(rt2Var);
        this.f = rt2Var;
        p4c p4cVar = this.a;
        n(rt2Var, p4cVar.h(), p4cVar.f());
        return this.i;
    }

    public final CharSequence e(rt2 rt2Var, boolean z) {
        a(rt2Var);
        this.f = rt2Var;
        p4c p4cVar = this.a;
        n(rt2Var, p4cVar.h(), p4cVar.f());
        if (z) {
            k(rt2Var);
        }
        return this.g;
    }

    public final boolean f(rt2 rt2Var, sfa sfaVar) {
        return ((sfaVar.e > this.c.a.t() ? 1 : (sfaVar.e == this.c.a.t() ? 0 : -1)) != 0) || (rt2Var != null && rt2Var.d0());
    }

    public final void g(int i) {
        if (this.h == null) {
            this.h = this.a.k.c(i, this.b.f(this.d.e, true).k());
        }
    }

    public final void h() {
        if (this.m == null) {
            sfa sfaVar = this.d;
            this.m = y35.n(sfaVar.D() ? sfaVar.G.b() : sfaVar.y(), TimeZone.getDefault());
        }
    }

    public final void i() {
        String strK;
        if (this.l == null) {
            h();
            y35 y35Var = this.m;
            p4c p4cVar = this.a;
            Context context = p4cVar.a;
            Locale locale = p4cVar.f;
            y35 y35VarN = y35.n(System.currentTimeMillis(), TimeZone.getDefault());
            if (oc9.S(y35VarN, y35Var)) {
                strK = context.getString(R.string.tt_dates_today);
            } else if (y35Var.r().s(1).equals(y35VarN.r())) {
                strK = context.getString(R.string.tt_dates_yesterday);
            } else if (y35Var.r().s(-1).equals(y35VarN.r())) {
                strK = context.getString(R.string.tt_dates_tomorrow);
            } else {
                long jO = y35Var.o(TimeZone.getDefault());
                strK = y35VarN.a.equals(y35Var.a) ? oc9.K(locale, jO, false) : oc9.K(locale, jO, true);
            }
            this.l = strK;
        }
    }

    public final void j() {
        if (this.k == null) {
            sfa sfaVar = this.d;
            long jB = sfaVar.D() ? sfaVar.G.b() : sfaVar.y();
            p4c p4cVar = this.a;
            this.k = oc9.F(p4cVar.a, jB, p4cVar.f);
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0022  */
    public final void k(rt2 rt2Var) {
        boolean z;
        if (this.p) {
            return;
        }
        sfa sfaVar = this.d;
        boolean zM = sfaVar.M();
        if (rt2Var == null || !(rt2Var instanceof s04)) {
            if (zM) {
                if (zM) {
                    this.c.a.getClass();
                } else {
                    z = false;
                }
            }
            z = true;
        } else {
            z = false;
        }
        if (!ch3.r(this.g) && z) {
            this.g = tre.z0(this.a.b(this.g, rt2Var != null && (rt2Var.e0() || rt2Var.n0()), true, rt2Var != null && rt2Var.M0(), !zM, b(rt2Var), f(rt2Var, sfaVar), !(rt2Var instanceof s04)));
        }
        this.p = true;
    }

    public final void l(rt2 rt2Var) {
        a(rt2Var);
        this.f = rt2Var;
        p4c p4cVar = this.a;
        n(rt2Var, p4cVar.h(), p4cVar.f());
        k(rt2Var);
        h();
        j();
        i();
        g(p4cVar.i());
        m(this.d);
    }

    public final void m(sfa sfaVar) {
        if (this.r || !sfaVar.S()) {
            return;
        }
        o5d o5dVarU = sfaVar.u();
        String strF = o5dVarU.f();
        p4c p4cVar = this.a;
        CharSequence charSequenceD = p4cVar.k.d(strF);
        u8b u8bVarB = o5dVarU.b();
        e8b e8bVar = new e8b(u8bVarB.b);
        for (int i = 0; i < u8bVarB.b; i++) {
            k5d k5dVar = (k5d) u8bVarB.g(i);
            e8bVar.f(k5dVar.a(), p4cVar.k.d(k5dVar.b()));
        }
        this.n = new wcd(charSequenceD, e8bVar);
        this.r = true;
    }

    /* JADX WARN: Code duplicated, block: B:44:0x0110  */
    /* JADX WARN: Code duplicated, block: B:46:0x0113  */
    /* JADX WARN: Code duplicated, block: B:47:0x0115  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v21 */
    /* JADX WARN: Type inference failed for: r6v30 */
    public final void n(rt2 rt2Var, int i, int i2) {
        bi4 bi4Var;
        p4c p4cVar;
        CharSequence charSequenceC;
        p4c p4cVar2;
        int i3;
        CharSequence charSequence;
        int i4;
        int i5;
        CharSequence charSequence2;
        ?? r6;
        boolean zAllMatch;
        CharSequence charSequenceA;
        if (this.o) {
            return;
        }
        sfa sfaVar = this.d;
        boolean zM = sfaVar.M();
        long j = sfaVar.e;
        List list = sfaVar.D;
        bi4 bi4Var2 = this.b;
        p4c p4cVar3 = this.a;
        if (!zM) {
            bi4Var = bi4Var2;
            p4cVar = p4cVar3;
            charSequenceC = c(rt2Var, sfaVar);
        } else if (rt2Var != null) {
            p4cVar = p4cVar3;
            bi4Var = bi4Var2;
            charSequenceC = woh.k(p4cVar3.a, p4cVar, (bi4) p4cVar3.d.getValue(), rt2Var.d0(), sfaVar, bi4Var2.f(j, true), false, false, p4cVar3.c.t());
        } else {
            bi4Var = bi4Var2;
            p4cVar = p4cVar3;
            charSequenceC = null;
        }
        if (sfaVar.M() && !ch3.r(charSequenceC)) {
            String string = charSequenceC.toString();
            h60 h60VarQ = sfaVar.q();
            vg4 vg4VarF = bi4Var.f(j, false);
            p4cVar.getClass();
            switch (qt4.D(h60VarQ.a)) {
                case 1:
                case 4:
                case 5:
                case 6:
                case 8:
                    p4cVar2 = p4cVar;
                    i3 = 0;
                    charSequenceA = woh.a(string, vg4VarF, p4cVar2, false);
                    charSequence = charSequenceA;
                    break;
                case 2:
                case 3:
                    p4c p4cVar4 = p4cVar;
                    charSequenceA = woh.b(string, h60VarQ, vg4VarF, p4cVar4, (bi4) p4cVar.d.getValue(), false);
                    p4cVar2 = p4cVar4;
                    i3 = 0;
                    charSequence = charSequenceA;
                    break;
                case 7:
                default:
                    p4cVar2 = p4cVar;
                    i3 = 0;
                    charSequence = string;
                    break;
            }
        } else {
            p4cVar2 = p4cVar;
            i3 = 0;
            charSequence = charSequenceC;
        }
        if (ch3.r(charSequence)) {
            this.g = "";
            this.i = null;
        } else {
            sfaVar.M();
            this.g = tre.z0(p4cVar2.k.c(i, charSequence));
            if (sfaVar.C()) {
                i4 = i3;
            } else {
                ArrayList arrayListG = p4cVar2.g(this.g);
                if (arrayListG.isEmpty() || arrayListG.size() > 3) {
                    r6 = zAllMatch;
                    i5 = i3;
                } else if (list == null) {
                    charSequence2 = this.g;
                    p4cVar2.k.a().getClass();
                    if (charSequence2 != null || charSequence2.length() == 0) {
                        r6 = i3;
                    } else {
                        Set set = g46.a;
                        zAllMatch = charSequence2.codePoints().allMatch(new e46(1));
                    }
                    if (r6 != 0) {
                        r6 = zAllMatch;
                        i5 = 1;
                    } else {
                        r6 = zAllMatch;
                        i5 = i3;
                    }
                } else {
                    Iterator it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            charSequence2 = this.g;
                            p4cVar2.k.a().getClass();
                            if (charSequence2 != null) {
                                r6 = i3;
                            } else {
                                r6 = i3;
                            }
                            if (r6 != 0) {
                                r6 = zAllMatch;
                                i5 = 1;
                            }
                        } else if (((cga) it.next()).c == bga.l) {
                        }
                        r6 = zAllMatch;
                        i5 = i3;
                    }
                }
                i4 = i5;
            }
            this.g = tre.z0(this.a.n(this.g, b(rt2Var), f(rt2Var, sfaVar), i, this.e.a()));
            if (sfaVar.C() || i4 == 0) {
                this.i = null;
            } else {
                this.i = tre.z0(p4cVar2.m(charSequence, list, i2));
            }
        }
        CharSequence charSequenceV = this.g;
        if (rt2Var != null && rt2Var.M0() && !ch3.r(charSequenceV)) {
            Pattern pattern = rt2Var.h0() ? xoh.c : xoh.e;
            p4cVar2.getClass();
            Pattern pattern2 = soc.a;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequenceV);
            Matcher matcher = pattern.matcher(spannableStringBuilder);
            int iEnd = i3;
            while (matcher.find(iEnd)) {
                Matcher matcher2 = pattern2.matcher(spannableStringBuilder);
                int i6 = i3;
                while (matcher2.find() && matcher2.start() <= matcher.end()) {
                    if (matcher2.group().contains(matcher.group())) {
                        i6 = 1;
                    }
                }
                if (i6 != 0) {
                    iEnd = matcher.end();
                } else {
                    if (!matcher.group().contains("/\ufeff")) {
                        spannableStringBuilder.replace(matcher.start(), matcher.end(), (CharSequence) matcher.group().replace(String.valueOf('/'), "/\ufeff"));
                    }
                    iEnd = matcher.end();
                }
            }
            int i7 = jeg.a;
            charSequenceV = ku6.v(spannableStringBuilder);
        }
        this.g = charSequenceV;
        this.o = true;
    }
}
