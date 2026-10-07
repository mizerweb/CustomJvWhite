package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class m34 extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m34(int i, lq4 lq4Var, Comparable comparable, Object obj, Object obj2, Object obj3, Object obj4) {
        super(2, lq4Var);
        this.e = i;
        this.f = obj;
        this.g = comparable;
        this.h = obj2;
        this.i = obj3;
        this.j = obj4;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        Object obj2 = this.j;
        Object obj3 = this.i;
        Object obj4 = this.h;
        Object obj5 = this.g;
        switch (i) {
            case 0:
                return new m34(0, lq4Var, (s04) obj5, (n34) this.f, (CharSequence) obj4, (g4b) obj3, (Long) obj2);
            case 1:
                m34 m34Var = new m34(1, lq4Var, (gh7) obj5, (rb8) obj4, (px8) obj3, (ConcurrentHashMap) obj2);
                m34Var.f = obj;
                return m34Var;
            case 2:
                m34 m34Var2 = new m34(2, lq4Var, (kwb) obj5, (Drawable) obj4, (cf7) obj3, (cf7) obj2);
                m34Var2.f = obj;
                return m34Var2;
            default:
                return new m34(3, lq4Var, (File) obj5, (File) this.f, (ju6) obj4, (Context) obj3, (Bitmap) obj2);
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) throws IOException {
        int i = this.e;
        sbi sbiVar = sbi.a;
        switch (i) {
            case 0:
                ((m34) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 1:
                ((m34) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 2:
                ((m34) create((fef) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            default:
                return ((m34) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01f0 A[Catch: all -> 0x0166, TryCatch #2 {all -> 0x0166, blocks: (B:42:0x00fb, B:45:0x010a, B:48:0x0115, B:51:0x0120, B:54:0x012b, B:57:0x0136, B:61:0x014b, B:63:0x0151, B:70:0x016d, B:72:0x0173, B:74:0x0179, B:76:0x0191, B:80:0x019c, B:82:0x01a2, B:85:0x01b2, B:91:0x01c9, B:92:0x01d5, B:94:0x01db, B:98:0x01ec, B:100:0x01f0, B:101:0x01f2, B:110:0x0209, B:112:0x0214, B:114:0x0237, B:119:0x0243, B:120:0x025c, B:122:0x0271, B:129:0x0296, B:131:0x02a5, B:105:0x01fd, B:106:0x0200, B:107:0x0203, B:88:0x01bb), top: B:148:0x00fb }] */
    /* JADX WARN: Code duplicated, block: B:104:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:105:0x01fd A[Catch: all -> 0x0166, TRY_ENTER, TryCatch #2 {all -> 0x0166, blocks: (B:42:0x00fb, B:45:0x010a, B:48:0x0115, B:51:0x0120, B:54:0x012b, B:57:0x0136, B:61:0x014b, B:63:0x0151, B:70:0x016d, B:72:0x0173, B:74:0x0179, B:76:0x0191, B:80:0x019c, B:82:0x01a2, B:85:0x01b2, B:91:0x01c9, B:92:0x01d5, B:94:0x01db, B:98:0x01ec, B:100:0x01f0, B:101:0x01f2, B:110:0x0209, B:112:0x0214, B:114:0x0237, B:119:0x0243, B:120:0x025c, B:122:0x0271, B:129:0x0296, B:131:0x02a5, B:105:0x01fd, B:106:0x0200, B:107:0x0203, B:88:0x01bb), top: B:148:0x00fb }] */
    /* JADX WARN: Code duplicated, block: B:106:0x0200 A[Catch: all -> 0x0166, TryCatch #2 {all -> 0x0166, blocks: (B:42:0x00fb, B:45:0x010a, B:48:0x0115, B:51:0x0120, B:54:0x012b, B:57:0x0136, B:61:0x014b, B:63:0x0151, B:70:0x016d, B:72:0x0173, B:74:0x0179, B:76:0x0191, B:80:0x019c, B:82:0x01a2, B:85:0x01b2, B:91:0x01c9, B:92:0x01d5, B:94:0x01db, B:98:0x01ec, B:100:0x01f0, B:101:0x01f2, B:110:0x0209, B:112:0x0214, B:114:0x0237, B:119:0x0243, B:120:0x025c, B:122:0x0271, B:129:0x0296, B:131:0x02a5, B:105:0x01fd, B:106:0x0200, B:107:0x0203, B:88:0x01bb), top: B:148:0x00fb }] */
    /* JADX WARN: Code duplicated, block: B:107:0x0203 A[Catch: all -> 0x0166, TryCatch #2 {all -> 0x0166, blocks: (B:42:0x00fb, B:45:0x010a, B:48:0x0115, B:51:0x0120, B:54:0x012b, B:57:0x0136, B:61:0x014b, B:63:0x0151, B:70:0x016d, B:72:0x0173, B:74:0x0179, B:76:0x0191, B:80:0x019c, B:82:0x01a2, B:85:0x01b2, B:91:0x01c9, B:92:0x01d5, B:94:0x01db, B:98:0x01ec, B:100:0x01f0, B:101:0x01f2, B:110:0x0209, B:112:0x0214, B:114:0x0237, B:119:0x0243, B:120:0x025c, B:122:0x0271, B:129:0x0296, B:131:0x02a5, B:105:0x01fd, B:106:0x0200, B:107:0x0203, B:88:0x01bb), top: B:148:0x00fb }] */
    /* JADX WARN: Code duplicated, block: B:110:0x0209 A[Catch: all -> 0x0166, TryCatch #2 {all -> 0x0166, blocks: (B:42:0x00fb, B:45:0x010a, B:48:0x0115, B:51:0x0120, B:54:0x012b, B:57:0x0136, B:61:0x014b, B:63:0x0151, B:70:0x016d, B:72:0x0173, B:74:0x0179, B:76:0x0191, B:80:0x019c, B:82:0x01a2, B:85:0x01b2, B:91:0x01c9, B:92:0x01d5, B:94:0x01db, B:98:0x01ec, B:100:0x01f0, B:101:0x01f2, B:110:0x0209, B:112:0x0214, B:114:0x0237, B:119:0x0243, B:120:0x025c, B:122:0x0271, B:129:0x0296, B:131:0x02a5, B:105:0x01fd, B:106:0x0200, B:107:0x0203, B:88:0x01bb), top: B:148:0x00fb }] */
    /* JADX WARN: Code duplicated, block: B:111:0x0213  */
    /* JADX WARN: Code duplicated, block: B:114:0x0237 A[Catch: all -> 0x0166, TryCatch #2 {all -> 0x0166, blocks: (B:42:0x00fb, B:45:0x010a, B:48:0x0115, B:51:0x0120, B:54:0x012b, B:57:0x0136, B:61:0x014b, B:63:0x0151, B:70:0x016d, B:72:0x0173, B:74:0x0179, B:76:0x0191, B:80:0x019c, B:82:0x01a2, B:85:0x01b2, B:91:0x01c9, B:92:0x01d5, B:94:0x01db, B:98:0x01ec, B:100:0x01f0, B:101:0x01f2, B:110:0x0209, B:112:0x0214, B:114:0x0237, B:119:0x0243, B:120:0x025c, B:122:0x0271, B:129:0x0296, B:131:0x02a5, B:105:0x01fd, B:106:0x0200, B:107:0x0203, B:88:0x01bb), top: B:148:0x00fb }] */
    /* JADX WARN: Code duplicated, block: B:116:0x023e  */
    /* JADX WARN: Code duplicated, block: B:117:0x023f  */
    /* JADX WARN: Code duplicated, block: B:118:0x0242  */
    /* JADX WARN: Code duplicated, block: B:122:0x0271 A[Catch: all -> 0x0166, TryCatch #2 {all -> 0x0166, blocks: (B:42:0x00fb, B:45:0x010a, B:48:0x0115, B:51:0x0120, B:54:0x012b, B:57:0x0136, B:61:0x014b, B:63:0x0151, B:70:0x016d, B:72:0x0173, B:74:0x0179, B:76:0x0191, B:80:0x019c, B:82:0x01a2, B:85:0x01b2, B:91:0x01c9, B:92:0x01d5, B:94:0x01db, B:98:0x01ec, B:100:0x01f0, B:101:0x01f2, B:110:0x0209, B:112:0x0214, B:114:0x0237, B:119:0x0243, B:120:0x025c, B:122:0x0271, B:129:0x0296, B:131:0x02a5, B:105:0x01fd, B:106:0x0200, B:107:0x0203, B:88:0x01bb), top: B:148:0x00fb }] */
    /* JADX WARN: Code duplicated, block: B:124:0x028e A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:128:0x0294  */
    /* JADX WARN: Code duplicated, block: B:130:0x02a2  */
    /* JADX WARN: Code duplicated, block: B:156:0x02ba A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:157:0x0207 A[SYNTHETIC] */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v25 java.lang.Object, still in use, count: 2, list:
          (r2v25 java.lang.Object) from 0x01ec: PHI (r2 I:??) = (r2v8 java.lang.Object), (r2v25 java.lang.Object) binds: [B:97:0x01eb, B:96:0x01ea] A[DONT_GENERATE, DONT_INLINE]
          (r2v25 java.lang.Object) from 0x01e0: CHECK_CAST (sya) (r2v25 java.lang.Object)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    @Override // defpackage.mq0
    public final java.lang.Object invokeSuspend(java.lang.Object r32) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 820
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m34.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m34(int i, lq4 lq4Var, Object obj, Object obj2, Object obj3, Object obj4) {
        super(2, lq4Var);
        this.e = i;
        this.g = obj;
        this.h = obj2;
        this.i = obj3;
        this.j = obj4;
    }
}
