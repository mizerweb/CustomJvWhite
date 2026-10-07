package defpackage;

import one.me.appearancesettings.multitheme.AppearanceSettingsMultiThemeScreen;
import org.json.JSONException;

/* JADX INFO: loaded from: classes2.dex */
public final class dv extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ AppearanceSettingsMultiThemeScreen g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dv(lq4 lq4Var, AppearanceSettingsMultiThemeScreen appearanceSettingsMultiThemeScreen, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = appearanceSettingsMultiThemeScreen;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        AppearanceSettingsMultiThemeScreen appearanceSettingsMultiThemeScreen = this.g;
        switch (i) {
            case 0:
                dv dvVar = new dv(lq4Var, appearanceSettingsMultiThemeScreen, 0);
                dvVar.f = obj;
                return dvVar;
            default:
                dv dvVar2 = new dv(lq4Var, appearanceSettingsMultiThemeScreen, 1);
                dvVar2.f = obj;
                return dvVar2;
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) throws JSONException {
        int i = this.e;
        sbi sbiVar = sbi.a;
        lq4 lq4Var = (lq4) obj2;
        switch (i) {
            case 0:
                ((dv) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            default:
                ((dv) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
        }
        return sbiVar;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:102:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:103:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:104:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:105:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:106:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:107:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:108:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:112:0x0219  */
    /* JADX WARN: Code duplicated, block: B:118:0x0230  */
    /* JADX WARN: Code duplicated, block: B:121:0x0248  */
    /* JADX WARN: Code duplicated, block: B:127:0x0074 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:129:0x0097 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:132:0x00ef A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:138:0x022a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:140:? A[LOOP:5: B:110:0x0213->B:140:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:16:0x0062  */
    /* JADX WARN: Code duplicated, block: B:22:0x007b  */
    /* JADX WARN: Code duplicated, block: B:25:0x008b  */
    /* JADX WARN: Code duplicated, block: B:31:0x009e  */
    /* JADX WARN: Code duplicated, block: B:33:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:34:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:37:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:38:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:40:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:42:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:45:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:51:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:53:0x0100  */
    /* JADX WARN: Code duplicated, block: B:54:0x0105  */
    /* JADX WARN: Code duplicated, block: B:57:0x0112  */
    /* JADX WARN: Code duplicated, block: B:58:0x0114  */
    /* JADX WARN: Code duplicated, block: B:60:0x011a  */
    /* JADX WARN: Code duplicated, block: B:63:0x0127 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:64:0x0129  */
    /* JADX WARN: Code duplicated, block: B:65:0x0132  */
    /* JADX WARN: Code duplicated, block: B:67:0x0135  */
    /* JADX WARN: Code duplicated, block: B:68:0x013a  */
    /* JADX WARN: Code duplicated, block: B:72:0x0144  */
    /* JADX WARN: Code duplicated, block: B:74:0x014e  */
    /* JADX WARN: Code duplicated, block: B:87:0x019d  */
    /* JADX WARN: Code duplicated, block: B:89:0x01a5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:90:0x01a7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:91:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:93:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:95:0x01af  */
    /* JADX WARN: Code duplicated, block: B:97:0x01b2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:98:0x01b4  */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r6v10 java.lang.Object, still in use, count: 2, list:
          (r6v10 java.lang.Object) from 0x0195: PHI (r6 I:??) = (r6v1 java.lang.Object), (r6v10 java.lang.Object) binds: [B:83:0x0194, B:135:0x0195] A[DONT_GENERATE, DONT_INLINE]
          (r6v10 java.lang.Object) from 0x018d: CHECK_CAST (aqh) (r6v10 java.lang.Object)
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
    public final java.lang.Object invokeSuspend(java.lang.Object r11) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 608
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dv.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
