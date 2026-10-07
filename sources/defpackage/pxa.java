package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class pxa {
    public final String a;
    public final String b;
    public final long c;
    public final long d;
    public final boolean e;
    public final u8b f;
    public final b9b g;

    public pxa(String str, String str2, long j, long j2, boolean z, u8b u8bVar, b9b b9bVar) {
        this.a = str;
        this.b = str2;
        this.c = j;
        this.d = j2;
        this.e = z;
        this.f = u8bVar;
        this.g = b9bVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r25v0, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r5v19, types: [a4c] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final List a() {
        String str;
        ?? r5;
        List list;
        long jA;
        long jA2;
        int i;
        String str2 = wk8.f;
        String str3 = this.a;
        u8b u8bVar = this.f;
        je9 je9Var = je9.d;
        r66 r66Var = r66.a;
        je9 je9Var2 = je9.f;
        String str4 = wk8.f;
        List list2 = null;
        String str5 = "): ";
        if (u8bVar.b < 2) {
            a4c a4cVar = gm0.f;
            if (a4cVar != null && a4cVar.b(je9Var2)) {
                a4cVar.c(je9Var2, "wk8", "(" + str3 + "): " + ((Object) ("Not enough spans for build: spans->" + u8bVar)), null);
                return r66Var;
            }
        } else {
            if (u8bVar.i()) {
                gol.f("ObjectList is empty.");
                throw null;
            }
            if (u8bVar.a[0] instanceof zdg) {
                a4c a4cVar2 = gm0.f;
                if (a4cVar2 != null && a4cVar2.b(je9Var)) {
                    a4cVar2.c(je9Var, "wk8", "(" + str3 + "): " + ((Object) ("metric->" + str3 + ", spans->" + u8bVar)), null);
                }
                ArrayList arrayList = new ArrayList(u8bVar.b);
                ArrayList arrayList2 = new ArrayList(u8bVar.b);
                int i2 = u8bVar.b;
                for (int i3 = 0; i3 < i2; i3++) {
                    aeg aegVar = (aeg) u8bVar.g(i3);
                    if ((aegVar instanceof ydg) || (aegVar instanceof vdg) || (aegVar instanceof udg)) {
                        wk8.l(arrayList2, arrayList);
                        arrayList.add(aegVar);
                        arrayList2.clear();
                    } else if (aegVar instanceof zdg) {
                        if (!arrayList2.isEmpty()) {
                            wk8.l(arrayList2, arrayList);
                            arrayList2.clear();
                        }
                        arrayList2.add(aegVar);
                    } else {
                        if (!(aegVar instanceof xdg)) {
                            ore.o();
                            return null;
                        }
                        arrayList2.add(aegVar);
                    }
                }
                wk8.l(arrayList2, arrayList);
                ArrayList arrayList3 = new ArrayList();
                q8b q8bVar = new q8b();
                aeg aegVar2 = (aeg) ww3.r1(arrayList);
                int size = arrayList.size();
                int i4 = 0;
                int i5 = 1;
                long j = 0;
                while (i5 < size) {
                    aeg aegVar3 = (aeg) arrayList.get(i5);
                    if (aegVar3 instanceof xdg) {
                        xdg xdgVar = (xdg) aegVar3;
                        list = list2;
                        long jA3 = xdgVar.c - aegVar2.a();
                        int iC = q8bVar.c(-1, xdgVar.a);
                        if (iC < 0 || ((deg) arrayList3.get(iC)).c >= i4) {
                            q8bVar.e(arrayList3.size(), xdgVar.a);
                            i = i4;
                            arrayList3.add(new deg(jA3, xdgVar.a, xdgVar.b, i));
                        } else {
                            ((deg) arrayList3.get(iC)).d += jA3;
                            i = i4;
                        }
                        i4 = i;
                    } else {
                        list = list2;
                        size = size;
                        int i6 = i4;
                        if (aegVar3 instanceof zdg) {
                            if ((aegVar2 instanceof xdg) || (aegVar2 instanceof ydg)) {
                                jA = ((zdg) aegVar3).a;
                                jA2 = aegVar2.a();
                            }
                            i4 = i6 + 1;
                        } else {
                            if (!(aegVar3 instanceof vdg) && !(aegVar3 instanceof udg) && !(aegVar3 instanceof ydg)) {
                                ore.o();
                                return list;
                            }
                            jA = aegVar3.a();
                            jA2 = aegVar2.a();
                        }
                        j = (jA - jA2) + j;
                        i4 = i6 + 1;
                    }
                    i5++;
                    size = size;
                    aegVar2 = aegVar3;
                    list2 = list;
                    str5 = str5;
                }
                ?? r25 = list2;
                String str6 = str5;
                if (arrayList3.isEmpty() && (r5 = gm0.f) != 0 && r5.b(je9Var2)) {
                    StringBuilder sb = new StringBuilder("(");
                    sb.append(str3);
                    str = str6;
                    sb.append(str);
                    sb.append((Object) ("No regular spans to build, only root will be reported: spans->" + arrayList));
                    r5.c(je9Var2, "wk8", sb.toString(), r25);
                } else {
                    str = str6;
                }
                if (arrayList3.size() > 1) {
                    bx3.Y0(arrayList3, new o6(12));
                }
                int size2 = arrayList3.size();
                long j2 = 0;
                for (int i7 = 0; i7 < size2; i7++) {
                    j2 += ((deg) arrayList3.get(i7)).d;
                }
                ArrayList arrayList4 = new ArrayList(arrayList3.size() + 1);
                arrayList4.add(new ylc(str3, Long.valueOf(j2 + j)));
                int size3 = arrayList3.size();
                for (int i8 = 0; i8 < size3; i8++) {
                    arrayList4.add(new ylc(((deg) arrayList3.get(i8)).a, Long.valueOf(((deg) arrayList3.get(i8)).d)));
                }
                a4c a4cVar3 = gm0.f;
                if (a4cVar3 != null && a4cVar3.b(je9Var)) {
                    a4cVar3.c(je9Var, "wk8", "(" + str3 + str + ((Object) ("Final spans: " + arrayList4)), null);
                }
                return arrayList4;
            }
            a4c a4cVar4 = gm0.f;
            if (a4cVar4 != null && a4cVar4.b(je9Var2)) {
                a4cVar4.c(je9Var2, "wk8", c0a.o("(", str3, "): First span is not 'start'!"), null);
            }
        }
        return r66Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pxa)) {
            return false;
        }
        pxa pxaVar = (pxa) obj;
        return cqk.d(this.a, pxaVar.a) && cqk.d(this.b, pxaVar.b) && this.c == pxaVar.c && ew5.f(this.d, pxaVar.d) && this.e == pxaVar.e && this.f.equals(pxaVar.f) && this.g.equals(pxaVar.g);
    }

    public final int hashCode() {
        int iG = qt4.g(zo5.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        ghb ghbVar = ew5.b;
        return this.g.hashCode() + ((this.f.hashCode() + nbh.n(qt4.g(iG, 31, this.d), 31, this.e)) * 31);
    }

    public final String toString() {
        String strA = owh.a(this.b);
        String strT = ew5.t(this.d);
        StringBuilder sbQ = qv1.q("Metric(name=", this.a, ", traceId=", strA, ", persistAttempt=");
        qv1.s(this.c, ", lastPersistUpdate=", strT, sbQ);
        sbQ.append(", isPersistFailed=");
        sbQ.append(this.e);
        sbQ.append(", rawSpans=");
        sbQ.append(this.f);
        sbQ.append(", localProperties=");
        sbQ.append(this.g);
        sbQ.append(")");
        return sbQ.toString();
    }
}
