package defpackage;

import java.util.Iterator;
import java.util.List;
import org.webrtc.MediaStreamTrack;

/* JADX INFO: loaded from: classes3.dex */
public final class k5j extends wed {
    public final pzf j;
    public final q8e k;
    public final int l;
    public final int m;
    public final boolean n;
    public final /* synthetic */ n5j o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k5j(n5j n5jVar, ite iteVar) {
        super(iteVar, MediaStreamTrack.VIDEO_TRACK_KIND, -2, 2);
        this.o = n5jVar;
        pzf pzfVarB = e9i.b(0, 1, 1);
        this.j = pzfVarB;
        this.k = new q8e(pzfVarB);
        this.l = 1;
        this.m = 1;
        this.n = true;
    }

    @Override // defpackage.wed
    public final int i() {
        return this.m;
    }

    @Override // defpackage.wed
    public final int j() {
        return this.l;
    }

    @Override // defpackage.wed
    public final boolean k() {
        return this.n;
    }

    @Override // defpackage.wed
    public final long l() {
        ghb ghbVar = ew5.b;
        return ew5.c;
    }

    @Override // defpackage.wed
    public final /* bridge */ /* synthetic */ Object n(Object obj, List list, Object obj2, qed qedVar) {
        return u(((Number) obj).longValue(), list, qedVar);
    }

    @Override // defpackage.wed
    public final /* bridge */ /* synthetic */ Object o(Object obj, List list, gz gzVar) {
        return v(((Number) obj).longValue(), list, gzVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object u(long j, List list, lq4 lq4Var) {
        i5j i5jVar;
        Iterator it;
        if (lq4Var instanceof i5j) {
            i5jVar = (i5j) lq4Var;
            int i = i5jVar.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                i5jVar.h = i - Integer.MIN_VALUE;
            } else {
                i5jVar = new i5j(this, (nq4) lq4Var);
            }
        } else {
            i5jVar = new i5j(this, (nq4) lq4Var);
        }
        Object obj = i5jVar.f;
        int i2 = i5jVar.h;
        if (i2 == 0) {
            ch3.d0(obj);
            it = list.iterator();
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j = i5jVar.d;
            it = i5jVar.e;
            ch3.d0(obj);
        }
        while (it.hasNext()) {
            iwi iwiVar = new iwi(((h5j) it.next()).a);
            i5jVar.e = it;
            i5jVar.d = j;
            i5jVar.h = 1;
            Object objEmit = this.j.emit(iwiVar, i5jVar);
            hu4 hu4Var = hu4.a;
            if (objEmit == hu4Var) {
                return hu4Var;
            }
        }
        return sbi.a;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:31:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:32:0x00da  */
    /* JADX WARN: Code duplicated, block: B:35:0x0108  */
    /* JADX WARN: Code duplicated, block: B:38:0x0116 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:40:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x00d1 -> B:37:0x010f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x0108 -> B:36:0x010c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object v(long r21, java.util.List r23, defpackage.lq4 r24) {
        /*
            Method dump skipped, instruction units count: 279
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k5j.v(long, java.util.List, lq4):java.lang.Object");
    }
}
