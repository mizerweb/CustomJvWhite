package defpackage;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Collections;
import one.me.messages.list.loader.MessageModel;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes4.dex */
public final class w43 extends mdh implements qf7 {
    public final /* synthetic */ int e = 1;
    public /* synthetic */ Object f;
    public final /* synthetic */ x43 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w43(Object obj, lq4 lq4Var, x43 x43Var) {
        super(2, lq4Var);
        this.f = obj;
        this.g = x43Var;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        x43 x43Var = this.g;
        switch (i) {
            case 0:
                w43 w43Var = new w43(x43Var, lq4Var);
                w43Var.f = obj;
                return w43Var;
            default:
                return new w43(this.f, lq4Var, x43Var);
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        switch (i) {
            case 0:
                ((w43) create((wz9) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            default:
                return ((w43) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
        }
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        boolean z;
        v7a v7aVar;
        int i = this.e;
        x43 x43Var = this.g;
        switch (i) {
            case 0:
                wz9 wz9Var = (wz9) this.f;
                ch3.d0(obj);
                x43Var.A.updateAndGet(new ea1(5, wz9Var));
                return sbi.a;
            default:
                ch3.d0(obj);
                MessageModel messageModel = (MessageModel) this.f;
                vz9 vz9Var = (vz9) x43Var.y.getValue();
                i43 i43Var = x43Var.e;
                vz9Var.getClass();
                ny8 ny8Var = vz9Var.d;
                ny8 ny8Var2 = vz9Var.b;
                long j = messageModel.c;
                u40 u40Var = messageModel.j;
                int iOrdinal = i43Var.ordinal();
                int i2 = 1;
                if (iOrdinal != 0) {
                    if (iOrdinal == 1) {
                        t50 t50Var = u40Var.b;
                        if ((t50Var instanceof oxi) || !(t50Var instanceof aq6)) {
                            u40Var = null;
                        }
                        if (u40Var != null) {
                            t50 t50Var2 = u40Var.b;
                            aq6 aq6Var = t50Var2 instanceof aq6 ? (aq6) t50Var2 : null;
                            if (aq6Var != null) {
                                g58 g58Var = aq6Var.j;
                                fti ftiVar = aq6Var.k;
                                int i3 = ftiVar != null ? 2 : (g58Var == null || g58Var.e) ? 3 : 1;
                                long jHashCode = aq6Var.c.hashCode();
                                Uri uri = ftiVar != null ? ftiVar.b : (g58Var == null || g58Var.e) ? null : g58Var.b;
                                long j2 = messageModel.a;
                                long j3 = aq6Var.a;
                                String string = uri != null ? uri.toString() : null;
                                String str = aq6Var.d;
                                String strM = oc9.M(vz9Var.a(), ((s7f) ((et3) ny8Var2.getValue())).v(), j, true);
                                long j4 = aq6Var.e;
                                return Collections.singletonList(new t7a(jHashCode, j2, j3, string, str, strM, j4, woh.v(j4, false, vz9Var.a()), aq6Var.c, aq6Var.h, i3, aq6Var.g, aq6Var.m));
                            }
                        }
                    } else if (iOrdinal == 2) {
                        t50 t50Var3 = u40Var.b;
                        mxf mxfVar = t50Var3 instanceof mxf ? (mxf) t50Var3 : null;
                        if (mxfVar != null) {
                            boolean z2 = messageModel.l || (((nni) vz9Var.c.getValue()).m() && mxfVar.j);
                            String string2 = z2 ? vz9Var.a().getString(R.string.profile_media_content_level_link_title) : mxfVar.d;
                            String string3 = z2 ? vz9Var.a().getString(R.string.profile_media_content_level_link_subtitle) : mxfVar.e;
                            String str2 = z2 ? null : mxfVar.b;
                            String str3 = mxfVar.i;
                            long jHashCode2 = str3 != null ? str3.hashCode() : 0L;
                            long j5 = messageModel.a;
                            long j6 = mxfVar.a;
                            g58 g58Var2 = mxfVar.g;
                            return Collections.singletonList(new u7a(jHashCode2, j5, j6, g58Var2 != null ? g58Var2.m : null, string2 == null ? "" : string2, string3, str2, z2));
                        }
                    } else {
                        if (iOrdinal != 3) {
                            ore.o();
                            return null;
                        }
                        t50 t50Var4 = u40Var.b;
                        boolean z3 = t50Var4 instanceof oxi;
                        if (z3 || (t50Var4 instanceof y90)) {
                            String strM2 = oc9.M(vz9Var.a(), ((s7f) ((et3) ny8Var2.getValue())).v(), j, true);
                            if (t50Var4 instanceof y90) {
                                y90 y90Var = (y90) t50Var4;
                                return Collections.singletonList(new s7a(y90Var.f.hashCode(), messageModel.a, y90Var.d, y90Var.f, y90Var.e, y90Var.h, zo5.p(mxl.a(y90Var.k), " · ", strM2), vz9Var.a().getString(R.string.chat_screen_message_audio_title), ((u3d) ny8Var.getValue()).h, ((u3d) ny8Var.getValue()).i));
                            }
                            if (z3) {
                                oxi oxiVar = (oxi) t50Var4;
                                fti ftiVar2 = oxiVar.c;
                                return Collections.singletonList(new w7a(oxiVar.b.hashCode(), messageModel.a, ftiVar2.a, oxiVar.b, ftiVar2.b, oxiVar.f.toString(), zo5.p(mxl.a(ew5.g(ftiVar2.f)), " · ", strM2), ((d0j) vz9Var.e.getValue()).j));
                            }
                        }
                    }
                    return r66.a;
                }
                t50 t50Var5 = u40Var.b;
                if ((t50Var5 instanceof oxi) || !(t50Var5 instanceof iq9)) {
                    u40Var = null;
                }
                if (u40Var != null) {
                    boolean z4 = messageModel.l;
                    t50 t50Var6 = u40Var.b;
                    if (t50Var6 instanceof yv3) {
                        ArrayList<yu3> arrayList = ((yv3) t50Var6).b;
                        ArrayList arrayList2 = new ArrayList(yw3.W0(arrayList, 10));
                        for (yu3 yu3Var : arrayList) {
                            String strK = yu3Var.k();
                            long jHashCode3 = strK != null ? strK.hashCode() : 0L;
                            if (yu3Var instanceof g58) {
                                long j7 = messageModel.a;
                                g58 g58Var3 = (g58) yu3Var;
                                long j8 = g58Var3.a;
                                Uri uri2 = g58Var3.b;
                                int i4 = g58Var3.e ? 3 : i2;
                                String str4 = g58Var3.k;
                                z = z4;
                                v7aVar = new v7a(jHashCode3, j7, j8, uri2, i4, null, str4 == null ? "" : str4, true, g58Var3.h, g58Var3.g, Long.valueOf(g58Var3.n), Long.valueOf(g58Var3.o), z);
                            } else {
                                z = z4;
                                if (!(yu3Var instanceof fti)) {
                                    ore.o();
                                    return null;
                                }
                                long j9 = messageModel.a;
                                fti ftiVar3 = (fti) yu3Var;
                                long j10 = ftiVar3.a;
                                Uri uri3 = ftiVar3.b;
                                long jG = ew5.g(ftiVar3.f);
                                String str5 = ftiVar3.h;
                                v7aVar = new v7a(jHashCode3, j9, j10, uri3, Long.valueOf(jG), str5 == null ? "" : str5, true, ftiVar3.i, ftiVar3.k, z);
                            }
                            arrayList2.add(v7aVar);
                            z4 = z;
                            i2 = 1;
                        }
                        return arrayList2;
                    }
                    if (t50Var6 instanceof h8g) {
                        h8g h8gVar = (h8g) t50Var6;
                        long jHashCode4 = h8gVar.b.hashCode();
                        long j11 = messageModel.a;
                        g58 g58Var4 = h8gVar.c;
                        return Collections.singletonList(new v7a(jHashCode4, j11, g58Var4.a, g58Var4.b, g58Var4.e ? 3 : 1, null, h8gVar.b, false, g58Var4.h, g58Var4.g, Long.valueOf(g58Var4.n), Long.valueOf(g58Var4.o), z4));
                    }
                    if (t50Var6 instanceof eag) {
                        eag eagVar = (eag) t50Var6;
                        fti ftiVar4 = eagVar.c;
                        return Collections.singletonList(new v7a(eagVar.b.hashCode(), messageModel.a, ftiVar4.a, ftiVar4.b, Long.valueOf(ew5.g(ftiVar4.f)), eagVar.b, false, ftiVar4.i, ftiVar4.k, z4));
                    }
                }
                return r66.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w43(x43 x43Var, lq4 lq4Var) {
        super(2, lq4Var);
        this.g = x43Var;
    }
}
