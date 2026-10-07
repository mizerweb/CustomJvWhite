package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class hzf implements q2i {
    public final /* synthetic */ r2i a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ r2i c;
    public final /* synthetic */ List d;
    public final /* synthetic */ r2i e;
    public final /* synthetic */ ArrayList f;

    public hzf(r2i r2iVar, ArrayList arrayList, r2i r2iVar2, ArrayList arrayList2, r2i r2iVar3, ArrayList arrayList3) {
        this.a = r2iVar;
        this.b = arrayList;
        this.c = r2iVar2;
        this.d = arrayList2;
        this.e = r2iVar3;
        this.f = arrayList3;
    }

    @Override // defpackage.q2i
    public final void a(r2i r2iVar) {
        List list;
        r2i r2iVar2 = this.a;
        if (r2iVar2 != null) {
            lzl.f(r2iVar2, this.b, null);
        }
        r2i r2iVar3 = this.c;
        if (r2iVar3 != null && (list = this.d) != null) {
            lzl.f(r2iVar3, list, null);
        }
        r2i r2iVar4 = this.e;
        if (r2iVar4 != null) {
            lzl.f(r2iVar4, this.f, null);
        }
    }

    @Override // defpackage.q2i
    public final void b() {
    }

    @Override // defpackage.q2i
    public final void c(r2i r2iVar) {
    }

    @Override // defpackage.q2i
    public final void d() {
    }

    @Override // defpackage.q2i
    public final void e(r2i r2iVar) {
    }
}
