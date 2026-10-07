package defpackage;

import java.util.concurrent.CancellationException;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final class dvf extends mdh implements qf7 {
    public gvf e;
    public gvf f;
    public boolean g;
    public int h;
    public int i;
    public int j;
    public final /* synthetic */ gvf k;
    public final /* synthetic */ boolean l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dvf(gvf gvfVar, boolean z, lq4 lq4Var) {
        super(2, lq4Var);
        this.k = gvfVar;
        this.l = z;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        return new dvf(this.k, this.l, lq4Var);
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        return ((dvf) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbi.a);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x006f  */
    /* JADX WARN: Code duplicated, block: B:28:0x0073 A[Catch: all -> 0x0016, CancellationException -> 0x0095, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x0016, blocks: (B:7:0x0012, B:28:0x0073), top: B:44:0x0012 }] */
    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        gvf gvfVar;
        boolean z;
        gvf gvfVar2;
        int i;
        gvf gvfVar3;
        int i2;
        gvf gvfVar4;
        int i3 = this.j;
        hu4 hu4Var = hu4.a;
        try {
            if (i3 == 0) {
                ch3.d0(obj);
                gvfVar = this.k;
                z = this.l;
                try {
                    wei weiVar = (wei) gvfVar.k.getValue();
                    this.e = gvfVar;
                    this.f = gvfVar;
                    this.g = z;
                    i = 0;
                    this.h = 0;
                    this.i = 0;
                    this.j = 1;
                    if (weiVar.a(z, this) != hu4Var) {
                        gvfVar3 = gvfVar;
                        i2 = 0;
                        this.e = gvfVar;
                        this.f = gvfVar3;
                        this.g = z;
                        this.h = i2;
                        this.i = i;
                        this.j = 2;
                        if (gvf.D(gvfVar, this) != hu4Var) {
                            gvfVar4 = gvfVar;
                            gvfVar2 = gvfVar3;
                            if (z) {
                                pzf pzfVar = gvfVar4.z;
                                gvfVar4.I(new upf(4, new tnh(R.string.oneme_settings_privacy_content_level_access_message_success), new Integer(R.drawable.icon_eye_crossed_fill)));
                            }
                        }
                    }
                    return hu4Var;
                } catch (Throwable th) {
                    th = th;
                    gvfVar2 = gvfVar;
                    gm0.V(gvfVar2.x, "updateContentLevelAccess fail", th);
                    gvf.C(gvfVar2, th);
                    return sbi.a;
                }
            }
            if (i3 == 1) {
                int i4 = this.i;
                int i5 = this.h;
                boolean z2 = this.g;
                gvf gvfVar5 = this.f;
                gvf gvfVar6 = this.e;
                try {
                    ch3.d0(obj);
                    i = i4;
                    z = z2;
                    i2 = i5;
                    gvfVar3 = gvfVar5;
                    gvfVar = gvfVar6;
                    try {
                        this.e = gvfVar;
                        this.f = gvfVar3;
                        this.g = z;
                        this.h = i2;
                        this.i = i;
                        this.j = 2;
                        if (gvf.D(gvfVar, this) != hu4Var) {
                            gvfVar4 = gvfVar;
                            gvfVar2 = gvfVar3;
                            if (z) {
                                pzf pzfVar2 = gvfVar4.z;
                                gvfVar4.I(new upf(4, new tnh(R.string.oneme_settings_privacy_content_level_access_message_success), new Integer(R.drawable.icon_eye_crossed_fill)));
                            }
                        }
                        return hu4Var;
                    } catch (Throwable th2) {
                        th = th2;
                        gvfVar2 = gvfVar3;
                        gm0.V(gvfVar2.x, "updateContentLevelAccess fail", th);
                        gvf.C(gvfVar2, th);
                    }
                } catch (Throwable th3) {
                    th = th3;
                    gvfVar2 = gvfVar5;
                    gm0.V(gvfVar2.x, "updateContentLevelAccess fail", th);
                    gvf.C(gvfVar2, th);
                    return sbi.a;
                }
            } else {
                if (i3 != 2) {
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z = this.g;
                gvfVar2 = this.f;
                gvfVar4 = this.e;
                try {
                    ch3.d0(obj);
                    if (z) {
                        pzf pzfVar3 = gvfVar4.z;
                        gvfVar4.I(new upf(4, new tnh(R.string.oneme_settings_privacy_content_level_access_message_success), new Integer(R.drawable.icon_eye_crossed_fill)));
                    }
                } catch (Throwable th4) {
                    th = th4;
                    gm0.V(gvfVar2.x, "updateContentLevelAccess fail", th);
                    gvf.C(gvfVar2, th);
                }
            }
            return sbi.a;
        } catch (CancellationException e) {
            throw e;
        }
    }
}
