package defpackage;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;
import java.util.regex.Pattern;
import one.me.mediaeditor.MediaEditScreen;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class t86 implements af7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ t86(int i, String str, ka6 ka6Var) {
        this.a = 1;
        this.b = i;
        this.c = str;
        this.d = ka6Var;
    }

    @Override // defpackage.af7
    public final Object invoke() {
        mj0 mj0Var;
        mj0 mj0Var2 = null;
        boolean z = true;
        switch (this.a) {
            case 0:
                nf2 nf2Var = (nf2) this.c;
                int i = this.b;
                bwi bwiVar = (bwi) this.d;
                nf2 nf2Var2 = nf2Var;
                int i2 = i == 2 ? 2 : 1;
                p86 p86VarF = nf2Var2.F();
                if (i2 != 2) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    TreeMap treeMap = new TreeMap(new x44(false));
                    pi0 pi0Var = pi0.e;
                    for (pi0 pi0Var2 : new ArrayList(pi0.m)) {
                        qyj.l("Currently only support ConstantQuality", pi0Var2 instanceof pi0);
                        r86 r86VarB = p86VarF.b(pi0Var2.a(i2));
                        if (r86VarB != null) {
                            tvj.a("CapabilitiesByQuality", "profiles = " + r86VarB);
                            if (r86VarB.b().isEmpty()) {
                                mj0Var = mj0Var2;
                            } else {
                                int iA = r86VarB.a();
                                int iC = r86VarB.c();
                                List listD = r86VarB.d();
                                List listB = r86VarB.b();
                                qyj.h("Should contain at least one VideoProfile.", !listB.isEmpty());
                                mj0Var = new mj0(iA, iC, Collections.unmodifiableList(new ArrayList(listD)), Collections.unmodifiableList(new ArrayList(listB)), !listD.isEmpty() ? (gh0) listD.get(0) : null, (ih0) listB.get(0));
                            }
                            if (mj0Var == null) {
                                tvj.g("CapabilitiesByQuality", "EncoderProfiles of quality " + pi0Var2 + " has no video validated profiles.");
                            } else {
                                treeMap.put(mj0Var.f.a(), pi0Var2);
                                linkedHashMap.put(pi0Var2, mj0Var);
                            }
                            mj0Var2 = null;
                        }
                    }
                    if (linkedHashMap.isEmpty()) {
                        tvj.c("CapabilitiesByQuality", "No supported EncoderProfiles");
                    } else {
                        ArrayDeque arrayDeque = new ArrayDeque(linkedHashMap.values());
                    }
                    if (new ArrayList(linkedHashMap.keySet()).isEmpty()) {
                        tvj.g("EncoderProfilesResolver", "Camera EncoderProfilesProvider doesn't contain any supported Quality.");
                        p86VarF = new na5(nf2Var2, xw3.P0(pi0.g, pi0.f, pi0.e), bwiVar);
                    }
                    s2e s2eVar = sk5.a;
                    vn0 vn0Var = new vn0(new e1e(p86VarF, s2eVar, nf2Var2, bwiVar), s2eVar);
                    Set<fx5> setC = nf2Var2.c();
                    if (!setC.isEmpty()) {
                        for (fx5 fx5Var : setC) {
                            if (fx5Var.a == 3 && fx5Var.b == 10) {
                                vn0Var = new vn0(vn0Var, bwiVar);
                            }
                        }
                    }
                    p86VarF = new n1e(vn0Var, nf2Var2, s2eVar);
                } else if (!nf2Var2.x()) {
                    p86VarF = p86.a;
                }
                return new s86(p86VarF, i2, nf2Var2.c());
            case 1:
                int i3 = this.b;
                String str = (String) this.c;
                ka6 ka6Var = (ka6) this.d;
                fif[] fifVarArr = new fif[i3];
                for (int i4 = 0; i4 < i3; i4++) {
                    fifVarArr[i4] = yab.m(str + '.' + ka6Var.e[i4], d6h.f, new fif[0]);
                }
                return fifVarArr;
            case 2:
                MediaEditScreen mediaEditScreen = (MediaEditScreen) this.c;
                int i5 = this.b;
                qw9 qw9Var = (qw9) this.d;
                if (mediaEditScreen.getViewLifecycleOwner().f().d.a(n09.d)) {
                    String name = MediaEditScreen.class.getName();
                    a4c a4cVar = gm0.f;
                    if (a4cVar != null) {
                        je9 je9Var = je9.d;
                        if (a4cVar.b(je9Var)) {
                            a4cVar.c(je9Var, name, "New MediaEditScreen. Pager, after submitList lifecycle=" + mediaEditScreen.getViewLifecycleOwner().f().d + " prevItemsA:" + i5 + ", itemsA:" + mediaEditScreen.q1.l() + ", items:" + qw9Var.a.size(), null);
                        }
                    }
                    yab.i0(mediaEditScreen.getViewLifecycleScope(), null, 0, new el6(mediaEditScreen, qw9Var, null, 27), 3);
                }
                return sbi.a;
            case 3:
                gba gbaVar = (gba) this.c;
                int i6 = this.b;
                y5e y5eVar = (y5e) this.d;
                gbaVar.invoke();
                if (i6 == y5eVar.k && !y5eVar.isLaidOut()) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 4:
                return ((wcg) this.c).c.createSocket((String) this.d, this.b);
            default:
                String str2 = (String) this.c;
                int i7 = this.b;
                uii uiiVar = (uii) this.d;
                Pattern pattern = l9h.b;
                return ttl.a(str2, i7, (lx2) uiiVar.b);
        }
    }

    public /* synthetic */ t86(wcg wcgVar, String str, int i) {
        this.a = 4;
        this.c = wcgVar;
        this.d = str;
        this.b = i;
    }

    public /* synthetic */ t86(Object obj, int i, Object obj2, int i2) {
        this.a = i2;
        this.c = obj;
        this.b = i;
        this.d = obj2;
    }
}
