package defpackage;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.view.View;
import java.io.IOException;
import one.me.members.list.MembersListWidget;

/* JADX INFO: loaded from: classes3.dex */
public final class zw9 extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public final /* synthetic */ long f;
    public /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zw9(long j, Object obj, Object obj2, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.f = j;
        this.g = obj;
        this.h = obj2;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        Object obj2 = this.h;
        switch (i) {
            case 0:
                zw9 zw9Var = new zw9((lx9) obj2, this.f, lq4Var, 0);
                zw9Var.g = obj;
                return zw9Var;
            case 1:
                return new zw9((AlarmManager) this.g, this.f, (PendingIntent) obj2, lq4Var, 1);
            case 2:
                zw9 zw9Var2 = new zw9(this.f, (mg5) obj2, lq4Var);
                zw9Var2.g = obj;
                return zw9Var2;
            case 3:
                zw9 zw9Var3 = new zw9((xyc) obj2, this.f, lq4Var, 3);
                zw9Var3.g = obj;
                return zw9Var3;
            case 4:
                return new zw9(this.f, (ix6) this.g, (oo6) obj2, lq4Var, 4);
            case 5:
                return new zw9((rb8) this.g, (mh7) obj2, this.f, lq4Var, 5);
            case 6:
                return new zw9((i99) this.g, this.f, (String) obj2, lq4Var, 6);
            case 7:
                zw9 zw9Var4 = new zw9((kl9) obj2, this.f, lq4Var, 7);
                zw9Var4.g = obj;
                return zw9Var4;
            case 8:
                return new zw9((MembersListWidget) this.g, this.f, (View) obj2, lq4Var, 8);
            case 9:
                return new zw9(this.f, (jsa) this.g, (String) obj2, lq4Var, 9);
            case 10:
                return new zw9((jsa) this.g, this.f, (x7e) obj2, lq4Var, 10);
            case 11:
                zw9 zw9Var5 = new zw9((xne) obj2, this.f, lq4Var, 11);
                zw9Var5.g = obj;
                return zw9Var5;
            case 12:
                return new zw9((cf7) this.g, this.f, (tpg) obj2, lq4Var, 12);
            default:
                return new zw9((dhj) this.g, (ioj) obj2, this.f, lq4Var, 13);
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) throws IOException {
        int i = this.e;
        sbi sbiVar = sbi.a;
        switch (i) {
            case 0:
                ((zw9) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 1:
                ((zw9) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 2:
                ((zw9) create((tw2) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 3:
                return ((zw9) create((vj4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 4:
                ((zw9) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 5:
                return ((zw9) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 6:
                ((zw9) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 7:
                ((zw9) create((vjd) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 8:
                ((zw9) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 9:
                ((zw9) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 10:
                ((zw9) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 11:
                return ((zw9) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 12:
                ((zw9) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            default:
                ((zw9) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
        }
    }

    /* JADX WARN: Code duplicated, block: B:134:0x0461  */
    /* JADX WARN: Code duplicated, block: B:135:0x0464  */
    /* JADX WARN: Code duplicated, block: B:138:0x0472  */
    /* JADX WARN: Code duplicated, block: B:140:0x04aa  */
    /* JADX WARN: Code duplicated, block: B:154:0x050e  */
    /* JADX WARN: Code duplicated, block: B:155:0x050f  */
    /* JADX WARN: Code duplicated, block: B:158:0x0516 A[Catch: all -> 0x0526, TryCatch #3 {all -> 0x0526, blocks: (B:143:0x04d6, B:146:0x04e3, B:149:0x04ef, B:152:0x04fb, B:156:0x0510, B:158:0x0516, B:164:0x052b, B:166:0x0531, B:170:0x0542, B:172:0x0548, B:176:0x0559, B:178:0x055f, B:180:0x0569, B:181:0x0571, B:183:0x0579, B:186:0x0585, B:188:0x0590, B:196:0x05a5, B:198:0x05b4, B:200:0x05c6, B:191:0x0597), top: B:312:0x04d6 }] */
    /* JADX WARN: Code duplicated, block: B:160:0x0525  */
    /* JADX WARN: Code duplicated, block: B:163:0x052a  */
    /* JADX WARN: Code duplicated, block: B:166:0x0531 A[Catch: all -> 0x0526, TryCatch #3 {all -> 0x0526, blocks: (B:143:0x04d6, B:146:0x04e3, B:149:0x04ef, B:152:0x04fb, B:156:0x0510, B:158:0x0516, B:164:0x052b, B:166:0x0531, B:170:0x0542, B:172:0x0548, B:176:0x0559, B:178:0x055f, B:180:0x0569, B:181:0x0571, B:183:0x0579, B:186:0x0585, B:188:0x0590, B:196:0x05a5, B:198:0x05b4, B:200:0x05c6, B:191:0x0597), top: B:312:0x04d6 }] */
    /* JADX WARN: Code duplicated, block: B:168:0x0540  */
    /* JADX WARN: Code duplicated, block: B:169:0x0541  */
    /* JADX WARN: Code duplicated, block: B:172:0x0548 A[Catch: all -> 0x0526, TryCatch #3 {all -> 0x0526, blocks: (B:143:0x04d6, B:146:0x04e3, B:149:0x04ef, B:152:0x04fb, B:156:0x0510, B:158:0x0516, B:164:0x052b, B:166:0x0531, B:170:0x0542, B:172:0x0548, B:176:0x0559, B:178:0x055f, B:180:0x0569, B:181:0x0571, B:183:0x0579, B:186:0x0585, B:188:0x0590, B:196:0x05a5, B:198:0x05b4, B:200:0x05c6, B:191:0x0597), top: B:312:0x04d6 }] */
    /* JADX WARN: Code duplicated, block: B:174:0x0557  */
    /* JADX WARN: Code duplicated, block: B:175:0x0558  */
    /* JADX WARN: Code duplicated, block: B:178:0x055f A[Catch: all -> 0x0526, TryCatch #3 {all -> 0x0526, blocks: (B:143:0x04d6, B:146:0x04e3, B:149:0x04ef, B:152:0x04fb, B:156:0x0510, B:158:0x0516, B:164:0x052b, B:166:0x0531, B:170:0x0542, B:172:0x0548, B:176:0x0559, B:178:0x055f, B:180:0x0569, B:181:0x0571, B:183:0x0579, B:186:0x0585, B:188:0x0590, B:196:0x05a5, B:198:0x05b4, B:200:0x05c6, B:191:0x0597), top: B:312:0x04d6 }] */
    /* JADX WARN: Code duplicated, block: B:180:0x0569 A[Catch: all -> 0x0526, TryCatch #3 {all -> 0x0526, blocks: (B:143:0x04d6, B:146:0x04e3, B:149:0x04ef, B:152:0x04fb, B:156:0x0510, B:158:0x0516, B:164:0x052b, B:166:0x0531, B:170:0x0542, B:172:0x0548, B:176:0x0559, B:178:0x055f, B:180:0x0569, B:181:0x0571, B:183:0x0579, B:186:0x0585, B:188:0x0590, B:196:0x05a5, B:198:0x05b4, B:200:0x05c6, B:191:0x0597), top: B:312:0x04d6 }] */
    /* JADX WARN: Code duplicated, block: B:183:0x0579 A[Catch: all -> 0x0526, TryCatch #3 {all -> 0x0526, blocks: (B:143:0x04d6, B:146:0x04e3, B:149:0x04ef, B:152:0x04fb, B:156:0x0510, B:158:0x0516, B:164:0x052b, B:166:0x0531, B:170:0x0542, B:172:0x0548, B:176:0x0559, B:178:0x055f, B:180:0x0569, B:181:0x0571, B:183:0x0579, B:186:0x0585, B:188:0x0590, B:196:0x05a5, B:198:0x05b4, B:200:0x05c6, B:191:0x0597), top: B:312:0x04d6 }] */
    /* JADX WARN: Code duplicated, block: B:184:0x0582  */
    /* JADX WARN: Code duplicated, block: B:186:0x0585 A[Catch: all -> 0x0526, TryCatch #3 {all -> 0x0526, blocks: (B:143:0x04d6, B:146:0x04e3, B:149:0x04ef, B:152:0x04fb, B:156:0x0510, B:158:0x0516, B:164:0x052b, B:166:0x0531, B:170:0x0542, B:172:0x0548, B:176:0x0559, B:178:0x055f, B:180:0x0569, B:181:0x0571, B:183:0x0579, B:186:0x0585, B:188:0x0590, B:196:0x05a5, B:198:0x05b4, B:200:0x05c6, B:191:0x0597), top: B:312:0x04d6 }] */
    /* JADX WARN: Code duplicated, block: B:187:0x058e  */
    /* JADX WARN: Code duplicated, block: B:196:0x05a5 A[Catch: all -> 0x0526, TryCatch #3 {all -> 0x0526, blocks: (B:143:0x04d6, B:146:0x04e3, B:149:0x04ef, B:152:0x04fb, B:156:0x0510, B:158:0x0516, B:164:0x052b, B:166:0x0531, B:170:0x0542, B:172:0x0548, B:176:0x0559, B:178:0x055f, B:180:0x0569, B:181:0x0571, B:183:0x0579, B:186:0x0585, B:188:0x0590, B:196:0x05a5, B:198:0x05b4, B:200:0x05c6, B:191:0x0597), top: B:312:0x04d6 }] */
    /* JADX WARN: Code duplicated, block: B:197:0x05b3  */
    /* JADX WARN: Code duplicated, block: B:233:0x0669  */
    /* JADX WARN: Code duplicated, block: B:235:0x066d  */
    /* JADX WARN: Code duplicated, block: B:238:0x0679  */
    /* JADX WARN: Code duplicated, block: B:312:0x04d6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:326:0x05c6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:328:0x046c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:334:0x0686 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:335:? A[LOOP:4: B:236:0x0673->B:335:?, LOOP_END, SYNTHETIC] */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r7v14 java.lang.Object, still in use, count: 2, list:
          (r7v14 java.lang.Object) from 0x045d: PHI (r7 I:??) = (r7v3 java.lang.Object), (r7v14 java.lang.Object) binds: [B:131:0x045c, B:322:0x045d] A[DONT_GENERATE, DONT_INLINE]
          (r7v14 java.lang.Object) from 0x0453: CHECK_CAST (kb9) (r7v14 java.lang.Object)
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
    public final java.lang.Object invokeSuspend(java.lang.Object r31) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 2170
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zw9.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zw9(long j, mg5 mg5Var, lq4 lq4Var) {
        super(2, lq4Var);
        this.e = 2;
        this.f = j;
        this.h = mg5Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zw9(Object obj, long j, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.h = obj;
        this.f = j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zw9(Object obj, long j, Object obj2, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = obj;
        this.f = j;
        this.h = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zw9(Object obj, Object obj2, long j, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = obj;
        this.h = obj2;
        this.f = j;
    }
}
