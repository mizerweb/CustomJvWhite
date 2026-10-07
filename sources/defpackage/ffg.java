package defpackage;

import android.graphics.Bitmap;
import java.io.File;

/* JADX INFO: loaded from: classes3.dex */
public final class ffg extends mdh implements qf7 {
    public u8b e;
    public e3h f;
    public Object g;
    public u8b h;
    public Bitmap i;
    public gfg j;
    public d3h k;
    public Object[] l;
    public File m;
    public int n;
    public int o;
    public int p;
    public int q;
    public int r;
    public /* synthetic */ Object s;
    public final /* synthetic */ gfg t;
    public final /* synthetic */ d3h u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ffg(gfg gfgVar, d3h d3hVar, lq4 lq4Var) {
        super(2, lq4Var);
        this.t = gfgVar;
        this.u = d3hVar;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        ffg ffgVar = new ffg(this.t, this.u, lq4Var);
        ffgVar.s = obj;
        return ffgVar;
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        return ((ffg) create((njd) obj, (lq4) obj2)).invokeSuspend(sbi.a);
    }

    /* JADX WARN: Code duplicated, block: B:110:0x0388 A[Catch: all -> 0x038f, TryCatch #6 {all -> 0x038f, blocks: (B:108:0x031e, B:110:0x0388, B:115:0x0399, B:118:0x03a2, B:121:0x03ab, B:123:0x03b2, B:166:0x04e0), top: B:191:0x031e }] */
    /* JADX WARN: Code duplicated, block: B:113:0x0393  */
    /* JADX WARN: Code duplicated, block: B:115:0x0399 A[Catch: all -> 0x038f, TryCatch #6 {all -> 0x038f, blocks: (B:108:0x031e, B:110:0x0388, B:115:0x0399, B:118:0x03a2, B:121:0x03ab, B:123:0x03b2, B:166:0x04e0), top: B:191:0x031e }] */
    /* JADX WARN: Code duplicated, block: B:116:0x039e  */
    /* JADX WARN: Code duplicated, block: B:118:0x03a2 A[Catch: all -> 0x038f, TryCatch #6 {all -> 0x038f, blocks: (B:108:0x031e, B:110:0x0388, B:115:0x0399, B:118:0x03a2, B:121:0x03ab, B:123:0x03b2, B:166:0x04e0), top: B:191:0x031e }] */
    /* JADX WARN: Code duplicated, block: B:119:0x03a7  */
    /* JADX WARN: Code duplicated, block: B:121:0x03ab A[Catch: all -> 0x038f, TryCatch #6 {all -> 0x038f, blocks: (B:108:0x031e, B:110:0x0388, B:115:0x0399, B:118:0x03a2, B:121:0x03ab, B:123:0x03b2, B:166:0x04e0), top: B:191:0x031e }] */
    /* JADX WARN: Code duplicated, block: B:122:0x03b0  */
    /* JADX WARN: Code duplicated, block: B:127:0x0414  */
    /* JADX WARN: Code duplicated, block: B:130:0x0428 A[Catch: all -> 0x0450, TryCatch #1 {all -> 0x0450, blocks: (B:128:0x0420, B:130:0x0428, B:138:0x0455, B:141:0x045d, B:143:0x0463, B:146:0x046a, B:148:0x0470, B:149:0x0487, B:151:0x048e, B:153:0x0498, B:156:0x049f, B:158:0x04a5, B:159:0x04bc, B:160:0x04bf, B:133:0x042f, B:135:0x0435, B:164:0x04d1), top: B:182:0x0420 }] */
    /* JADX WARN: Code duplicated, block: B:132:0x042e A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:133:0x042f A[Catch: all -> 0x0450, TryCatch #1 {all -> 0x0450, blocks: (B:128:0x0420, B:130:0x0428, B:138:0x0455, B:141:0x045d, B:143:0x0463, B:146:0x046a, B:148:0x0470, B:149:0x0487, B:151:0x048e, B:153:0x0498, B:156:0x049f, B:158:0x04a5, B:159:0x04bc, B:160:0x04bf, B:133:0x042f, B:135:0x0435, B:164:0x04d1), top: B:182:0x0420 }] */
    /* JADX WARN: Code duplicated, block: B:141:0x045d A[Catch: all -> 0x0450, TRY_ENTER, TryCatch #1 {all -> 0x0450, blocks: (B:128:0x0420, B:130:0x0428, B:138:0x0455, B:141:0x045d, B:143:0x0463, B:146:0x046a, B:148:0x0470, B:149:0x0487, B:151:0x048e, B:153:0x0498, B:156:0x049f, B:158:0x04a5, B:159:0x04bc, B:160:0x04bf, B:133:0x042f, B:135:0x0435, B:164:0x04d1), top: B:182:0x0420 }] */
    /* JADX WARN: Code duplicated, block: B:145:0x0469 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:146:0x046a A[Catch: all -> 0x0450, TryCatch #1 {all -> 0x0450, blocks: (B:128:0x0420, B:130:0x0428, B:138:0x0455, B:141:0x045d, B:143:0x0463, B:146:0x046a, B:148:0x0470, B:149:0x0487, B:151:0x048e, B:153:0x0498, B:156:0x049f, B:158:0x04a5, B:159:0x04bc, B:160:0x04bf, B:133:0x042f, B:135:0x0435, B:164:0x04d1), top: B:182:0x0420 }] */
    /* JADX WARN: Code duplicated, block: B:151:0x048e A[Catch: all -> 0x0450, TryCatch #1 {all -> 0x0450, blocks: (B:128:0x0420, B:130:0x0428, B:138:0x0455, B:141:0x045d, B:143:0x0463, B:146:0x046a, B:148:0x0470, B:149:0x0487, B:151:0x048e, B:153:0x0498, B:156:0x049f, B:158:0x04a5, B:159:0x04bc, B:160:0x04bf, B:133:0x042f, B:135:0x0435, B:164:0x04d1), top: B:182:0x0420 }] */
    /* JADX WARN: Code duplicated, block: B:153:0x0498 A[Catch: all -> 0x0450, TryCatch #1 {all -> 0x0450, blocks: (B:128:0x0420, B:130:0x0428, B:138:0x0455, B:141:0x045d, B:143:0x0463, B:146:0x046a, B:148:0x0470, B:149:0x0487, B:151:0x048e, B:153:0x0498, B:156:0x049f, B:158:0x04a5, B:159:0x04bc, B:160:0x04bf, B:133:0x042f, B:135:0x0435, B:164:0x04d1), top: B:182:0x0420 }] */
    /* JADX WARN: Code duplicated, block: B:155:0x049e A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:156:0x049f A[Catch: all -> 0x0450, TryCatch #1 {all -> 0x0450, blocks: (B:128:0x0420, B:130:0x0428, B:138:0x0455, B:141:0x045d, B:143:0x0463, B:146:0x046a, B:148:0x0470, B:149:0x0487, B:151:0x048e, B:153:0x0498, B:156:0x049f, B:158:0x04a5, B:159:0x04bc, B:160:0x04bf, B:133:0x042f, B:135:0x0435, B:164:0x04d1), top: B:182:0x0420 }] */
    /* JADX WARN: Code duplicated, block: B:163:0x04cd  */
    /* JADX WARN: Code duplicated, block: B:191:0x031e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:195:0x04bc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:0x01b4  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v42, types: [kgf, p41] */
    /* JADX WARN: Type inference failed for: r0v60 */
    /* JADX WARN: Type inference failed for: r0v65, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v13 */
    /* JADX WARN: Type inference failed for: r11v14 */
    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v16 */
    /* JADX WARN: Type inference failed for: r11v17, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v19 */
    /* JADX WARN: Type inference failed for: r11v32 */
    /* JADX WARN: Type inference failed for: r11v37 */
    /* JADX WARN: Type inference failed for: r11v38 */
    /* JADX WARN: Type inference failed for: r11v39 */
    /* JADX WARN: Type inference failed for: r15v10, types: [java.lang.Object, njd] */
    /* JADX WARN: Type inference failed for: r15v11, types: [njd] */
    /* JADX WARN: Type inference failed for: r15v13 */
    /* JADX WARN: Type inference failed for: r15v14 */
    /* JADX WARN: Type inference failed for: r15v15 */
    /* JADX WARN: Type inference failed for: r15v16 */
    /* JADX WARN: Type inference failed for: r1v0, types: [bfg] */
    /* JADX WARN: Type inference failed for: r1v1, types: [e3h] */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v21, types: [e3h] */
    /* JADX WARN: Type inference failed for: r1v22, types: [e3h] */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v24 */
    /* JADX WARN: Type inference failed for: r1v25, types: [e3h] */
    /* JADX WARN: Type inference failed for: r1v28 */
    /* JADX WARN: Type inference failed for: r1v29 */
    /* JADX WARN: Type inference failed for: r1v30 */
    /* JADX WARN: Type inference failed for: r1v31 */
    /* JADX WARN: Type inference failed for: r1v32 */
    /* JADX WARN: Type inference failed for: r1v35 */
    /* JADX WARN: Type inference failed for: r1v36, types: [bfg] */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r43v2 */
    /* JADX WARN: Type inference failed for: r43v3 */
    /* JADX WARN: Type inference failed for: r43v4 */
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
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:127:0x0414 -> B:182:0x0420). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.mq0
    public final java.lang.Object invokeSuspend(java.lang.Object r43) {
        /*
            Method dump skipped, instruction units count: 1332
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ffg.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
