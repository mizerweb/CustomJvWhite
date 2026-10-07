package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ImageSpan;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import one.me.sdk.uikit.common.span.FitFontImageSpan;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class jn1 extends mdh implements vf7 {
    public final /* synthetic */ int e;
    public /* synthetic */ Object f;
    public /* synthetic */ Object g;
    public /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jn1(Object obj, lq4 lq4Var, int i) {
        super(4, lq4Var);
        this.e = i;
        this.i = obj;
    }

    @Override // defpackage.vf7
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        Object obj5 = this.i;
        switch (i) {
            case 0:
                jn1 jn1Var = new jn1((kn1) obj5, (lq4) obj4, 0);
                jn1Var.f = (be1) obj;
                jn1Var.g = (f62) obj2;
                jn1Var.h = (vg4) obj3;
                jn1Var.invokeSuspend(sbiVar);
                return sbiVar;
            case 1:
                jn1 jn1Var2 = new jn1((q04) obj5, (lq4) obj4, 1);
                jn1Var2.f = (List) obj;
                jn1Var2.g = (List) obj2;
                jn1Var2.h = (Set) obj3;
                return jn1Var2.invokeSuspend(sbiVar);
            case 2:
                jn1 jn1Var3 = new jn1((v9a) obj5, (lq4) obj4, 2);
                jn1Var3.f = (List) obj;
                jn1Var3.g = (List) obj2;
                jn1Var3.h = (i8a) obj3;
                return jn1Var3.invokeSuspend(sbiVar);
            default:
                jn1 jn1Var4 = new jn1((gbg) obj5, (lq4) obj4, 3);
                jn1Var4.f = (rt2) obj;
                jn1Var4.h = (vg4) obj2;
                jn1Var4.g = (List) obj3;
                return jn1Var4.invokeSuspend(sbiVar);
        }
    }

    /* JADX WARN: Code duplicated, block: B:122:0x03b4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:123:0x03b6  */
    /* JADX WARN: Code duplicated, block: B:125:0x03b9  */
    /* JADX WARN: Code duplicated, block: B:127:0x03bc  */
    /* JADX WARN: Code duplicated, block: B:129:0x03bf  */
    /* JADX WARN: Code duplicated, block: B:131:0x03c7  */
    /* JADX WARN: Code duplicated, block: B:132:0x03c9  */
    /* JADX WARN: Code duplicated, block: B:133:0x03cb  */
    /* JADX WARN: Code duplicated, block: B:134:0x03cd  */
    /* JADX WARN: Code duplicated, block: B:136:0x03d0  */
    /* JADX WARN: Code duplicated, block: B:137:0x03e2  */
    /* JADX WARN: Code duplicated, block: B:139:0x03e5  */
    /* JADX WARN: Code duplicated, block: B:144:0x03f1  */
    /* JADX WARN: Code duplicated, block: B:146:0x03f7  */
    /* JADX WARN: Code duplicated, block: B:147:0x03fa  */
    /* JADX WARN: Code duplicated, block: B:149:0x03fe  */
    /* JADX WARN: Code duplicated, block: B:150:0x0400  */
    /* JADX WARN: Code duplicated, block: B:152:0x0404 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:160:0x0416  */
    /* JADX WARN: Code duplicated, block: B:162:0x041a  */
    /* JADX WARN: Code duplicated, block: B:163:0x041c  */
    /* JADX WARN: Code duplicated, block: B:166:0x0439  */
    /* JADX WARN: Code duplicated, block: B:168:0x044e  */
    /* JADX WARN: Code duplicated, block: B:170:0x0458  */
    /* JADX WARN: Code duplicated, block: B:172:0x0474  */
    /* JADX WARN: Code duplicated, block: B:174:0x047a  */
    /* JADX WARN: Code duplicated, block: B:175:0x0482  */
    /* JADX WARN: Code duplicated, block: B:177:0x0488  */
    /* JADX WARN: Code duplicated, block: B:179:0x0490  */
    /* JADX WARN: Code duplicated, block: B:180:0x0494  */
    /* JADX WARN: Code duplicated, block: B:181:0x049e  */
    /* JADX WARN: Code duplicated, block: B:183:0x04a2  */
    /* JADX WARN: Code duplicated, block: B:185:0x04aa  */
    /* JADX WARN: Code duplicated, block: B:186:0x04ae  */
    /* JADX WARN: Code duplicated, block: B:187:0x04b8  */
    /* JADX WARN: Code duplicated, block: B:189:0x04bc  */
    /* JADX WARN: Code duplicated, block: B:192:0x04c2  */
    /* JADX WARN: Code duplicated, block: B:193:0x04c9  */
    /* JADX WARN: Code duplicated, block: B:195:0x04cd  */
    /* JADX WARN: Code duplicated, block: B:198:0x04d3  */
    /* JADX WARN: Code duplicated, block: B:199:0x04da  */
    /* JADX WARN: Code duplicated, block: B:201:0x04de  */
    /* JADX WARN: Code duplicated, block: B:204:0x04e4  */
    /* JADX WARN: Code duplicated, block: B:205:0x04eb  */
    /* JADX WARN: Code duplicated, block: B:207:0x04ef  */
    /* JADX WARN: Code duplicated, block: B:210:0x04f5  */
    /* JADX WARN: Code duplicated, block: B:211:0x04fb  */
    /* JADX WARN: Code duplicated, block: B:213:0x04ff  */
    /* JADX WARN: Code duplicated, block: B:216:0x0505  */
    /* JADX WARN: Code duplicated, block: B:217:0x050b  */
    /* JADX WARN: Code duplicated, block: B:219:0x050f  */
    /* JADX WARN: Code duplicated, block: B:222:0x0516  */
    /* JADX WARN: Code duplicated, block: B:223:0x051c  */
    /* JADX WARN: Code duplicated, block: B:225:0x0520  */
    /* JADX WARN: Code duplicated, block: B:228:0x0527  */
    /* JADX WARN: Code duplicated, block: B:229:0x052d  */
    /* JADX WARN: Code duplicated, block: B:231:0x0531  */
    /* JADX WARN: Code duplicated, block: B:234:0x0538  */
    /* JADX WARN: Code duplicated, block: B:235:0x053e  */
    /* JADX WARN: Code duplicated, block: B:237:0x0542  */
    /* JADX WARN: Code duplicated, block: B:240:0x0549  */
    /* JADX WARN: Code duplicated, block: B:241:0x054f  */
    /* JADX WARN: Code duplicated, block: B:242:0x0552  */
    /* JADX WARN: Code duplicated, block: B:245:0x0559  */
    /* JADX WARN: Code duplicated, block: B:247:0x055f  */
    /* JADX WARN: Code duplicated, block: B:248:0x0567  */
    /* JADX WARN: Code duplicated, block: B:250:0x056d  */
    /* JADX WARN: Code duplicated, block: B:252:0x0575  */
    /* JADX WARN: Code duplicated, block: B:253:0x0579  */
    /* JADX WARN: Code duplicated, block: B:254:0x0583  */
    /* JADX WARN: Code duplicated, block: B:256:0x0587  */
    /* JADX WARN: Code duplicated, block: B:258:0x058f  */
    /* JADX WARN: Code duplicated, block: B:259:0x0593  */
    /* JADX WARN: Code duplicated, block: B:260:0x059d  */
    /* JADX WARN: Code duplicated, block: B:262:0x05a1  */
    /* JADX WARN: Code duplicated, block: B:265:0x05a7  */
    /* JADX WARN: Code duplicated, block: B:266:0x05ae  */
    /* JADX WARN: Code duplicated, block: B:268:0x05b2  */
    /* JADX WARN: Code duplicated, block: B:271:0x05b8  */
    /* JADX WARN: Code duplicated, block: B:272:0x05bf  */
    /* JADX WARN: Code duplicated, block: B:274:0x05c3  */
    /* JADX WARN: Code duplicated, block: B:277:0x05c9  */
    /* JADX WARN: Code duplicated, block: B:278:0x05d0  */
    /* JADX WARN: Code duplicated, block: B:280:0x05d4  */
    /* JADX WARN: Code duplicated, block: B:283:0x05da  */
    /* JADX WARN: Code duplicated, block: B:284:0x05e0  */
    /* JADX WARN: Code duplicated, block: B:286:0x05e4  */
    /* JADX WARN: Code duplicated, block: B:289:0x05ea  */
    /* JADX WARN: Code duplicated, block: B:290:0x05f0  */
    /* JADX WARN: Code duplicated, block: B:292:0x05f4  */
    /* JADX WARN: Code duplicated, block: B:295:0x05fb  */
    /* JADX WARN: Code duplicated, block: B:296:0x0601  */
    /* JADX WARN: Code duplicated, block: B:298:0x0605  */
    /* JADX WARN: Code duplicated, block: B:301:0x060c  */
    /* JADX WARN: Code duplicated, block: B:302:0x0612  */
    /* JADX WARN: Code duplicated, block: B:304:0x0616  */
    /* JADX WARN: Code duplicated, block: B:307:0x061d  */
    /* JADX WARN: Code duplicated, block: B:308:0x0623  */
    /* JADX WARN: Code duplicated, block: B:310:0x0627  */
    /* JADX WARN: Code duplicated, block: B:313:0x062e  */
    /* JADX WARN: Code duplicated, block: B:314:0x0634  */
    /* JADX WARN: Code duplicated, block: B:315:0x0637  */
    /* JADX WARN: Code duplicated, block: B:318:0x063e  */
    /* JADX WARN: Code duplicated, block: B:319:0x0647  */
    /* JADX WARN: Code duplicated, block: B:324:0x0659  */
    /* JADX WARN: Code duplicated, block: B:328:0x0685 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:333:0x0691  */
    /* JADX WARN: Code duplicated, block: B:335:0x0694  */
    /* JADX WARN: Code duplicated, block: B:340:0x06a6  */
    /* JADX WARN: Code duplicated, block: B:342:0x06a9 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:360:0x0713  */
    /* JADX WARN: Code duplicated, block: B:362:0x0717  */
    /* JADX WARN: Code duplicated, block: B:365:0x072b  */
    /* JADX WARN: Code duplicated, block: B:368:0x0738  */
    /* JADX WARN: Code duplicated, block: B:370:0x073c  */
    /* JADX WARN: Code duplicated, block: B:371:0x0740  */
    /* JADX WARN: Code duplicated, block: B:373:0x0743  */
    /* JADX WARN: Code duplicated, block: B:374:0x0746  */
    /* JADX WARN: Code duplicated, block: B:377:0x074b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:378:0x074d  */
    /* JADX WARN: Code duplicated, block: B:379:0x0751  */
    /* JADX WARN: Code duplicated, block: B:381:0x0754  */
    /* JADX WARN: Code duplicated, block: B:382:0x0757  */
    /* JADX WARN: Code duplicated, block: B:386:0x075d  */
    /* JADX WARN: Code duplicated, block: B:387:0x075f  */
    /* JADX WARN: Code duplicated, block: B:389:0x0762  */
    /* JADX WARN: Code duplicated, block: B:390:0x0766  */
    /* JADX WARN: Code duplicated, block: B:392:0x0769  */
    /* JADX WARN: Code duplicated, block: B:393:0x076c  */
    /* JADX WARN: Code duplicated, block: B:396:0x0771  */
    /* JADX WARN: Code duplicated, block: B:397:0x0773  */
    /* JADX WARN: Code duplicated, block: B:399:0x0776  */
    /* JADX WARN: Code duplicated, block: B:400:0x077a  */
    /* JADX WARN: Code duplicated, block: B:402:0x077d  */
    /* JADX WARN: Code duplicated, block: B:403:0x0780  */
    /* JADX WARN: Code duplicated, block: B:406:0x0785  */
    /* JADX WARN: Code duplicated, block: B:407:0x0787  */
    /* JADX WARN: Code duplicated, block: B:409:0x078a A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:412:0x0790  */
    /* JADX WARN: Code duplicated, block: B:414:0x0793 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:417:0x0799  */
    /* JADX WARN: Code duplicated, block: B:419:0x079c A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:422:0x07a2  */
    /* JADX WARN: Code duplicated, block: B:425:0x07a7  */
    /* JADX WARN: Code duplicated, block: B:426:0x07af  */
    /* JADX WARN: Code duplicated, block: B:427:0x07b1 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:429:0x07bb A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:430:0x07bd  */
    /* JADX WARN: Code duplicated, block: B:432:0x07c6  */
    /* JADX WARN: Code duplicated, block: B:433:0x07cb  */
    /* JADX WARN: Code duplicated, block: B:434:0x07e1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:435:0x07e3  */
    /* JADX WARN: Code duplicated, block: B:436:0x07eb A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:437:0x07ed  */
    /* JADX WARN: Code duplicated, block: B:440:0x07fa  */
    /* JADX WARN: Code duplicated, block: B:441:0x0800  */
    /* JADX WARN: Code duplicated, block: B:449:0x0814  */
    /* JADX WARN: Code duplicated, block: B:452:0x081a  */
    /* JADX WARN: Code duplicated, block: B:455:0x082b A[LOOP:7: B:451:0x0818->B:455:0x082b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:459:0x0837  */
    /* JADX WARN: Code duplicated, block: B:461:0x083c  */
    /* JADX WARN: Code duplicated, block: B:462:0x083e  */
    /* JADX WARN: Code duplicated, block: B:463:0x0840 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:465:0x084a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:466:0x084c A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:468:0x0856 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:469:0x0858 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:472:0x0864 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:473:0x0866 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:475:0x0870 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:476:0x0872  */
    /* JADX WARN: Code duplicated, block: B:477:0x087a  */
    /* JADX WARN: Code duplicated, block: B:478:0x087c A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:481:0x0887  */
    /* JADX WARN: Code duplicated, block: B:482:0x088a  */
    /* JADX WARN: Code duplicated, block: B:484:0x0890  */
    /* JADX WARN: Code duplicated, block: B:485:0x0899  */
    /* JADX WARN: Code duplicated, block: B:492:0x0914 A[LOOP:6: B:113:0x0390->B:492:0x0914, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:506:0x03c1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:507:0x0911 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:508:0x0830 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:509:0x0833 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r1v12, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v20, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v21, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r1v26, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v56, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v57 */
    /* JADX WARN: Type inference failed for: r1v62, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v78 */
    /* JADX WARN: Type inference failed for: r1v79 */
    /* JADX WARN: Type inference failed for: r1v80 */
    /* JADX WARN: Type inference failed for: r1v81 */
    /* JADX WARN: Type inference failed for: r1v82 */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r5v60, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v63 */
    /* JADX WARN: Type inference failed for: r5v66, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v19, types: [java.util.List] */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        int i;
        boolean z;
        boolean z2;
        int iD;
        gn1 gn1Var;
        boolean z3;
        String name;
        a4c a4cVar;
        gn1 gn1Var2;
        je9 je9Var;
        Object obj2;
        vg4 vg4Var;
        boolean z4;
        String strK;
        Object obj3;
        mjg mjgVar;
        String strK2;
        Boolean boolValueOf;
        Boolean boolValueOf2;
        hi6 hi6Var;
        List listS;
        boolean[] zArr;
        char[] cArr;
        byte[] bArr;
        short[] sArr;
        double[] dArr;
        long[] jArr;
        float[] fArr;
        int[] iArr;
        Object[] objArr;
        Map map;
        Collection collection;
        boolean[] zArr2;
        char[] cArr2;
        byte[] bArr2;
        short[] sArr2;
        double[] dArr2;
        long[] jArr2;
        float[] fArr2;
        int[] iArr2;
        Object[] objArr2;
        Map map2;
        Collection collection2;
        boolean z5;
        boolean z6;
        CharSequence charSequence;
        ?? string;
        pi6 pi6Var;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        a8g a8gVar;
        Context context;
        boolean z11;
        hi6 hi6Var2;
        Object obj4;
        boolean z12;
        hi6 hi6Var3;
        Object obj5;
        boolean z13;
        hi6 hi6Var4;
        Object obj6;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        SpannableString spannableStringValueOf;
        Object[] spans;
        int length;
        int i2;
        kn1 kn1Var;
        Object obj7;
        ImageSpan imageSpan;
        Integer numValueOf;
        nbc nbcVarK;
        int i3;
        CharSequence string2;
        CharSequence charSequence2;
        hi6 hi6Var5;
        Object obj8;
        CharSequence charSequence3;
        mjg mjgVar2;
        String strI;
        List listS2;
        boolean z18;
        gn1 gn1Var3;
        ?? T1;
        switch (this.e) {
            case 0:
                gn1 gn1Var4 = gn1.a;
                gn1 gn1Var5 = gn1.b;
                gn1 gn1Var6 = gn1.c;
                gn1 gn1Var7 = gn1.d;
                be1 be1Var = (be1) this.f;
                f62 f62Var = (f62) this.g;
                vg4 vg4Var2 = (vg4) this.h;
                ch3.d0(obj);
                kn1 kn1Var2 = (kn1) this.i;
                mjg mjgVar3 = kn1Var2.j;
                while (true) {
                    Object value = mjgVar3.getValue();
                    cn1 cn1Var = (cn1) value;
                    phl phlVar = f62Var.o;
                    if (phlVar != null) {
                        i = 1;
                        z = phlVar.b();
                        z2 = f62Var.l;
                        iD = qt4.D(f62Var.g.a);
                        if (iD != 0) {
                            gn1Var = null;
                        } else if (iD != i) {
                            gn1Var = gn1Var4;
                        } else if (iD != 2) {
                            gn1Var = gn1Var5;
                        } else if (iD != 3) {
                            gn1Var = gn1Var6;
                        } else {
                            if (iD == 4) {
                                ore.o();
                                return null;
                            }
                            gn1Var = gn1Var7;
                        }
                        if (gn1Var == null) {
                            kn1Var = kn1Var2;
                            gn1Var2 = gn1Var6;
                            gn1Var4 = gn1Var4;
                            gn1Var7 = gn1Var7;
                            vg4Var = vg4Var2;
                            mjgVar2 = mjgVar3;
                        } else {
                            if (gn1Var != gn1Var7) {
                                z18 = f62Var.m;
                                if (!z18 && (f62Var.k instanceof ni6)) {
                                    gn1Var = gn1Var7;
                                } else if (f62Var.g.e) {
                                    gn1Var = gn1.e;
                                } else {
                                    gn1Var3 = cn1Var.b;
                                    if (gn1Var3 == gn1Var6) {
                                        gn1Var = gn1Var3;
                                    } else if (f62Var.l || z18 || be1Var.l) {
                                        if (f62Var.m) {
                                            gn1Var = gn1Var4;
                                        } else {
                                            gn1Var = gn1Var6;
                                        }
                                    } else if ((vg4Var2 != null ? vg4Var2.s() : null) == null) {
                                        gn1Var = gn1Var5;
                                    } else if (f62Var.m) {
                                        gn1Var = gn1Var6;
                                    } else {
                                        gn1Var = gn1Var4;
                                    }
                                }
                            }
                            p32 p32Var = (p32) kn1Var2.f.getValue();
                            boolean z19 = f62Var.j;
                            z3 = f62Var.l;
                            name = kn1.class.getName();
                            a4cVar = gm0.f;
                            if (a4cVar == null) {
                                gn1Var2 = gn1Var6;
                            } else {
                                gn1Var2 = gn1Var6;
                                je9Var = je9.d;
                                if (a4cVar.b(je9Var)) {
                                    obj2 = be1Var.c;
                                    vg4Var = vg4Var2;
                                    if (obj2 != null) {
                                        z4 = z2;
                                        strK = null;
                                    } else if (gm0.c()) {
                                        strK = obj2.toString();
                                        z4 = z2;
                                    } else {
                                        z4 = z2;
                                        if (obj2 instanceof Collection) {
                                            collection2 = (Collection) obj2;
                                            if (collection2.isEmpty()) {
                                                strK = "[]";
                                            } else {
                                                strK = c0a.k(collection2.size(), "[**", "**]");
                                            }
                                        } else if (obj2 instanceof Map) {
                                            map2 = (Map) obj2;
                                            if (map2.isEmpty()) {
                                                strK = "{}";
                                            } else {
                                                strK = c0a.k(map2.size(), "{**", "**}");
                                            }
                                        } else if (obj2 instanceof Object[]) {
                                            objArr2 = (Object[]) obj2;
                                            if (objArr2.length == 0) {
                                                strK = "[]";
                                            } else {
                                                strK = c0a.k(objArr2.length, "[**", "**]");
                                            }
                                        } else if (obj2 instanceof int[]) {
                                            iArr2 = (int[]) obj2;
                                            if (iArr2.length == 0) {
                                                strK = "[]";
                                            } else {
                                                strK = c0a.k(iArr2.length, "[**", "**]");
                                            }
                                        } else if (obj2 instanceof float[]) {
                                            fArr2 = (float[]) obj2;
                                            if (fArr2.length == 0) {
                                                strK = "[]";
                                            } else {
                                                strK = c0a.k(fArr2.length, "[**", "**]");
                                            }
                                        } else if (obj2 instanceof long[]) {
                                            jArr2 = (long[]) obj2;
                                            if (jArr2.length == 0) {
                                                strK = "[]";
                                            } else {
                                                strK = c0a.k(jArr2.length, "[**", "**]");
                                            }
                                        } else if (obj2 instanceof double[]) {
                                            dArr2 = (double[]) obj2;
                                            if (dArr2.length == 0) {
                                                strK = "[]";
                                            } else {
                                                strK = c0a.k(dArr2.length, "[**", "**]");
                                            }
                                        } else if (obj2 instanceof short[]) {
                                            sArr2 = (short[]) obj2;
                                            if (sArr2.length == 0) {
                                                strK = "[]";
                                            } else {
                                                strK = c0a.k(sArr2.length, "[**", "**]");
                                            }
                                        } else if (obj2 instanceof byte[]) {
                                            bArr2 = (byte[]) obj2;
                                            if (bArr2.length == 0) {
                                                strK = "[]";
                                            } else {
                                                strK = c0a.k(bArr2.length, "[**", "**]");
                                            }
                                        } else if (obj2 instanceof char[]) {
                                            cArr2 = (char[]) obj2;
                                            if (cArr2.length == 0) {
                                                strK = "[]";
                                            } else {
                                                strK = c0a.k(cArr2.length, "[**", "**]");
                                            }
                                        } else if (obj2 instanceof boolean[]) {
                                            zArr2 = (boolean[]) obj2;
                                            if (zArr2.length == 0) {
                                                strK = "[]";
                                            } else {
                                                strK = c0a.k(zArr2.length, "[**", "**]");
                                            }
                                        } else {
                                            strK = "***";
                                        }
                                    }
                                    obj3 = be1Var.d;
                                    if (obj3 != null) {
                                        mjgVar = mjgVar3;
                                        strK2 = null;
                                    } else if (gm0.c()) {
                                        strK2 = obj3.toString();
                                        mjgVar = mjgVar3;
                                    } else {
                                        mjgVar = mjgVar3;
                                        if (obj3 instanceof Collection) {
                                            collection = (Collection) obj3;
                                            if (collection.isEmpty()) {
                                                strK2 = "[]";
                                            } else {
                                                strK2 = c0a.k(collection.size(), "[**", "**]");
                                            }
                                        } else if (obj3 instanceof Map) {
                                            map = (Map) obj3;
                                            if (map.isEmpty()) {
                                                strK2 = "{}";
                                            } else {
                                                strK2 = c0a.k(map.size(), "{**", "**}");
                                            }
                                        } else if (obj3 instanceof Object[]) {
                                            objArr = (Object[]) obj3;
                                            if (objArr.length == 0) {
                                                strK2 = "[]";
                                            } else {
                                                strK2 = c0a.k(objArr.length, "[**", "**]");
                                            }
                                        } else if (obj3 instanceof int[]) {
                                            iArr = (int[]) obj3;
                                            if (iArr.length == 0) {
                                                strK2 = "[]";
                                            } else {
                                                strK2 = c0a.k(iArr.length, "[**", "**]");
                                            }
                                        } else if (obj3 instanceof float[]) {
                                            fArr = (float[]) obj3;
                                            if (fArr.length == 0) {
                                                strK2 = "[]";
                                            } else {
                                                strK2 = c0a.k(fArr.length, "[**", "**]");
                                            }
                                        } else if (obj3 instanceof long[]) {
                                            jArr = (long[]) obj3;
                                            if (jArr.length == 0) {
                                                strK2 = "[]";
                                            } else {
                                                strK2 = c0a.k(jArr.length, "[**", "**]");
                                            }
                                        } else if (obj3 instanceof double[]) {
                                            dArr = (double[]) obj3;
                                            if (dArr.length == 0) {
                                                strK2 = "[]";
                                            } else {
                                                strK2 = c0a.k(dArr.length, "[**", "**]");
                                            }
                                        } else if (obj3 instanceof short[]) {
                                            sArr = (short[]) obj3;
                                            if (sArr.length == 0) {
                                                strK2 = "[]";
                                            } else {
                                                strK2 = c0a.k(sArr.length, "[**", "**]");
                                            }
                                        } else if (obj3 instanceof byte[]) {
                                            bArr = (byte[]) obj3;
                                            if (bArr.length == 0) {
                                                strK2 = "[]";
                                            } else {
                                                strK2 = c0a.k(bArr.length, "[**", "**]");
                                            }
                                        } else if (obj3 instanceof char[]) {
                                            cArr = (char[]) obj3;
                                            if (cArr.length == 0) {
                                                strK2 = "[]";
                                            } else {
                                                strK2 = c0a.k(cArr.length, "[**", "**]");
                                            }
                                        } else if (obj3 instanceof boolean[]) {
                                            zArr = (boolean[]) obj3;
                                            if (zArr.length == 0) {
                                                strK2 = "[]";
                                            } else {
                                                strK2 = c0a.k(zArr.length, "[**", "**]");
                                            }
                                        } else {
                                            strK2 = "***";
                                        }
                                    }
                                    boolean z20 = be1Var.l;
                                    if (vg4Var != null) {
                                        boolValueOf = Boolean.valueOf(vg4Var.h());
                                    } else {
                                        boolValueOf = null;
                                    }
                                    if (vg4Var != null || (listS = vg4Var.s()) == null) {
                                        boolValueOf2 = null;
                                    } else {
                                        boolValueOf2 = Boolean.valueOf(listS.isEmpty());
                                    }
                                    StringBuilder sbQ = qv1.q("getParticipantName, name:", strK, ", pushName: ", strK2, ", isContact: ");
                                    sbQ.append(z20);
                                    sbQ.append(", inUserList: ");
                                    sbQ.append(boolValueOf);
                                    sbQ.append(",isOrganization: ");
                                    sbQ.append(boolValueOf2);
                                    hi6Var = null;
                                    a4cVar.c(je9Var, name, sbQ.toString(), null);
                                }
                                if (!be1Var.l || (vg4Var != null && vg4Var.h())) {
                                    z5 = true;
                                } else {
                                    z5 = false;
                                }
                                if (vg4Var == null && (listS2 = vg4Var.s()) != null && (!listS2.isEmpty())) {
                                    z6 = true;
                                } else {
                                    z6 = false;
                                }
                                if (z3 || z5 || z6 || z19) {
                                    charSequence = be1Var.c;
                                    string = charSequence;
                                    if (charSequence == null) {
                                        string = "";
                                    }
                                } else {
                                    Long lValueOf = vg4Var != null ? Long.valueOf(vg4Var.w()) : be1Var.i;
                                    if (lValueOf == null) {
                                        string = ((Context) kn1Var2.i.getValue()).getString(R.string.not_contact_with_hidden_phone_number);
                                    } else {
                                        if (vg4Var == null || (strI = vg4Var.i()) == null) {
                                            strI = be1Var.j;
                                        }
                                        string = lValueOf.longValue() > 0 ? vd7.v((vtc) kn1Var2.g.getValue(), String.valueOf(lValueOf.longValue()), strI, ((s7f) ((et3) kn1Var2.h.getValue())).m()) : ((Context) kn1Var2.i.getValue()).getString(R.string.not_contact_with_hidden_phone_number);
                                    }
                                }
                                pi6Var = f62Var.k;
                                z7 = f62Var.m;
                                fd8 fd8Var = f62Var.g;
                                z8 = fd8Var.d;
                                z9 = pi6Var instanceof ni6;
                                z10 = fd8Var.e;
                                a8gVar = pq3.j;
                                context = p32Var.a;
                                if (z10) {
                                    kn1Var = kn1Var2;
                                    string2 = context.getString(R.string.call_status_on_hold);
                                } else {
                                    z11 = pi6Var instanceof hi6;
                                    if (z11) {
                                        hi6Var2 = (hi6) pi6Var;
                                    } else {
                                        hi6Var2 = hi6Var;
                                    }
                                    if (hi6Var2 != null) {
                                        obj4 = hi6Var2.a;
                                    } else {
                                        obj4 = hi6Var;
                                    }
                                    if (obj4 == gi6.m) {
                                        z12 = true;
                                    } else {
                                        if (z11) {
                                            hi6Var5 = (hi6) pi6Var;
                                        } else {
                                            hi6Var5 = hi6Var;
                                        }
                                        if (hi6Var5 != null) {
                                            obj8 = hi6Var5.a;
                                        } else {
                                            obj8 = hi6Var;
                                        }
                                        if (obj8 == gi6.a) {
                                            z12 = true;
                                        } else {
                                            z12 = false;
                                        }
                                    }
                                    if (z11) {
                                        hi6Var3 = (hi6) pi6Var;
                                    } else {
                                        hi6Var3 = hi6Var;
                                    }
                                    if (hi6Var3 != null) {
                                        obj5 = hi6Var3.a;
                                    } else {
                                        obj5 = hi6Var;
                                    }
                                    if (obj5 == gi6.e) {
                                        z13 = true;
                                    } else {
                                        z13 = false;
                                    }
                                    if (z11) {
                                        hi6Var4 = (hi6) pi6Var;
                                    } else {
                                        hi6Var4 = hi6Var;
                                    }
                                    if (hi6Var4 != null) {
                                        obj6 = hi6Var4.a;
                                    } else {
                                        obj6 = hi6Var;
                                    }
                                    if (obj6 == gi6.f) {
                                        z14 = true;
                                    } else {
                                        z14 = false;
                                    }
                                    if (z11 || z4 || !z13) {
                                        z15 = false;
                                    } else {
                                        z15 = true;
                                    }
                                    if (z11 || z4 || !z14) {
                                        z16 = false;
                                    } else {
                                        z16 = true;
                                    }
                                    if (z11 || z4 || !z12) {
                                        z17 = false;
                                    } else {
                                        z17 = true;
                                    }
                                    if (pi6Var instanceof oi6) {
                                        string = context.getString(R.string.call_me_in_waiting_room);
                                    } else if (!z9 && z7) {
                                        string = context.getString(R.string.call_state_connecting);
                                    } else if (z16) {
                                        if (string.length() == 0) {
                                            string = context.getString(R.string.opponent_no_network);
                                        } else {
                                            ?? sb = new StringBuilder();
                                            sb.append(string);
                                            sb.append(" · ");
                                            sb.append(context.getString(R.string.opponent_no_network));
                                            string = sb;
                                        }
                                    } else if (z15) {
                                        string = context.getString(R.string.call_opponent_failed);
                                    } else if (z17) {
                                        string = context.getString(R.string.call_indicator_unavailable_call);
                                    }
                                    if (r5h.X0(string)) {
                                        kn1Var = kn1Var2;
                                        charSequence2 = null;
                                        charSequence3 = charSequence2;
                                    } else {
                                        spannableStringValueOf = SpannableString.valueOf(string);
                                        try {
                                            spans = spannableStringValueOf.getSpans(0, spannableStringValueOf.length(), ImageSpan.class);
                                            while (true) {
                                                if (i2 < length) {
                                                    obj7 = spans[i2];
                                                    kn1Var = kn1Var2;
                                                    if (((ImageSpan) obj7).getDrawable() instanceof osi) {
                                                        i2++;
                                                        kn1Var2 = kn1Var;
                                                    }
                                                } else {
                                                    kn1Var = kn1Var2;
                                                    obj7 = null;
                                                }
                                            }
                                        } catch (Throwable unused) {
                                            spans = null;
                                        }
                                        if (spans == null) {
                                            spans = new ImageSpan[0];
                                        }
                                        length = spans.length;
                                        i2 = 0;
                                        imageSpan = (ImageSpan) obj7;
                                        if (imageSpan != null) {
                                            spannableStringValueOf.removeSpan(imageSpan);
                                        }
                                        if (!z16) {
                                            numValueOf = null;
                                        } else if (z != 0 && z11) {
                                            numValueOf = Integer.valueOf(R.drawable.icon_call_missed_fill);
                                        } else if (z == 0 && z11) {
                                            numValueOf = Integer.valueOf(R.drawable.icon_video_call_missed_fill);
                                        } else if (z7 && z4 && z) {
                                            numValueOf = Integer.valueOf(R.drawable.icon_video_call_incoming_fill);
                                        } else if (z7 && z4) {
                                            numValueOf = Integer.valueOf(R.drawable.icon_call_incoming_fill);
                                        } else if (z != 0) {
                                            numValueOf = Integer.valueOf(R.drawable.icon_video_call_fill);
                                        } else if (z9 && z8) {
                                            numValueOf = Integer.valueOf(R.drawable.ic_connection_fill_16);
                                        } else {
                                            numValueOf = null;
                                        }
                                        if (numValueOf == null) {
                                            string2 = spannableStringValueOf;
                                        } else {
                                            nbcVarK = a8gVar.k(context);
                                            if (z8) {
                                                i3 = nbcVarK.b.getIcon().j;
                                            } else {
                                                i3 = nbcVarK.b.getIcon().b;
                                            }
                                            Drawable drawableE = o7j.e(numValueOf.intValue(), i3, context);
                                            drawableE.setBounds(0, 0, gm0.K(yl5.d().getDisplayMetrics().density * 16.0f), gm0.K(16.0f * yl5.d().getDisplayMetrics().density));
                                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                                            spannableStringBuilder.append((CharSequence) "   ");
                                            spannableStringBuilder.append((CharSequence) spannableStringValueOf);
                                            spannableStringBuilder.append((CharSequence) " ");
                                            spannableStringBuilder.setSpan(new FitFontImageSpan(drawableE, null, false, false, 14, null), 0, 1, 17);
                                            charSequence3 = spannableStringBuilder;
                                        }
                                    }
                                    fd8 fd8Var2 = f62Var.g;
                                    boolean z21 = fd8Var2.b;
                                    boolean z22 = fd8Var2.c;
                                    cn1Var.getClass();
                                    cn1Var = new cn1(charSequence3, gn1Var, z21, z22);
                                    mjgVar2 = mjgVar;
                                }
                                charSequence2 = string2;
                                charSequence3 = charSequence2;
                                fd8 fd8Var3 = f62Var.g;
                                boolean z23 = fd8Var3.b;
                                boolean z24 = fd8Var3.c;
                                cn1Var.getClass();
                                cn1Var = new cn1(charSequence3, gn1Var, z23, z24);
                                mjgVar2 = mjgVar;
                            }
                            vg4Var = vg4Var2;
                            mjgVar = mjgVar3;
                            z4 = z2;
                            hi6Var = null;
                            if (be1Var.l) {
                                z5 = true;
                            } else {
                                z5 = true;
                            }
                            if (vg4Var == null) {
                                z6 = false;
                            } else {
                                z6 = false;
                            }
                            if (z3) {
                                charSequence = be1Var.c;
                                string = charSequence;
                                if (charSequence == null) {
                                    string = "";
                                }
                            } else {
                                charSequence = be1Var.c;
                                string = charSequence;
                                if (charSequence == null) {
                                    string = "";
                                }
                            }
                            pi6Var = f62Var.k;
                            z7 = f62Var.m;
                            fd8 fd8Var4 = f62Var.g;
                            z8 = fd8Var4.d;
                            z9 = pi6Var instanceof ni6;
                            z10 = fd8Var4.e;
                            a8gVar = pq3.j;
                            context = p32Var.a;
                            if (z10) {
                                kn1Var = kn1Var2;
                                string2 = context.getString(R.string.call_status_on_hold);
                            } else {
                                z11 = pi6Var instanceof hi6;
                                if (z11) {
                                    hi6Var2 = (hi6) pi6Var;
                                } else {
                                    hi6Var2 = hi6Var;
                                }
                                if (hi6Var2 != null) {
                                    obj4 = hi6Var2.a;
                                } else {
                                    obj4 = hi6Var;
                                }
                                if (obj4 == gi6.m) {
                                    z12 = true;
                                } else {
                                    if (z11) {
                                        hi6Var5 = (hi6) pi6Var;
                                    } else {
                                        hi6Var5 = hi6Var;
                                    }
                                    if (hi6Var5 != null) {
                                        obj8 = hi6Var5.a;
                                    } else {
                                        obj8 = hi6Var;
                                    }
                                    if (obj8 == gi6.a) {
                                        z12 = true;
                                    } else {
                                        z12 = false;
                                    }
                                }
                                if (z11) {
                                    hi6Var3 = (hi6) pi6Var;
                                } else {
                                    hi6Var3 = hi6Var;
                                }
                                if (hi6Var3 != null) {
                                    obj5 = hi6Var3.a;
                                } else {
                                    obj5 = hi6Var;
                                }
                                if (obj5 == gi6.e) {
                                    z13 = true;
                                } else {
                                    z13 = false;
                                }
                                if (z11) {
                                    hi6Var4 = (hi6) pi6Var;
                                } else {
                                    hi6Var4 = hi6Var;
                                }
                                if (hi6Var4 != null) {
                                    obj6 = hi6Var4.a;
                                } else {
                                    obj6 = hi6Var;
                                }
                                if (obj6 == gi6.f) {
                                    z14 = true;
                                } else {
                                    z14 = false;
                                }
                                if (z11) {
                                    z15 = false;
                                } else {
                                    z15 = false;
                                }
                                if (z11) {
                                    z16 = false;
                                } else {
                                    z16 = false;
                                }
                                if (z11) {
                                    z17 = false;
                                } else {
                                    z17 = false;
                                }
                                if (pi6Var instanceof oi6) {
                                    string = context.getString(R.string.call_me_in_waiting_room);
                                } else if (!z9) {
                                    if (z16) {
                                        if (string.length() == 0) {
                                            string = context.getString(R.string.opponent_no_network);
                                        } else {
                                            ?? sb2 = new StringBuilder();
                                            sb2.append(string);
                                            sb2.append(" · ");
                                            sb2.append(context.getString(R.string.opponent_no_network));
                                            string = sb2;
                                        }
                                    } else if (z15) {
                                        string = context.getString(R.string.call_opponent_failed);
                                    } else if (z17) {
                                        string = context.getString(R.string.call_indicator_unavailable_call);
                                    }
                                } else if (z16) {
                                    if (string.length() == 0) {
                                        string = context.getString(R.string.opponent_no_network);
                                    } else {
                                        ?? sb3 = new StringBuilder();
                                        sb3.append(string);
                                        sb3.append(" · ");
                                        sb3.append(context.getString(R.string.opponent_no_network));
                                        string = sb3;
                                    }
                                } else if (z15) {
                                    string = context.getString(R.string.call_opponent_failed);
                                } else if (z17) {
                                    string = context.getString(R.string.call_indicator_unavailable_call);
                                }
                                if (r5h.X0(string)) {
                                    kn1Var = kn1Var2;
                                    charSequence2 = null;
                                    charSequence3 = charSequence2;
                                } else {
                                    spannableStringValueOf = SpannableString.valueOf(string);
                                    spans = spannableStringValueOf.getSpans(0, spannableStringValueOf.length(), ImageSpan.class);
                                    if (spans == null) {
                                        spans = new ImageSpan[0];
                                    }
                                    length = spans.length;
                                    i2 = 0;
                                    while (true) {
                                        if (i2 < length) {
                                            obj7 = spans[i2];
                                            kn1Var = kn1Var2;
                                            if (((ImageSpan) obj7).getDrawable() instanceof osi) {
                                                i2++;
                                                kn1Var2 = kn1Var;
                                            }
                                        } else {
                                            kn1Var = kn1Var2;
                                            obj7 = null;
                                        }
                                    }
                                    imageSpan = (ImageSpan) obj7;
                                    if (imageSpan != null) {
                                        spannableStringValueOf.removeSpan(imageSpan);
                                    }
                                    if (!z16) {
                                        numValueOf = null;
                                    } else if (z != 0) {
                                        if (z == 0) {
                                            if (z7) {
                                                if (z7) {
                                                    if (z != 0) {
                                                        numValueOf = Integer.valueOf(R.drawable.icon_video_call_fill);
                                                    } else if (z9) {
                                                        numValueOf = null;
                                                    } else {
                                                        numValueOf = null;
                                                    }
                                                } else if (z != 0) {
                                                    numValueOf = Integer.valueOf(R.drawable.icon_video_call_fill);
                                                } else if (z9) {
                                                    numValueOf = null;
                                                } else {
                                                    numValueOf = null;
                                                }
                                            } else if (z7) {
                                                if (z != 0) {
                                                    numValueOf = Integer.valueOf(R.drawable.icon_video_call_fill);
                                                } else if (z9) {
                                                    numValueOf = null;
                                                } else {
                                                    numValueOf = null;
                                                }
                                            } else if (z != 0) {
                                                numValueOf = Integer.valueOf(R.drawable.icon_video_call_fill);
                                            } else if (z9) {
                                                numValueOf = null;
                                            } else {
                                                numValueOf = null;
                                            }
                                        } else if (z7) {
                                            if (z7) {
                                                if (z != 0) {
                                                    numValueOf = Integer.valueOf(R.drawable.icon_video_call_fill);
                                                } else if (z9) {
                                                    numValueOf = null;
                                                } else {
                                                    numValueOf = null;
                                                }
                                            } else if (z != 0) {
                                                numValueOf = Integer.valueOf(R.drawable.icon_video_call_fill);
                                            } else if (z9) {
                                                numValueOf = null;
                                            } else {
                                                numValueOf = null;
                                            }
                                        } else if (z7) {
                                            if (z != 0) {
                                                numValueOf = Integer.valueOf(R.drawable.icon_video_call_fill);
                                            } else if (z9) {
                                                numValueOf = null;
                                            } else {
                                                numValueOf = null;
                                            }
                                        } else if (z != 0) {
                                            numValueOf = Integer.valueOf(R.drawable.icon_video_call_fill);
                                        } else if (z9) {
                                            numValueOf = null;
                                        } else {
                                            numValueOf = null;
                                        }
                                    } else if (z == 0) {
                                        if (z7) {
                                            if (z7) {
                                                if (z != 0) {
                                                    numValueOf = Integer.valueOf(R.drawable.icon_video_call_fill);
                                                } else if (z9) {
                                                    numValueOf = null;
                                                } else {
                                                    numValueOf = null;
                                                }
                                            } else if (z != 0) {
                                                numValueOf = Integer.valueOf(R.drawable.icon_video_call_fill);
                                            } else if (z9) {
                                                numValueOf = null;
                                            } else {
                                                numValueOf = null;
                                            }
                                        } else if (z7) {
                                            if (z != 0) {
                                                numValueOf = Integer.valueOf(R.drawable.icon_video_call_fill);
                                            } else if (z9) {
                                                numValueOf = null;
                                            } else {
                                                numValueOf = null;
                                            }
                                        } else if (z != 0) {
                                            numValueOf = Integer.valueOf(R.drawable.icon_video_call_fill);
                                        } else if (z9) {
                                            numValueOf = null;
                                        } else {
                                            numValueOf = null;
                                        }
                                    } else if (z7) {
                                        if (z7) {
                                            if (z != 0) {
                                                numValueOf = Integer.valueOf(R.drawable.icon_video_call_fill);
                                            } else if (z9) {
                                                numValueOf = null;
                                            } else {
                                                numValueOf = null;
                                            }
                                        } else if (z != 0) {
                                            numValueOf = Integer.valueOf(R.drawable.icon_video_call_fill);
                                        } else if (z9) {
                                            numValueOf = null;
                                        } else {
                                            numValueOf = null;
                                        }
                                    } else if (z7) {
                                        if (z != 0) {
                                            numValueOf = Integer.valueOf(R.drawable.icon_video_call_fill);
                                        } else if (z9) {
                                            numValueOf = null;
                                        } else {
                                            numValueOf = null;
                                        }
                                    } else if (z != 0) {
                                        numValueOf = Integer.valueOf(R.drawable.icon_video_call_fill);
                                    } else if (z9) {
                                        numValueOf = null;
                                    } else {
                                        numValueOf = null;
                                    }
                                    if (numValueOf == null) {
                                        string2 = spannableStringValueOf;
                                    } else {
                                        nbcVarK = a8gVar.k(context);
                                        if (z8) {
                                            i3 = nbcVarK.b.getIcon().j;
                                        } else {
                                            i3 = nbcVarK.b.getIcon().b;
                                        }
                                        Drawable drawableE2 = o7j.e(numValueOf.intValue(), i3, context);
                                        drawableE2.setBounds(0, 0, gm0.K(yl5.d().getDisplayMetrics().density * 16.0f), gm0.K(16.0f * yl5.d().getDisplayMetrics().density));
                                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                                        spannableStringBuilder2.append((CharSequence) "   ");
                                        spannableStringBuilder2.append((CharSequence) spannableStringValueOf);
                                        spannableStringBuilder2.append((CharSequence) " ");
                                        spannableStringBuilder2.setSpan(new FitFontImageSpan(drawableE2, null, false, false, 14, null), 0, 1, 17);
                                        charSequence3 = spannableStringBuilder2;
                                    }
                                }
                                fd8 fd8Var5 = f62Var.g;
                                boolean z25 = fd8Var5.b;
                                boolean z26 = fd8Var5.c;
                                cn1Var.getClass();
                                cn1Var = new cn1(charSequence3, gn1Var, z25, z26);
                                mjgVar2 = mjgVar;
                            }
                            charSequence2 = string2;
                            charSequence3 = charSequence2;
                            fd8 fd8Var6 = f62Var.g;
                            boolean z27 = fd8Var6.b;
                            boolean z28 = fd8Var6.c;
                            cn1Var.getClass();
                            cn1Var = new cn1(charSequence3, gn1Var, z27, z28);
                            mjgVar2 = mjgVar;
                        }
                        if (mjgVar2.h(value, cn1Var)) {
                            return sbi.a;
                        }
                        mjgVar3 = mjgVar2;
                        gn1Var5 = gn1Var5;
                        gn1Var6 = gn1Var2;
                        gn1Var4 = gn1Var4;
                        gn1Var7 = gn1Var7;
                        vg4Var2 = vg4Var;
                        kn1Var2 = kn1Var;
                    } else {
                        i = 1;
                    }
                    z2 = f62Var.l;
                    iD = qt4.D(f62Var.g.a);
                    if (iD != 0) {
                        gn1Var = null;
                    } else if (iD != i) {
                        gn1Var = gn1Var4;
                    } else if (iD != 2) {
                        gn1Var = gn1Var5;
                    } else if (iD != 3) {
                        gn1Var = gn1Var6;
                    } else {
                        if (iD == 4) {
                            ore.o();
                            return null;
                        }
                        gn1Var = gn1Var7;
                    }
                    if (gn1Var == null) {
                        kn1Var = kn1Var2;
                        gn1Var2 = gn1Var6;
                        gn1Var4 = gn1Var4;
                        gn1Var7 = gn1Var7;
                        vg4Var = vg4Var2;
                        mjgVar2 = mjgVar3;
                    } else {
                        if (gn1Var != gn1Var7) {
                            z18 = f62Var.m;
                            if (!z18) {
                                if (f62Var.g.e) {
                                    gn1Var = gn1.e;
                                } else {
                                    gn1Var3 = cn1Var.b;
                                    if (gn1Var3 == gn1Var6) {
                                        gn1Var = gn1Var3;
                                    } else if (f62Var.l) {
                                        if (f62Var.m) {
                                            gn1Var = gn1Var4;
                                        } else {
                                            gn1Var = gn1Var6;
                                        }
                                    } else if (f62Var.m) {
                                        gn1Var = gn1Var4;
                                    } else {
                                        gn1Var = gn1Var6;
                                    }
                                }
                            } else if (f62Var.g.e) {
                                gn1Var = gn1.e;
                            } else {
                                gn1Var3 = cn1Var.b;
                                if (gn1Var3 == gn1Var6) {
                                    gn1Var = gn1Var3;
                                } else if (f62Var.l) {
                                    if (f62Var.m) {
                                        gn1Var = gn1Var4;
                                    } else {
                                        gn1Var = gn1Var6;
                                    }
                                } else if (f62Var.m) {
                                    gn1Var = gn1Var4;
                                } else {
                                    gn1Var = gn1Var6;
                                }
                            }
                        }
                        p32 p32Var2 = (p32) kn1Var2.f.getValue();
                        boolean z110 = f62Var.j;
                        z3 = f62Var.l;
                        name = kn1.class.getName();
                        a4cVar = gm0.f;
                        if (a4cVar == null) {
                            gn1Var2 = gn1Var6;
                        } else {
                            gn1Var2 = gn1Var6;
                            je9Var = je9.d;
                            if (a4cVar.b(je9Var)) {
                                obj2 = be1Var.c;
                                vg4Var = vg4Var2;
                                if (obj2 != null) {
                                    z4 = z2;
                                    strK = null;
                                } else if (gm0.c()) {
                                    strK = obj2.toString();
                                    z4 = z2;
                                } else {
                                    z4 = z2;
                                    if (obj2 instanceof Collection) {
                                        collection2 = (Collection) obj2;
                                        if (collection2.isEmpty()) {
                                            strK = "[]";
                                        } else {
                                            strK = c0a.k(collection2.size(), "[**", "**]");
                                        }
                                    } else if (obj2 instanceof Map) {
                                        map2 = (Map) obj2;
                                        if (map2.isEmpty()) {
                                            strK = "{}";
                                        } else {
                                            strK = c0a.k(map2.size(), "{**", "**}");
                                        }
                                    } else if (obj2 instanceof Object[]) {
                                        objArr2 = (Object[]) obj2;
                                        if (objArr2.length == 0) {
                                            strK = "[]";
                                        } else {
                                            strK = c0a.k(objArr2.length, "[**", "**]");
                                        }
                                    } else if (obj2 instanceof int[]) {
                                        iArr2 = (int[]) obj2;
                                        if (iArr2.length == 0) {
                                            strK = "[]";
                                        } else {
                                            strK = c0a.k(iArr2.length, "[**", "**]");
                                        }
                                    } else if (obj2 instanceof float[]) {
                                        fArr2 = (float[]) obj2;
                                        if (fArr2.length == 0) {
                                            strK = "[]";
                                        } else {
                                            strK = c0a.k(fArr2.length, "[**", "**]");
                                        }
                                    } else if (obj2 instanceof long[]) {
                                        jArr2 = (long[]) obj2;
                                        if (jArr2.length == 0) {
                                            strK = "[]";
                                        } else {
                                            strK = c0a.k(jArr2.length, "[**", "**]");
                                        }
                                    } else if (obj2 instanceof double[]) {
                                        dArr2 = (double[]) obj2;
                                        if (dArr2.length == 0) {
                                            strK = "[]";
                                        } else {
                                            strK = c0a.k(dArr2.length, "[**", "**]");
                                        }
                                    } else if (obj2 instanceof short[]) {
                                        sArr2 = (short[]) obj2;
                                        if (sArr2.length == 0) {
                                            strK = "[]";
                                        } else {
                                            strK = c0a.k(sArr2.length, "[**", "**]");
                                        }
                                    } else if (obj2 instanceof byte[]) {
                                        bArr2 = (byte[]) obj2;
                                        if (bArr2.length == 0) {
                                            strK = "[]";
                                        } else {
                                            strK = c0a.k(bArr2.length, "[**", "**]");
                                        }
                                    } else if (obj2 instanceof char[]) {
                                        cArr2 = (char[]) obj2;
                                        if (cArr2.length == 0) {
                                            strK = "[]";
                                        } else {
                                            strK = c0a.k(cArr2.length, "[**", "**]");
                                        }
                                    } else if (obj2 instanceof boolean[]) {
                                        zArr2 = (boolean[]) obj2;
                                        if (zArr2.length == 0) {
                                            strK = "[]";
                                        } else {
                                            strK = c0a.k(zArr2.length, "[**", "**]");
                                        }
                                    } else {
                                        strK = "***";
                                    }
                                }
                                obj3 = be1Var.d;
                                if (obj3 != null) {
                                    mjgVar = mjgVar3;
                                    strK2 = null;
                                } else if (gm0.c()) {
                                    strK2 = obj3.toString();
                                    mjgVar = mjgVar3;
                                } else {
                                    mjgVar = mjgVar3;
                                    if (obj3 instanceof Collection) {
                                        collection = (Collection) obj3;
                                        if (collection.isEmpty()) {
                                            strK2 = "[]";
                                        } else {
                                            strK2 = c0a.k(collection.size(), "[**", "**]");
                                        }
                                    } else if (obj3 instanceof Map) {
                                        map = (Map) obj3;
                                        if (map.isEmpty()) {
                                            strK2 = "{}";
                                        } else {
                                            strK2 = c0a.k(map.size(), "{**", "**}");
                                        }
                                    } else if (obj3 instanceof Object[]) {
                                        objArr = (Object[]) obj3;
                                        if (objArr.length == 0) {
                                            strK2 = "[]";
                                        } else {
                                            strK2 = c0a.k(objArr.length, "[**", "**]");
                                        }
                                    } else if (obj3 instanceof int[]) {
                                        iArr = (int[]) obj3;
                                        if (iArr.length == 0) {
                                            strK2 = "[]";
                                        } else {
                                            strK2 = c0a.k(iArr.length, "[**", "**]");
                                        }
                                    } else if (obj3 instanceof float[]) {
                                        fArr = (float[]) obj3;
                                        if (fArr.length == 0) {
                                            strK2 = "[]";
                                        } else {
                                            strK2 = c0a.k(fArr.length, "[**", "**]");
                                        }
                                    } else if (obj3 instanceof long[]) {
                                        jArr = (long[]) obj3;
                                        if (jArr.length == 0) {
                                            strK2 = "[]";
                                        } else {
                                            strK2 = c0a.k(jArr.length, "[**", "**]");
                                        }
                                    } else if (obj3 instanceof double[]) {
                                        dArr = (double[]) obj3;
                                        if (dArr.length == 0) {
                                            strK2 = "[]";
                                        } else {
                                            strK2 = c0a.k(dArr.length, "[**", "**]");
                                        }
                                    } else if (obj3 instanceof short[]) {
                                        sArr = (short[]) obj3;
                                        if (sArr.length == 0) {
                                            strK2 = "[]";
                                        } else {
                                            strK2 = c0a.k(sArr.length, "[**", "**]");
                                        }
                                    } else if (obj3 instanceof byte[]) {
                                        bArr = (byte[]) obj3;
                                        if (bArr.length == 0) {
                                            strK2 = "[]";
                                        } else {
                                            strK2 = c0a.k(bArr.length, "[**", "**]");
                                        }
                                    } else if (obj3 instanceof char[]) {
                                        cArr = (char[]) obj3;
                                        if (cArr.length == 0) {
                                            strK2 = "[]";
                                        } else {
                                            strK2 = c0a.k(cArr.length, "[**", "**]");
                                        }
                                    } else if (obj3 instanceof boolean[]) {
                                        zArr = (boolean[]) obj3;
                                        if (zArr.length == 0) {
                                            strK2 = "[]";
                                        } else {
                                            strK2 = c0a.k(zArr.length, "[**", "**]");
                                        }
                                    } else {
                                        strK2 = "***";
                                    }
                                }
                                boolean z29 = be1Var.l;
                                if (vg4Var != null) {
                                    boolValueOf = Boolean.valueOf(vg4Var.h());
                                } else {
                                    boolValueOf = null;
                                }
                                if (vg4Var != null) {
                                    boolValueOf2 = null;
                                } else {
                                    boolValueOf2 = null;
                                }
                                StringBuilder sbQ2 = qv1.q("getParticipantName, name:", strK, ", pushName: ", strK2, ", isContact: ");
                                sbQ2.append(z29);
                                sbQ2.append(", inUserList: ");
                                sbQ2.append(boolValueOf);
                                sbQ2.append(",isOrganization: ");
                                sbQ2.append(boolValueOf2);
                                hi6Var = null;
                                a4cVar.c(je9Var, name, sbQ2.toString(), null);
                            }
                            if (be1Var.l) {
                                z5 = true;
                            } else {
                                z5 = true;
                            }
                            if (vg4Var == null) {
                                z6 = false;
                            } else {
                                z6 = false;
                            }
                            if (z3) {
                                charSequence = be1Var.c;
                                string = charSequence;
                                if (charSequence == null) {
                                    string = "";
                                }
                            } else {
                                charSequence = be1Var.c;
                                string = charSequence;
                                if (charSequence == null) {
                                    string = "";
                                }
                            }
                            pi6Var = f62Var.k;
                            z7 = f62Var.m;
                            fd8 fd8Var7 = f62Var.g;
                            z8 = fd8Var7.d;
                            z9 = pi6Var instanceof ni6;
                            z10 = fd8Var7.e;
                            a8gVar = pq3.j;
                            context = p32Var2.a;
                            if (z10) {
                                kn1Var = kn1Var2;
                                string2 = context.getString(R.string.call_status_on_hold);
                            } else {
                                z11 = pi6Var instanceof hi6;
                                if (z11) {
                                    hi6Var2 = (hi6) pi6Var;
                                } else {
                                    hi6Var2 = hi6Var;
                                }
                                if (hi6Var2 != null) {
                                    obj4 = hi6Var2.a;
                                } else {
                                    obj4 = hi6Var;
                                }
                                if (obj4 == gi6.m) {
                                    z12 = true;
                                } else {
                                    if (z11) {
                                        hi6Var5 = (hi6) pi6Var;
                                    } else {
                                        hi6Var5 = hi6Var;
                                    }
                                    if (hi6Var5 != null) {
                                        obj8 = hi6Var5.a;
                                    } else {
                                        obj8 = hi6Var;
                                    }
                                    if (obj8 == gi6.a) {
                                        z12 = true;
                                    } else {
                                        z12 = false;
                                    }
                                }
                                if (z11) {
                                    hi6Var3 = (hi6) pi6Var;
                                } else {
                                    hi6Var3 = hi6Var;
                                }
                                if (hi6Var3 != null) {
                                    obj5 = hi6Var3.a;
                                } else {
                                    obj5 = hi6Var;
                                }
                                if (obj5 == gi6.e) {
                                    z13 = true;
                                } else {
                                    z13 = false;
                                }
                                if (z11) {
                                    hi6Var4 = (hi6) pi6Var;
                                } else {
                                    hi6Var4 = hi6Var;
                                }
                                if (hi6Var4 != null) {
                                    obj6 = hi6Var4.a;
                                } else {
                                    obj6 = hi6Var;
                                }
                                if (obj6 == gi6.f) {
                                    z14 = true;
                                } else {
                                    z14 = false;
                                }
                                if (z11) {
                                    z15 = false;
                                } else {
                                    z15 = false;
                                }
                                if (z11) {
                                    z16 = false;
                                } else {
                                    z16 = false;
                                }
                                if (z11) {
                                    z17 = false;
                                } else {
                                    z17 = false;
                                }
                                if (pi6Var instanceof oi6) {
                                    string = context.getString(R.string.call_me_in_waiting_room);
                                } else if (!z9) {
                                    if (z16) {
                                        if (string.length() == 0) {
                                            string = context.getString(R.string.opponent_no_network);
                                        } else {
                                            ?? sb4 = new StringBuilder();
                                            sb4.append(string);
                                            sb4.append(" · ");
                                            sb4.append(context.getString(R.string.opponent_no_network));
                                            string = sb4;
                                        }
                                    } else if (z15) {
                                        string = context.getString(R.string.call_opponent_failed);
                                    } else if (z17) {
                                        string = context.getString(R.string.call_indicator_unavailable_call);
                                    }
                                } else if (z16) {
                                    if (string.length() == 0) {
                                        string = context.getString(R.string.opponent_no_network);
                                    } else {
                                        ?? sb5 = new StringBuilder();
                                        sb5.append(string);
                                        sb5.append(" · ");
                                        sb5.append(context.getString(R.string.opponent_no_network));
                                        string = sb5;
                                    }
                                } else if (z15) {
                                    string = context.getString(R.string.call_opponent_failed);
                                } else if (z17) {
                                    string = context.getString(R.string.call_indicator_unavailable_call);
                                }
                                if (r5h.X0(string)) {
                                    kn1Var = kn1Var2;
                                    charSequence2 = null;
                                    charSequence3 = charSequence2;
                                } else {
                                    spannableStringValueOf = SpannableString.valueOf(string);
                                    spans = spannableStringValueOf.getSpans(0, spannableStringValueOf.length(), ImageSpan.class);
                                    if (spans == null) {
                                        spans = new ImageSpan[0];
                                    }
                                    length = spans.length;
                                    i2 = 0;
                                    while (true) {
                                        if (i2 < length) {
                                            obj7 = spans[i2];
                                            kn1Var = kn1Var2;
                                            if (((ImageSpan) obj7).getDrawable() instanceof osi) {
                                                i2++;
                                                kn1Var2 = kn1Var;
                                            }
                                        } else {
                                            kn1Var = kn1Var2;
                                            obj7 = null;
                                        }
                                    }
                                    imageSpan = (ImageSpan) obj7;
                                    if (imageSpan != null) {
                                        spannableStringValueOf.removeSpan(imageSpan);
                                    }
                                    if (!z16) {
                                        numValueOf = null;
                                    } else if (z != 0) {
                                        if (z == 0) {
                                            if (z7) {
                                                if (z7) {
                                                    if (z != 0) {
                                                        numValueOf = Integer.valueOf(R.drawable.icon_video_call_fill);
                                                    } else if (z9) {
                                                        numValueOf = null;
                                                    } else {
                                                        numValueOf = null;
                                                    }
                                                } else if (z != 0) {
                                                    numValueOf = Integer.valueOf(R.drawable.icon_video_call_fill);
                                                } else if (z9) {
                                                    numValueOf = null;
                                                } else {
                                                    numValueOf = null;
                                                }
                                            } else if (z7) {
                                                if (z != 0) {
                                                    numValueOf = Integer.valueOf(R.drawable.icon_video_call_fill);
                                                } else if (z9) {
                                                    numValueOf = null;
                                                } else {
                                                    numValueOf = null;
                                                }
                                            } else if (z != 0) {
                                                numValueOf = Integer.valueOf(R.drawable.icon_video_call_fill);
                                            } else if (z9) {
                                                numValueOf = null;
                                            } else {
                                                numValueOf = null;
                                            }
                                        } else if (z7) {
                                            if (z7) {
                                                if (z != 0) {
                                                    numValueOf = Integer.valueOf(R.drawable.icon_video_call_fill);
                                                } else if (z9) {
                                                    numValueOf = null;
                                                } else {
                                                    numValueOf = null;
                                                }
                                            } else if (z != 0) {
                                                numValueOf = Integer.valueOf(R.drawable.icon_video_call_fill);
                                            } else if (z9) {
                                                numValueOf = null;
                                            } else {
                                                numValueOf = null;
                                            }
                                        } else if (z7) {
                                            if (z != 0) {
                                                numValueOf = Integer.valueOf(R.drawable.icon_video_call_fill);
                                            } else if (z9) {
                                                numValueOf = null;
                                            } else {
                                                numValueOf = null;
                                            }
                                        } else if (z != 0) {
                                            numValueOf = Integer.valueOf(R.drawable.icon_video_call_fill);
                                        } else if (z9) {
                                            numValueOf = null;
                                        } else {
                                            numValueOf = null;
                                        }
                                    } else if (z == 0) {
                                        if (z7) {
                                            if (z7) {
                                                if (z != 0) {
                                                    numValueOf = Integer.valueOf(R.drawable.icon_video_call_fill);
                                                } else if (z9) {
                                                    numValueOf = null;
                                                } else {
                                                    numValueOf = null;
                                                }
                                            } else if (z != 0) {
                                                numValueOf = Integer.valueOf(R.drawable.icon_video_call_fill);
                                            } else if (z9) {
                                                numValueOf = null;
                                            } else {
                                                numValueOf = null;
                                            }
                                        } else if (z7) {
                                            if (z != 0) {
                                                numValueOf = Integer.valueOf(R.drawable.icon_video_call_fill);
                                            } else if (z9) {
                                                numValueOf = null;
                                            } else {
                                                numValueOf = null;
                                            }
                                        } else if (z != 0) {
                                            numValueOf = Integer.valueOf(R.drawable.icon_video_call_fill);
                                        } else if (z9) {
                                            numValueOf = null;
                                        } else {
                                            numValueOf = null;
                                        }
                                    } else if (z7) {
                                        if (z7) {
                                            if (z != 0) {
                                                numValueOf = Integer.valueOf(R.drawable.icon_video_call_fill);
                                            } else if (z9) {
                                                numValueOf = null;
                                            } else {
                                                numValueOf = null;
                                            }
                                        } else if (z != 0) {
                                            numValueOf = Integer.valueOf(R.drawable.icon_video_call_fill);
                                        } else if (z9) {
                                            numValueOf = null;
                                        } else {
                                            numValueOf = null;
                                        }
                                    } else if (z7) {
                                        if (z != 0) {
                                            numValueOf = Integer.valueOf(R.drawable.icon_video_call_fill);
                                        } else if (z9) {
                                            numValueOf = null;
                                        } else {
                                            numValueOf = null;
                                        }
                                    } else if (z != 0) {
                                        numValueOf = Integer.valueOf(R.drawable.icon_video_call_fill);
                                    } else if (z9) {
                                        numValueOf = null;
                                    } else {
                                        numValueOf = null;
                                    }
                                    if (numValueOf == null) {
                                        string2 = spannableStringValueOf;
                                    } else {
                                        nbcVarK = a8gVar.k(context);
                                        if (z8) {
                                            i3 = nbcVarK.b.getIcon().j;
                                        } else {
                                            i3 = nbcVarK.b.getIcon().b;
                                        }
                                        Drawable drawableE3 = o7j.e(numValueOf.intValue(), i3, context);
                                        drawableE3.setBounds(0, 0, gm0.K(yl5.d().getDisplayMetrics().density * 16.0f), gm0.K(16.0f * yl5.d().getDisplayMetrics().density));
                                        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
                                        spannableStringBuilder3.append((CharSequence) "   ");
                                        spannableStringBuilder3.append((CharSequence) spannableStringValueOf);
                                        spannableStringBuilder3.append((CharSequence) " ");
                                        spannableStringBuilder3.setSpan(new FitFontImageSpan(drawableE3, null, false, false, 14, null), 0, 1, 17);
                                        charSequence3 = spannableStringBuilder3;
                                    }
                                }
                                fd8 fd8Var8 = f62Var.g;
                                boolean z210 = fd8Var8.b;
                                boolean z211 = fd8Var8.c;
                                cn1Var.getClass();
                                cn1Var = new cn1(charSequence3, gn1Var, z210, z211);
                                mjgVar2 = mjgVar;
                            }
                            charSequence2 = string2;
                            charSequence3 = charSequence2;
                            fd8 fd8Var9 = f62Var.g;
                            boolean z212 = fd8Var9.b;
                            boolean z213 = fd8Var9.c;
                            cn1Var.getClass();
                            cn1Var = new cn1(charSequence3, gn1Var, z212, z213);
                            mjgVar2 = mjgVar;
                        }
                        vg4Var = vg4Var2;
                        mjgVar = mjgVar3;
                        z4 = z2;
                        hi6Var = null;
                        if (be1Var.l) {
                            z5 = true;
                        } else {
                            z5 = true;
                        }
                        if (vg4Var == null) {
                            z6 = false;
                        } else {
                            z6 = false;
                        }
                        if (z3) {
                            charSequence = be1Var.c;
                            string = charSequence;
                            if (charSequence == null) {
                                string = "";
                            }
                        } else {
                            charSequence = be1Var.c;
                            string = charSequence;
                            if (charSequence == null) {
                                string = "";
                            }
                        }
                        pi6Var = f62Var.k;
                        z7 = f62Var.m;
                        fd8 fd8Var10 = f62Var.g;
                        z8 = fd8Var10.d;
                        z9 = pi6Var instanceof ni6;
                        z10 = fd8Var10.e;
                        a8gVar = pq3.j;
                        context = p32Var2.a;
                        if (z10) {
                            kn1Var = kn1Var2;
                            string2 = context.getString(R.string.call_status_on_hold);
                        } else {
                            z11 = pi6Var instanceof hi6;
                            if (z11) {
                                hi6Var2 = (hi6) pi6Var;
                            } else {
                                hi6Var2 = hi6Var;
                            }
                            if (hi6Var2 != null) {
                                obj4 = hi6Var2.a;
                            } else {
                                obj4 = hi6Var;
                            }
                            if (obj4 == gi6.m) {
                                z12 = true;
                            } else {
                                if (z11) {
                                    hi6Var5 = (hi6) pi6Var;
                                } else {
                                    hi6Var5 = hi6Var;
                                }
                                if (hi6Var5 != null) {
                                    obj8 = hi6Var5.a;
                                } else {
                                    obj8 = hi6Var;
                                }
                                if (obj8 == gi6.a) {
                                    z12 = true;
                                } else {
                                    z12 = false;
                                }
                            }
                            if (z11) {
                                hi6Var3 = (hi6) pi6Var;
                            } else {
                                hi6Var3 = hi6Var;
                            }
                            if (hi6Var3 != null) {
                                obj5 = hi6Var3.a;
                            } else {
                                obj5 = hi6Var;
                            }
                            if (obj5 == gi6.e) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            if (z11) {
                                hi6Var4 = (hi6) pi6Var;
                            } else {
                                hi6Var4 = hi6Var;
                            }
                            if (hi6Var4 != null) {
                                obj6 = hi6Var4.a;
                            } else {
                                obj6 = hi6Var;
                            }
                            if (obj6 == gi6.f) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            if (z11) {
                                z15 = false;
                            } else {
                                z15 = false;
                            }
                            if (z11) {
                                z16 = false;
                            } else {
                                z16 = false;
                            }
                            if (z11) {
                                z17 = false;
                            } else {
                                z17 = false;
                            }
                            if (pi6Var instanceof oi6) {
                                string = context.getString(R.string.call_me_in_waiting_room);
                            } else if (!z9) {
                                if (z16) {
                                    if (string.length() == 0) {
                                        string = context.getString(R.string.opponent_no_network);
                                    } else {
                                        ?? sb6 = new StringBuilder();
                                        sb6.append(string);
                                        sb6.append(" · ");
                                        sb6.append(context.getString(R.string.opponent_no_network));
                                        string = sb6;
                                    }
                                } else if (z15) {
                                    string = context.getString(R.string.call_opponent_failed);
                                } else if (z17) {
                                    string = context.getString(R.string.call_indicator_unavailable_call);
                                }
                            } else if (z16) {
                                if (string.length() == 0) {
                                    string = context.getString(R.string.opponent_no_network);
                                } else {
                                    ?? sb7 = new StringBuilder();
                                    sb7.append(string);
                                    sb7.append(" · ");
                                    sb7.append(context.getString(R.string.opponent_no_network));
                                    string = sb7;
                                }
                            } else if (z15) {
                                string = context.getString(R.string.call_opponent_failed);
                            } else if (z17) {
                                string = context.getString(R.string.call_indicator_unavailable_call);
                            }
                            if (r5h.X0(string)) {
                                kn1Var = kn1Var2;
                                charSequence2 = null;
                                charSequence3 = charSequence2;
                            } else {
                                spannableStringValueOf = SpannableString.valueOf(string);
                                spans = spannableStringValueOf.getSpans(0, spannableStringValueOf.length(), ImageSpan.class);
                                if (spans == null) {
                                    spans = new ImageSpan[0];
                                }
                                length = spans.length;
                                i2 = 0;
                                while (true) {
                                    if (i2 < length) {
                                        obj7 = spans[i2];
                                        kn1Var = kn1Var2;
                                        if (((ImageSpan) obj7).getDrawable() instanceof osi) {
                                            i2++;
                                            kn1Var2 = kn1Var;
                                        }
                                    } else {
                                        kn1Var = kn1Var2;
                                        obj7 = null;
                                    }
                                }
                                imageSpan = (ImageSpan) obj7;
                                if (imageSpan != null) {
                                    spannableStringValueOf.removeSpan(imageSpan);
                                }
                                if (!z16) {
                                    numValueOf = null;
                                } else if (z != 0) {
                                    if (z == 0) {
                                        if (z7) {
                                            if (z7) {
                                                if (z != 0) {
                                                    numValueOf = Integer.valueOf(R.drawable.icon_video_call_fill);
                                                } else if (z9) {
                                                    numValueOf = null;
                                                } else {
                                                    numValueOf = null;
                                                }
                                            } else if (z != 0) {
                                                numValueOf = Integer.valueOf(R.drawable.icon_video_call_fill);
                                            } else if (z9) {
                                                numValueOf = null;
                                            } else {
                                                numValueOf = null;
                                            }
                                        } else if (z7) {
                                            if (z != 0) {
                                                numValueOf = Integer.valueOf(R.drawable.icon_video_call_fill);
                                            } else if (z9) {
                                                numValueOf = null;
                                            } else {
                                                numValueOf = null;
                                            }
                                        } else if (z != 0) {
                                            numValueOf = Integer.valueOf(R.drawable.icon_video_call_fill);
                                        } else if (z9) {
                                            numValueOf = null;
                                        } else {
                                            numValueOf = null;
                                        }
                                    } else if (z7) {
                                        if (z7) {
                                            if (z != 0) {
                                                numValueOf = Integer.valueOf(R.drawable.icon_video_call_fill);
                                            } else if (z9) {
                                                numValueOf = null;
                                            } else {
                                                numValueOf = null;
                                            }
                                        } else if (z != 0) {
                                            numValueOf = Integer.valueOf(R.drawable.icon_video_call_fill);
                                        } else if (z9) {
                                            numValueOf = null;
                                        } else {
                                            numValueOf = null;
                                        }
                                    } else if (z7) {
                                        if (z != 0) {
                                            numValueOf = Integer.valueOf(R.drawable.icon_video_call_fill);
                                        } else if (z9) {
                                            numValueOf = null;
                                        } else {
                                            numValueOf = null;
                                        }
                                    } else if (z != 0) {
                                        numValueOf = Integer.valueOf(R.drawable.icon_video_call_fill);
                                    } else if (z9) {
                                        numValueOf = null;
                                    } else {
                                        numValueOf = null;
                                    }
                                } else if (z == 0) {
                                    if (z7) {
                                        if (z7) {
                                            if (z != 0) {
                                                numValueOf = Integer.valueOf(R.drawable.icon_video_call_fill);
                                            } else if (z9) {
                                                numValueOf = null;
                                            } else {
                                                numValueOf = null;
                                            }
                                        } else if (z != 0) {
                                            numValueOf = Integer.valueOf(R.drawable.icon_video_call_fill);
                                        } else if (z9) {
                                            numValueOf = null;
                                        } else {
                                            numValueOf = null;
                                        }
                                    } else if (z7) {
                                        if (z != 0) {
                                            numValueOf = Integer.valueOf(R.drawable.icon_video_call_fill);
                                        } else if (z9) {
                                            numValueOf = null;
                                        } else {
                                            numValueOf = null;
                                        }
                                    } else if (z != 0) {
                                        numValueOf = Integer.valueOf(R.drawable.icon_video_call_fill);
                                    } else if (z9) {
                                        numValueOf = null;
                                    } else {
                                        numValueOf = null;
                                    }
                                } else if (z7) {
                                    if (z7) {
                                        if (z != 0) {
                                            numValueOf = Integer.valueOf(R.drawable.icon_video_call_fill);
                                        } else if (z9) {
                                            numValueOf = null;
                                        } else {
                                            numValueOf = null;
                                        }
                                    } else if (z != 0) {
                                        numValueOf = Integer.valueOf(R.drawable.icon_video_call_fill);
                                    } else if (z9) {
                                        numValueOf = null;
                                    } else {
                                        numValueOf = null;
                                    }
                                } else if (z7) {
                                    if (z != 0) {
                                        numValueOf = Integer.valueOf(R.drawable.icon_video_call_fill);
                                    } else if (z9) {
                                        numValueOf = null;
                                    } else {
                                        numValueOf = null;
                                    }
                                } else if (z != 0) {
                                    numValueOf = Integer.valueOf(R.drawable.icon_video_call_fill);
                                } else if (z9) {
                                    numValueOf = null;
                                } else {
                                    numValueOf = null;
                                }
                                if (numValueOf == null) {
                                    string2 = spannableStringValueOf;
                                } else {
                                    nbcVarK = a8gVar.k(context);
                                    if (z8) {
                                        i3 = nbcVarK.b.getIcon().j;
                                    } else {
                                        i3 = nbcVarK.b.getIcon().b;
                                    }
                                    Drawable drawableE4 = o7j.e(numValueOf.intValue(), i3, context);
                                    drawableE4.setBounds(0, 0, gm0.K(yl5.d().getDisplayMetrics().density * 16.0f), gm0.K(16.0f * yl5.d().getDisplayMetrics().density));
                                    SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder();
                                    spannableStringBuilder4.append((CharSequence) "   ");
                                    spannableStringBuilder4.append((CharSequence) spannableStringValueOf);
                                    spannableStringBuilder4.append((CharSequence) " ");
                                    spannableStringBuilder4.setSpan(new FitFontImageSpan(drawableE4, null, false, false, 14, null), 0, 1, 17);
                                    charSequence3 = spannableStringBuilder4;
                                }
                            }
                            fd8 fd8Var11 = f62Var.g;
                            boolean z214 = fd8Var11.b;
                            boolean z215 = fd8Var11.c;
                            cn1Var.getClass();
                            cn1Var = new cn1(charSequence3, gn1Var, z214, z215);
                            mjgVar2 = mjgVar;
                        }
                        charSequence2 = string2;
                        charSequence3 = charSequence2;
                        fd8 fd8Var12 = f62Var.g;
                        boolean z216 = fd8Var12.b;
                        boolean z217 = fd8Var12.c;
                        cn1Var.getClass();
                        cn1Var = new cn1(charSequence3, gn1Var, z216, z217);
                        mjgVar2 = mjgVar;
                    }
                    if (mjgVar2.h(value, cn1Var)) {
                        return sbi.a;
                    }
                    mjgVar3 = mjgVar2;
                    gn1Var5 = gn1Var5;
                    gn1Var6 = gn1Var2;
                    gn1Var4 = gn1Var4;
                    gn1Var7 = gn1Var7;
                    vg4Var2 = vg4Var;
                    kn1Var2 = kn1Var;
                }
                break;
            case 1:
                List arrayList = (List) this.f;
                List list = (List) this.g;
                Set set = (Set) this.h;
                ch3.d0(obj);
                q04 q04Var = (q04) this.i;
                baa baaVar = q04Var.d;
                Iterable<n63> iterable = (Iterable) baaVar.b().a.getValue();
                int iP0 = wm9.P0(yw3.W0(iterable, 10));
                if (iP0 < 16) {
                    iP0 = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iP0);
                for (n63 n63Var : iterable) {
                    linkedHashMap.put(new Long(n63Var.a.v()), new ylc(new Long(n63Var.c), new Long(n63Var.d)));
                }
                if (list != null) {
                    List list2 = list;
                    arrayList = new ArrayList(yw3.W0(list2, 10));
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        arrayList.add(q04Var.D((vg4) it.next(), linkedHashMap));
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                for (Object obj9 : (Iterable) arrayList) {
                    if (!set.contains(new Long(((e04) obj9).a))) {
                        arrayList2.add(obj9);
                    }
                }
                boolean zA = baaVar.a();
                if (arrayList2.isEmpty()) {
                    return zA ? j04.a : new i04(((Boolean) q04Var.l.getValue()).booleanValue());
                }
                return new h04(arrayList2, zA);
            case 2:
                v9a v9aVar = (v9a) this.i;
                Integer num = v9aVar.e;
                List list3 = (List) this.f;
                List list4 = (List) this.g;
                i8a i8aVar = (i8a) this.h;
                ch3.d0(obj);
                boolean z30 = list4 != null;
                if (z30) {
                    List list5 = list4;
                    T1 = new ArrayList(yw3.W0(list5, 10));
                    Iterator it2 = list5.iterator();
                    while (it2.hasNext()) {
                        T1.add(((kc5) v9aVar.m.getValue()).g((vg4) it2.next()));
                    }
                } else {
                    List listN1 = list3;
                    if (num != null) {
                        listN1 = ww3.N1(listN1, num.intValue());
                    }
                    T1 = ww3.T1(listN1);
                }
                ?? r8 = T1;
                boolean z31 = !z30 && ((baa) v9aVar.i.getValue()).a() && (num == null || r8.size() < num.intValue());
                List<e8a> list6 = i8aVar.a;
                ArrayList arrayList3 = new ArrayList(yw3.W0(list6, 10));
                for (e8a e8aVar : list6) {
                    arrayList3.add(new f8a(e8aVar.a, e8aVar.b, e8aVar.c, e8aVar.d, e8aVar.e));
                }
                List<e8a> list7 = i8aVar.b;
                ArrayList arrayList4 = new ArrayList(yw3.W0(list7, 10));
                for (e8a e8aVar2 : list7) {
                    arrayList4.add(new f8a(e8aVar2.a, e8aVar2.b, e8aVar2.c, e8aVar2.d, e8aVar2.e));
                }
                return new p9a(r8, arrayList3, arrayList4, z30, z31);
            default:
                s66 s66Var = s66.a;
                rt2 rt2Var = (rt2) this.f;
                vg4 vg4Var3 = (vg4) this.h;
                List list8 = (List) this.g;
                ch3.d0(obj);
                List listW0 = yhf.w0(yhf.m0(yhf.n0(new sw(1, rt2Var.g), new chf(14)), new bad((gbg) this.i, 10, rt2Var)));
                gbg gbgVar = (gbg) this.i;
                int size = listW0.size();
                je9 je9Var2 = je9.d;
                if (rt2Var.C0()) {
                    size++;
                }
                int i4 = dbg.$EnumSwitchMapping$0[gbgVar.b.ordinal()];
                nx2 nx2Var = rt2Var.b;
                int iB = i4 == 1 ? nx2Var.T.c : nx2Var.b();
                String str = gbgVar.o;
                a4c a4cVar2 = gm0.f;
                if (a4cVar2 != null && a4cVar2.b(je9Var2)) {
                    a4cVar2.c(je9Var2, str, "Chat(serverId = " + rt2Var.A() + "). Type = " + gbgVar.b + ", participants for type = " + iB + ". Common size = " + rt2Var.b.b(), null);
                }
                String str2 = gbgVar.o;
                a4c a4cVar3 = gm0.f;
                if (a4cVar3 != null && a4cVar3.b(je9Var2)) {
                    a4cVar3.c(je9Var2, str2, qt4.l("Contacts before filter: ", rt2Var.g.size(), size, ". After filter = "), null);
                }
                if (iB != size) {
                    String str3 = gbgVar.o;
                    a4c a4cVar4 = gm0.f;
                    if (a4cVar4 != null) {
                        je9 je9Var3 = je9.f;
                        if (a4cVar4.b(je9Var3)) {
                            a4cVar4.c(je9Var3, str3, zo5.v(c0a.q(iB, rt2Var.A(), "Inconsistent count of members for chat(#", "). Expected size="), ", realSize=", size), null);
                        }
                    }
                    baa baaVar2 = ((gbg) this.i).d;
                    if (baaVar2 != null && baaVar2.a()) {
                        String str4 = ((gbg) this.i).o;
                        a4c a4cVar5 = gm0.f;
                        if (a4cVar5 != null && a4cVar5.b(je9Var2)) {
                            a4cVar5.c(je9Var2, str4, "Try load members from server", null);
                        }
                        ((gbg) this.i).d.g();
                    }
                }
                gbg gbgVar2 = (gbg) this.i;
                String str5 = gbgVar2.o;
                a4c a4cVar6 = gm0.f;
                if (a4cVar6 != null && a4cVar6.b(je9Var2)) {
                    int size2 = listW0.size();
                    int size3 = list8.size();
                    int i5 = gbgVar2.e;
                    StringBuilder sbP = qv1.p("Members loaded with success, filtered count:", size2, ", members count: ", size3, ", limit: ");
                    sbP.append(i5);
                    a4cVar6.c(je9Var2, str5, sbP.toString(), null);
                }
                if (list8.isEmpty()) {
                    return rt2Var.C0() ? baa.f(rt2Var, ww3.G1(ww3.N1(listW0, ((gbg) this.i).e), Collections.singletonList(vg4Var3)), s66Var) : baa.f(rt2Var, ww3.N1(listW0, ((gbg) this.i).e), s66Var);
                }
                return ww3.N1(list8, ((gbg) this.i).e);
        }
    }
}
