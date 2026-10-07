package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class xmd {
    public final boolean a;
    public final boolean b;
    public final wmd c;
    public final wmd d;
    public final wmd e;
    public final wmd f;
    public final wmd g;
    public final wmd h;
    public final wmd i;
    public final wmd j;
    public final wmd k;

    public xmd(boolean z, boolean z2, wmd wmdVar, wmd wmdVar2, wmd wmdVar3, wmd wmdVar4, wmd wmdVar5, wmd wmdVar6, wmd wmdVar7, wmd wmdVar8, wmd wmdVar9) {
        this.a = z;
        this.b = z2;
        this.c = wmdVar;
        this.d = wmdVar2;
        this.e = wmdVar3;
        this.f = wmdVar4;
        this.g = wmdVar5;
        this.h = wmdVar6;
        this.i = wmdVar7;
        this.j = wmdVar8;
        this.k = wmdVar9;
    }

    public static xmd a(xmd xmdVar, boolean z, wmd wmdVar, wmd wmdVar2, wmd wmdVar3, wmd wmdVar4, wmd wmdVar5, wmd wmdVar6, wmd wmdVar7, wmd wmdVar8, wmd wmdVar9, int i) {
        boolean z2 = z;
        boolean z3 = xmdVar.a;
        if ((i & 8) != 0) {
            z2 = xmdVar.b;
        }
        if ((i & 16) != 0) {
            wmdVar = xmdVar.c;
        }
        if ((i & 32) != 0) {
            wmdVar2 = xmdVar.d;
        }
        if ((i & 64) != 0) {
            wmdVar3 = xmdVar.e;
        }
        if ((i & np0.m) != 0) {
            wmdVar4 = xmdVar.f;
        }
        if ((i & np0.n) != 0) {
            wmdVar5 = xmdVar.g;
        }
        if ((i & np0.o) != 0) {
            wmdVar6 = xmdVar.h;
        }
        if ((i & 1024) != 0) {
            wmdVar7 = xmdVar.i;
        }
        if ((i & np0.q) != 0) {
            wmdVar8 = xmdVar.j;
        }
        if ((i & np0.r) != 0) {
            wmdVar9 = xmdVar.k;
        }
        wmd wmdVar10 = wmdVar9;
        wmd wmdVar11 = wmdVar8;
        wmd wmdVar12 = wmdVar7;
        wmd wmdVar13 = wmdVar6;
        wmd wmdVar14 = wmdVar5;
        wmd wmdVar15 = wmdVar4;
        wmd wmdVar16 = wmdVar3;
        wmd wmdVar17 = wmdVar2;
        return new xmd(z3, z2, wmdVar, wmdVar17, wmdVar16, wmdVar15, wmdVar14, wmdVar13, wmdVar12, wmdVar11, wmdVar10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xmd)) {
            return false;
        }
        xmd xmdVar = (xmd) obj;
        return this.a == xmdVar.a && this.b == xmdVar.b && this.c.equals(xmdVar.c) && this.d.equals(xmdVar.d) && this.e.equals(xmdVar.e) && this.f.equals(xmdVar.f) && this.g.equals(xmdVar.g) && this.h.equals(xmdVar.h) && this.i.equals(xmdVar.i) && this.j.equals(xmdVar.j) && this.k.equals(xmdVar.k);
    }

    public final int hashCode() {
        return this.k.hashCode() + ((this.j.hashCode() + ((this.i.hashCode() + ((this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + nbh.n(nbh.n(nbh.n(Boolean.hashCode(this.a) * 31, 31, false), 31, false), 31, this.b)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sbB = zo5.B("ProfileEditAdminPermissionsModel(pinMessagesEnabled=", this.a, ", changeChatInfoEnabled=false, changeMembersEnabled=false, editLinkEnabled=", this.b, ", sendMessagePermState=");
        sbB.append(this.c);
        sbB.append(", editMessagePermState=");
        sbB.append(this.d);
        sbB.append(", readMessagePermState=");
        sbB.append(this.e);
        sbB.append(", deleteMessagePermState=");
        sbB.append(this.f);
        sbB.append(", pinMessagePermState=");
        sbB.append(this.g);
        sbB.append(", changeChatInfoPermState=");
        sbB.append(this.h);
        sbB.append(", controlMembersPermState=");
        sbB.append(this.i);
        sbB.append(", controlAdminsPermState=");
        sbB.append(this.j);
        sbB.append(", viewStats=");
        sbB.append(this.k);
        sbB.append(")");
        return sbB.toString();
    }
}
