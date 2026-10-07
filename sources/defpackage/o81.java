package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes2.dex */
public final class o81 {
    public final LinkedHashSet a;
    public final ArrayList b;
    public final ArrayList c;
    public final ArrayList d;
    public final ArrayList e;
    public final q4h f;
    public final cli g;
    public final HashMap h;
    public final s4h i;
    public final s4h j;

    public o81(LinkedHashSet linkedHashSet, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, q4h q4hVar, cli cliVar, HashMap map, s4h s4hVar, s4h s4hVar2) {
        this.a = linkedHashSet;
        this.b = arrayList;
        this.c = arrayList2;
        this.d = arrayList3;
        this.e = arrayList4;
        this.f = q4hVar;
        this.g = cliVar;
        this.h = map;
        this.i = s4hVar;
        this.j = s4hVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o81)) {
            return false;
        }
        o81 o81Var = (o81) obj;
        return this.a.equals(o81Var.a) && this.b.equals(o81Var.b) && this.c.equals(o81Var.c) && this.d.equals(o81Var.d) && this.e.equals(o81Var.e) && cqk.d(this.f, o81Var.f) && cqk.d(this.g, o81Var.g) && this.h.equals(o81Var.h) && cqk.d(this.i, o81Var.i) && cqk.d(this.j, o81Var.j);
    }

    public final int hashCode() {
        int iB = x05.b(this.e, x05.b(this.d, x05.b(this.c, x05.b(this.b, this.a.hashCode() * 31, 31), 31), 31), 31);
        q4h q4hVar = this.f;
        int iHashCode = (iB + (q4hVar == null ? 0 : q4hVar.hashCode())) * 31;
        cli cliVar = this.g;
        int iHashCode2 = (this.i.hashCode() + ((this.h.hashCode() + ((iHashCode + (cliVar == null ? 0 : cliVar.hashCode())) * 31)) * 31)) * 31;
        s4h s4hVar = this.j;
        return iHashCode2 + (s4hVar != null ? s4hVar.hashCode() : 0);
    }

    public final String toString() {
        return "CalculatedUseCaseInfo(appUseCases=" + this.a + ", cameraUseCases=" + this.b + ", cameraUseCasesToAttach=" + this.c + ", cameraUseCasesToKeep=" + this.d + ", cameraUseCasesToDetach=" + this.e + ", streamSharing=" + this.f + ", placeholderForExtensions=" + this.g + ", useCaseConfigs=" + this.h + ", primaryStreamSpecResult=" + this.i + ", secondaryStreamSpecResult=" + this.j + ')';
    }
}
