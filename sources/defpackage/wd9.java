package defpackage;

import java.util.List;
import java.util.concurrent.CancellationException;
import one.me.login.confirm.ConfirmPhoneScreen;
import one.me.stories.core.workers.StoryPublishWorker;
import ru.ok.android.externcalls.sdk.Conversation;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final class wd9 extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public int f;
    public Object g;
    public Object h;
    public int i;
    public Object j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wd9(lq4 lq4Var, int i, j0f j0fVar, wp6 wp6Var, int i2) {
        super(2, lq4Var);
        this.e = 11;
        this.f = i;
        this.j = j0fVar;
        this.h = wp6Var;
        this.i = i2;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x009e A[PHI: r5
  0x009e: PHI (r5v4 rt2) = (r5v3 rt2), (r5v5 rt2) binds: [B:18:0x0069, B:23:0x007d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:39:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:40:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:46:0x00d9 A[PHI: r5
  0x00d9: PHI (r5v6 rt2) = (r5v4 rt2), (r5v4 rt2), (r5v8 rt2) binds: [B:36:0x00ae, B:34:0x00a8, B:44:0x00d5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:62:0x0110  */
    /* JADX WARN: Code duplicated, block: B:65:0x011d  */
    /* JADX WARN: Code duplicated, block: B:66:0x0126  */
    /* JADX WARN: Code duplicated, block: B:68:0x012c  */
    /* JADX WARN: Code duplicated, block: B:71:0x013b  */
    /* JADX WARN: Code duplicated, block: B:73:0x013f  */
    /* JADX WARN: Code duplicated, block: B:74:0x0148  */
    /* JADX WARN: Code duplicated, block: B:77:0x0156  */
    /* JADX WARN: Code duplicated, block: B:78:0x015f  */
    /* JADX WARN: Code duplicated, block: B:81:0x016f  */
    /* JADX WARN: Code duplicated, block: B:82:0x018b  */
    /* JADX WARN: Code duplicated, block: B:84:0x018f  */
    /* JADX WARN: Code duplicated, block: B:85:0x0198  */
    /* JADX WARN: Code duplicated, block: B:86:0x019a  */
    /* JADX WARN: Code duplicated, block: B:89:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:93:0x01c3 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:96:0x01d5  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0089, code lost:
    
        if (r0 == r14) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00cc, code lost:
    
        if (r2 == r14) goto L53;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object l(java.lang.Object r22) {
        /*
            Method dump skipped, instruction units count: 484
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wd9.l(java.lang.Object):java.lang.Object");
    }

    private final Object n(Object obj) {
        int i;
        pzf pzfVar = ((j0f) this.j).h;
        kyj kyjVar = (kyj) this.g;
        ch3.d0(obj);
        int iOrdinal = kyjVar.ordinal();
        if (iOrdinal == 2) {
            int iD = qt4.D(this.f);
            tnh tnhVar = null;
            if (iD != 0) {
                if (iD == 1) {
                    tnhVar = new tnh(R.string.oneme_media_download_viewer_video_download_complete);
                } else if (iD != 2 && iD != 3) {
                    ore.o();
                    return null;
                }
            }
            if (tnhVar != null) {
                pzfVar.a(new zze(tnhVar, new Integer(R.drawable.download_video_fill)));
            }
        } else if (iOrdinal == 3 || iOrdinal == 5) {
            gm0.n(((wp6) this.h).getClass().getName(), "Download was cancelled or failed");
            int iD2 = qt4.D(this.i);
            if (iD2 != 0) {
                i = iD2 != 1 ? R.string.oneme_media_download_viewer_media_download_error : R.string.oneme_media_download_viewer_video_download_error;
            } else {
                i = R.string.oneme_media_download_viewer_photo_download_error;
            }
            pzfVar.a(new zze(new tnh(i), new Integer(R.drawable.icon_warning_fill)));
        }
        return sbi.a;
    }

    private final Object o(Object obj) {
        int i = this.f;
        if (i != 0) {
            if (i == 1) {
                ch3.d0(obj);
                return obj;
            }
            ore.k("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ch3.d0(obj);
        sih sihVar = (sih) ((w8f) this.g).a.getValue();
        String str = (String) this.j;
        int i2 = this.i;
        String str2 = (String) this.h;
        wy2 wy2Var = new wy2((kfc) null, 12);
        wy2Var.h("query", str);
        wy2Var.c(i2, "count");
        if (!ch3.r(str2)) {
            wy2Var.h("marker", str2);
        }
        this.f = 1;
        Object objG = sihVar.a.g(wy2Var, this);
        hu4 hu4Var = hu4.a;
        return objG == hu4Var ? hu4Var : objG;
    }

    private final Object p(Object obj) {
        int i = this.f;
        if (i != 0) {
            if (i == 1) {
                ch3.d0(obj);
                return obj;
            }
            ore.k("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ch3.d0(obj);
        sih sihVar = (sih) ((d9f) this.g).a.getValue();
        String str = (String) this.j;
        int i2 = this.i;
        Long l = (Long) this.h;
        long jLongValue = l != null ? l.longValue() : 0L;
        h3b h3bVar = new h3b((kfc) null, 18);
        h3bVar.h("query", str);
        h3bVar.c(i2, "count");
        if (jLongValue != 0) {
            h3bVar.f(jLongValue, "marker");
        }
        h3bVar.h("type", "ALL");
        this.f = 1;
        Object objG = sihVar.a.g(h3bVar, this);
        hu4 hu4Var = hu4.a;
        return objG == hu4Var ? hu4Var : objG;
    }

    private final Object q(Object obj) throws Throwable {
        Throwable th;
        int i;
        Object poeVar;
        tlg tlgVar = (tlg) this.j;
        amg amgVar = (amg) this.h;
        ic6 ic6Var = amgVar.t;
        gu4 gu4Var = (gu4) this.g;
        int i2 = this.i;
        sbi sbiVar = sbi.a;
        if (i2 == 0) {
            ch3.d0(obj);
            boolean z = !tlgVar.i;
            try {
                um6 um6Var = (um6) amgVar.i.getValue();
                long j = tlgVar.a;
                this.g = gu4Var;
                this.f = z ? 1 : 0;
                this.i = 1;
                Object objK = um6Var.k(j, z, this);
                hu4 hu4Var = hu4.a;
                if (objK == hu4Var) {
                    return hu4Var;
                }
                i = z ? 1 : 0;
                poeVar = sbiVar;
            } catch (Throwable th2) {
                th = th2;
                i = z ? 1 : 0;
                poeVar = new poe(th);
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = this.f;
            try {
                ch3.d0(obj);
                poeVar = sbiVar;
            } catch (Throwable th3) {
                th = th3;
                poeVar = new poe(th);
            }
        }
        if (!(poeVar instanceof poe)) {
            mjg mjgVar = amgVar.v;
            tlg tlgVarI = tlg.i(tlgVar, i != 0, false, 15359);
            mjgVar.getClass();
            mjgVar.j(null, tlgVarI);
            boolean z2 = i != 0;
            a8j.x(ic6Var, new q3g(z2 ? R.drawable.icon_check : R.drawable.icon_delete, z2 ? new tnh(R.string.oneme_stickers_preview_snackbar_favorite_added) : new tnh(R.string.oneme_stickers_preview_snackbar_favorite_removed)));
        }
        Throwable thA = roe.a(poeVar);
        if (thA != null) {
            if (thA instanceof CancellationException) {
                throw thA;
            }
            gm0.V(gu4Var.getClass().getName(), "Can't toggle favorite for selected sticker", thA);
            a8j.x(ic6Var, amg.B(amgVar, thA));
        }
        amgVar.E = null;
        return sbiVar;
    }

    private final Object r(Object obj) throws Throwable {
        Throwable th;
        int i;
        Object poeVar;
        amg amgVar = (amg) this.h;
        ic6 ic6Var = amgVar.t;
        gu4 gu4Var = (gu4) this.g;
        int i2 = this.i;
        sbi sbiVar = sbi.a;
        if (i2 == 0) {
            ch3.d0(obj);
            omg omgVar = (omg) this.j;
            int i3 = omgVar.f;
            int i4 = i3 != 2 ? 1 : 0;
            try {
                zv8[] zv8VarArr = amg.G;
                ldh ldhVar = (ldh) amgVar.j.getValue();
                try {
                    long j = omgVar.a;
                    boolean z = i3 != 2;
                    this.g = gu4Var;
                    this.f = i4;
                    this.i = 1;
                    Object objP = ldhVar.p(j, z, this);
                    hu4 hu4Var = hu4.a;
                    if (objP == hu4Var) {
                        return hu4Var;
                    }
                    i = i4;
                    poeVar = sbiVar;
                } catch (Throwable th2) {
                    th = th2;
                    i = i4;
                    poeVar = new poe(th);
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = this.f;
            try {
                ch3.d0(obj);
                poeVar = sbiVar;
            } catch (Throwable th4) {
                th = th4;
                poeVar = new poe(th);
            }
        }
        if (!(poeVar instanceof poe)) {
            boolean z2 = i != 0;
            a8j.x(ic6Var, new q3g(z2 ? R.drawable.icon_check : R.drawable.icon_delete, z2 ? new tnh(R.string.oneme_stickers_set_snackbar_favorite_added) : new tnh(R.string.oneme_stickers_set_snackbar_favorite_removed)));
        }
        Throwable thA = roe.a(poeVar);
        if (thA != null) {
            if (thA instanceof CancellationException) {
                throw thA;
            }
            gm0.V(gu4Var.getClass().getName(), "Can't toggle favorite for sticker set", thA);
            a8j.x(ic6Var, amg.B(amgVar, thA));
        }
        amgVar.F = null;
        return sbiVar;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        switch (this.e) {
            case 0:
                return new wd9(this.i, this.g, lq4Var, (ae9) this.j);
            case 1:
                wd9 wd9Var = new wd9((List) this.h, this.i, (op1) this.j, lq4Var);
                wd9Var.g = obj;
                return wd9Var;
            case 2:
                return new wd9((List) this.h, lq4Var, (pm2) this.g, this.i);
            case 3:
                wd9 wd9Var2 = new wd9((l63) this.j, lq4Var);
                wd9Var2.g = obj;
                return wd9Var2;
            case 4:
                return new wd9((ConfirmPhoneScreen) this.h, lq4Var, 4);
            case 5:
                wd9 wd9Var3 = new wd9((xh4) this.h, lq4Var, 5);
                wd9Var3.g = obj;
                return wd9Var3;
            case 6:
                wd9 wd9Var4 = new wd9(this.i, (y85) this.j, (Conversation) this.h, lq4Var);
                wd9Var4.g = obj;
                return wd9Var4;
            case 7:
                wd9 wd9Var5 = new wd9((rb8) this.h, lq4Var, 7);
                wd9Var5.g = obj;
                return wd9Var5;
            case 8:
                return new wd9((jsa) this.j, (List) this.h, lq4Var, 8);
            case 9:
                return new wd9((x5b) this.h, lq4Var, 9);
            case 10:
                return new wd9((kfb) this.h, lq4Var, 10);
            case 11:
                wd9 wd9Var6 = new wd9(lq4Var, this.f, (j0f) this.j, (wp6) this.h, this.i);
                wd9Var6.g = obj;
                return wd9Var6;
            case 12:
                return new wd9((w8f) this.g, (String) this.j, this.i, (String) this.h, lq4Var, 12);
            case 13:
                return new wd9((d9f) this.g, (String) this.j, this.i, (Long) this.h, lq4Var, 13);
            case 14:
                wd9 wd9Var7 = new wd9((tlg) this.j, (amg) this.h, lq4Var, 14);
                wd9Var7.g = obj;
                return wd9Var7;
            case 15:
                wd9 wd9Var8 = new wd9((omg) this.j, (amg) this.h, lq4Var, 15);
                wd9Var8.g = obj;
                return wd9Var8;
            default:
                wd9 wd9Var9 = new wd9((StoryPublishWorker) this.h, lq4Var, 16);
                wd9Var9.g = obj;
                return wd9Var9;
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        int i = this.e;
        sbi sbiVar = sbi.a;
        switch (i) {
            case 0:
                return ((wd9) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 1:
                return ((wd9) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 2:
                return ((wd9) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 3:
                return ((wd9) create((ylc) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 4:
                return ((wd9) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 5:
                return ((wd9) create((String) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 6:
                return ((wd9) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 7:
                return ((wd9) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 8:
                return ((wd9) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 9:
                return ((wd9) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 10:
                return ((wd9) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 11:
                ((wd9) create((kyj) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 12:
                return ((wd9) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 13:
                return ((wd9) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 14:
                return ((wd9) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 15:
                return ((wd9) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            default:
                return ((wd9) create((jzg) obj, (lq4) obj2)).invokeSuspend(sbiVar);
        }
    }

    /* JADX WARN: Code duplicated, block: B:181:0x0450  */
    /* JADX WARN: Code duplicated, block: B:22:0x0076  */
    /* JADX WARN: Code duplicated, block: B:23:0x0079  */
    /* JADX WARN: Code duplicated, block: B:242:0x0570 A[PHI: r4
  0x0570: PHI (r4v46 mjg) = (r4v45 mjg), (r4v45 mjg), (r4v48 mjg) binds: [B:244:0x0579, B:240:0x055c, B:253:0x05b3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:252:0x05a8  */
    /* JADX WARN: Code duplicated, block: B:253:0x05b3  */
    /* JADX WARN: Code duplicated, block: B:25:0x007c  */
    /* JADX WARN: Code duplicated, block: B:271:0x0628 A[PHI: r0 r1 r3
  0x0628: PHI (r0v38 int) = (r0v36 int), (r0v43 int) binds: [B:294:0x0765, B:270:0x061b] A[DONT_GENERATE, DONT_INLINE]
  0x0628: PHI (r1v74 android.widget.TextView) = (r1v71 android.widget.TextView), (r1v76 android.widget.TextView) binds: [B:294:0x0765, B:270:0x061b] A[DONT_GENERATE, DONT_INLINE]
  0x0628: PHI (r3v43 one.me.login.confirm.ConfirmPhoneScreen) = (r3v40 one.me.login.confirm.ConfirmPhoneScreen), (r3v45 one.me.login.confirm.ConfirmPhoneScreen) binds: [B:294:0x0765, B:270:0x061b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:281:0x0718  */
    /* JADX WARN: Code duplicated, block: B:284:0x072b  */
    /* JADX WARN: Code duplicated, block: B:288:0x073d  */
    /* JADX WARN: Code duplicated, block: B:28:0x0084  */
    /* JADX WARN: Code duplicated, block: B:292:0x0757  */
    /* JADX WARN: Code duplicated, block: B:29:0x0086  */
    /* JADX WARN: Code duplicated, block: B:32:0x008d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:34:0x0090  */
    /* JADX WARN: Code duplicated, block: B:38:0x0098  */
    /* JADX WARN: Code duplicated, block: B:415:0x09aa A[Catch: all -> 0x093f, TryCatch #7 {all -> 0x093f, blocks: (B:389:0x0939, B:422:0x09c1, B:424:0x09c7, B:413:0x09a0, B:415:0x09aa, B:416:0x09af, B:419:0x09b4), top: B:526:0x0929 }] */
    /* JADX WARN: Code duplicated, block: B:418:0x09b3  */
    /* JADX WARN: Code duplicated, block: B:506:0x0bd4  */
    /* JADX WARN: Code duplicated, block: B:509:0x0be8  */
    /* JADX WARN: Code duplicated, block: B:511:0x0bea  */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x02ad, code lost:
    
        if (r6 == r10) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:297:0x077a, code lost:
    
        if (r3.p1(r1, ru.oneme.app.R.string.oneme_login_confirm_info_loading_3, true, r30) == r2) goto L298;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00a8, code lost:
    
        if (r2.v(r30) == r1) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:420:0x09bd, code lost:
    
        if (r3.K(r11) == r0) goto L421;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v137 */
    /* JADX WARN: Type inference failed for: r1v138 */
    /* JADX WARN: Type inference failed for: r1v36, types: [int] */
    /* JADX WARN: Type inference failed for: r1v37 */
    /* JADX WARN: Type inference failed for: r1v56, types: [java.lang.AutoCloseable] */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.lang.AutoCloseable] */
    /* JADX WARN: Type inference failed for: r3v28, types: [android.view.View, android.view.ViewGroup] */
    /* JADX WARN: Type inference failed for: r7v38, types: [a8g] */
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
    @Override // defpackage.mq0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r31) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 3106
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wd9.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wd9(int i, Object obj, lq4 lq4Var, ae9 ae9Var) {
        super(2, lq4Var);
        this.e = 0;
        this.i = i;
        this.g = obj;
        this.j = ae9Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wd9(l63 l63Var, lq4 lq4Var) {
        super(2, lq4Var);
        this.e = 3;
        this.j = l63Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wd9(int i, y85 y85Var, Conversation conversation, lq4 lq4Var) {
        super(2, lq4Var);
        this.e = 6;
        this.i = i;
        this.j = y85Var;
        this.h = conversation;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wd9(aaf aafVar, String str, int i, Object obj, lq4 lq4Var, int i2) {
        super(2, lq4Var);
        this.e = i2;
        this.g = aafVar;
        this.j = str;
        this.i = i;
        this.h = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wd9(Object obj, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.h = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wd9(Object obj, Object obj2, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.j = obj;
        this.h = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wd9(List list, int i, op1 op1Var, lq4 lq4Var) {
        super(2, lq4Var);
        this.e = 1;
        this.h = list;
        this.i = i;
        this.j = op1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wd9(List list, lq4 lq4Var, pm2 pm2Var, int i) {
        super(2, lq4Var);
        this.e = 2;
        this.h = list;
        this.g = pm2Var;
        this.i = i;
    }
}
