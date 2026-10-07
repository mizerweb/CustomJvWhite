package defpackage;

import android.view.MenuItem;
import android.view.View;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Map;
import one.me.chats.picker.stories.PickStoryPresetScreen;
import one.me.devmenu.logsviewer.LogsViewerScreen;
import one.me.keyboardmedia.MediaKeyboardWidget;
import one.me.location.map.pick.PickLocationScreen;
import one.me.login.neuroavatars.NeuroAvatarPickerBottomSheet;
import one.me.members.list.MembersListWidget;
import one.me.pinbars.PinBarsWidget;
import one.me.polls.screens.result.voterslist.PollAnswerVotersListScreen;
import one.me.startconversation.channel.PickSubscribersScreen;
import one.me.startconversation.chat.PickChatMembers;
import org.apache.http.conn.params.ConnManagerParams;
import org.apache.http.cookie.ClientCookie;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class lh9 implements cf7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ lh9(l9b l9bVar, k9b k9bVar) {
        this.a = 15;
        this.b = l9bVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.cf7
    public final Object invoke(Object obj) {
        a70 a70Var;
        ArrayList arrayList;
        v2d v2dVar;
        boolean z = false;
        Integer numValueOf = null;
        boolean z2 = true;
        switch (this.a) {
            case 0:
                LogsViewerScreen logsViewerScreen = (LogsViewerScreen) this.b;
                zv8[] zv8VarArr = LogsViewerScreen.g;
                ltb onBackPressedDispatcher = logsViewerScreen.getOnBackPressedDispatcher();
                if (onBackPressedDispatcher != null) {
                    onBackPressedDispatcher.d();
                }
                return sbi.a;
            case 1:
                return ((DecimalFormat) ((qi9) this.b).h.getValue()).format((Number) obj);
            case 2:
                nm9 nm9Var = (nm9) this.b;
                nm9Var.k(nm9Var.n.mo41apply(obj));
                return sbi.a;
            case 3:
                return Boolean.valueOf(!((fn9) this.b).f.d(((MenuItem) obj).getItemId()));
            case 4:
                return Boolean.valueOf(((zs9) obj).d == ((Number) ((Map.Entry) this.b).getKey()).longValue());
            case 5:
                MediaKeyboardWidget mediaKeyboardWidget = (MediaKeyboardWidget) this.b;
                zv8[] zv8VarArr2 = MediaKeyboardWidget.u;
                mediaKeyboardWidget.r1().B();
                return sbi.a;
            case 6:
                return Boolean.valueOf(((v8a) ((x8a) this.b)).a.contains(Long.valueOf(((l8a) obj).a)));
            case 7:
                MembersListWidget membersListWidget = (MembersListWidget) this.b;
                int iIntValue = ((Integer) obj).intValue() - membersListWidget.k.l();
                h47 h47Var = membersListWidget.j;
                if (h47Var.l() - 1 < iIntValue || iIntValue < 0) {
                    return null;
                }
                return (l8a) ((k79) h47Var.F(iIntValue));
            case 8:
                return ((qaa) this.b).J((o63) obj);
            case 9:
                nka nkaVar = (nka) this.b;
                vxe vxeVarO0 = ((qxe) obj).O0("SELECT * FROM message_uploads");
                try {
                    int iE = qyj.E(vxeVarO0, ClientCookie.PATH_ATTR);
                    int iE2 = qyj.E(vxeVarO0, "last_modified");
                    int iE3 = qyj.E(vxeVarO0, "upload_type");
                    int iE4 = qyj.E(vxeVarO0, "message_id");
                    int iE5 = qyj.E(vxeVarO0, "chat_id");
                    int iE6 = qyj.E(vxeVarO0, "attach_id");
                    int iE7 = qyj.E(vxeVarO0, "video_quality");
                    int iE8 = qyj.E(vxeVarO0, "video_start_trim_position");
                    int iE9 = qyj.E(vxeVarO0, "video_end_trim_position");
                    int iE10 = qyj.E(vxeVarO0, "video_fragments_paths");
                    int iE11 = qyj.E(vxeVarO0, "mute");
                    ArrayList arrayList2 = new ArrayList();
                    while (vxeVarO0.M0()) {
                        boolean z3 = z2;
                        u75 u75Var = new u75();
                        int i = iE2;
                        int i2 = iE3;
                        u75Var.a = vxeVarO0.getLong(iE4);
                        u75Var.b = vxeVarO0.getLong(iE5);
                        u75Var.c = vxeVarO0.B0(iE6);
                        if (vxeVarO0.isNull(iE7) && vxeVarO0.isNull(iE8) && vxeVarO0.isNull(iE9) && vxeVarO0.isNull(iE10) && vxeVarO0.isNull(iE11)) {
                            a70Var = numValueOf;
                            u75Var = u75Var;
                        } else {
                            a70 a70Var2 = new a70();
                            if (!vxeVarO0.isNull(iE7)) {
                                numValueOf = Integer.valueOf((int) vxeVarO0.getLong(iE7));
                            }
                            a70Var2.a = k1m.e(numValueOf);
                            a70Var2.b = (float) vxeVarO0.getDouble(iE8);
                            a70Var2.c = (float) vxeVarO0.getDouble(iE9);
                            String strB0 = vxeVarO0.isNull(iE10) ? null : vxeVarO0.B0(iE10);
                            if (strB0 == null) {
                                a70Var2.d = null;
                            } else {
                                lhb lhbVar = nkaVar.c;
                                a70Var2.d = lhb.o(strB0);
                            }
                            a70Var2.e = ((int) vxeVarO0.getLong(iE11)) != 0 ? z3 : false;
                            a70Var = a70Var2;
                        }
                        jka jkaVar = new jka();
                        if (vxeVarO0.isNull(iE)) {
                            jkaVar.b = null;
                        } else {
                            jkaVar.b = vxeVarO0.B0(iE);
                        }
                        int i3 = iE4;
                        jkaVar.c = vxeVarO0.getLong(i);
                        iE3 = i2;
                        jkaVar.d = k1m.d(vxeVarO0.isNull(iE3) ? null : Integer.valueOf((int) vxeVarO0.getLong(iE3)));
                        jkaVar.a = u75Var;
                        jkaVar.e = a70Var;
                        arrayList2.add(jkaVar);
                        iE4 = i3;
                        iE5 = iE5;
                        iE2 = i;
                        z2 = z3;
                        numValueOf = null;
                        break;
                    }
                    return arrayList2;
                } finally {
                    vxeVarO0.close();
                }
            case 10:
                xpa xpaVar = (xpa) this.b;
                int iIntValue2 = ((Integer) obj).intValue();
                if (((Boolean) xpaVar.b.invoke()).booleanValue()) {
                    if (!xpaVar.d) {
                        xpaVar.d = true;
                        e93 e93Var = (e93) xpaVar.c.getValue();
                        nee adapter = xpaVar.a.getAdapter();
                        qpa qpaVar = adapter instanceof qpa ? (qpa) adapter : null;
                        if (qpaVar != null && (arrayList = qpaVar.v) != null && (!arrayList.isEmpty())) {
                            z = true;
                        }
                        e93Var.D(iIntValue2, z);
                        xpaVar.a.p0(xpaVar);
                    }
                    z = true;
                } else {
                    String name = xpa.class.getName();
                    a4c a4cVar = gm0.f;
                    if (a4cVar != null) {
                        je9 je9Var = je9.f;
                        if (a4cVar.b(je9Var)) {
                            a4cVar.c(je9Var, name, "Not enough messages for send analytics", null);
                        }
                    }
                }
                return Boolean.valueOf(z);
            case 11:
                jsa jsaVar = (jsa) this.b;
                long jLongValue = ((Long) obj).longValue();
                String str = jsaVar.v;
                a4c a4cVar2 = gm0.f;
                if (a4cVar2 != null) {
                    je9 je9Var2 = je9.d;
                    if (a4cVar2.b(je9Var2)) {
                        a4cVar2.c(je9Var2, str, zo5.j(jLongValue, "Load around from scroll logic, time: "), null);
                    }
                }
                if (!jcd.d(jsaVar.e0(), null, (rt2) jsaVar.w2.a.getValue(), 1)) {
                    jsaVar.Z().m(jLongValue);
                }
                return sbi.a;
            case 12:
                return Boolean.valueOf(((opa) this.b).h(((Long) obj).longValue()) == null);
            case 13:
                ((z79) this.b).d();
                return sbi.a;
            case 14:
                ((ft0) this.b).a = (va0) obj;
                return sbi.a;
            case 15:
                ((l9b) this.b).g(null);
                return sbi.a;
            case 16:
                NeuroAvatarPickerBottomSheet neuroAvatarPickerBottomSheet = (NeuroAvatarPickerBottomSheet) this.b;
                udb udbVar = (udb) obj;
                zv8[] zv8VarArr3 = NeuroAvatarPickerBottomSheet.E;
                xeb xebVarG1 = neuroAvatarPickerBottomSheet.G1();
                if (udbVar != null) {
                    int i4 = udbVar.c;
                    if (i4 != xebVarG1.h) {
                        xebVarG1.h = i4;
                        xebVarG1.m.a(new zdb(i4, null));
                    }
                } else {
                    xebVarG1.getClass();
                }
                return sbi.a;
            case 17:
                nub nubVar = ((evb) this.b).c;
                if (nubVar != null) {
                    ijc ijcVar = (ijc) nubVar.i;
                    if (ijcVar != null) {
                        int[] iArrF = nubVar.f();
                        ijcVar.c((View) nubVar.b, iArrF[0], iArrF[1]);
                        ijcVar.setVisibility(0);
                    }
                    nubVar.j(false);
                }
                return sbi.a;
            case 18:
                al9 al9Var = (al9) this.b;
                Integer num = (Integer) obj;
                num.getClass();
                al9Var.invoke(num);
                return sbi.a;
            case 19:
                oyb oybVar = (oyb) this.b;
                int iIntValue3 = ((Integer) obj).intValue();
                myb mybVar = oybVar.a;
                if (mybVar != null) {
                    mybVar.g(iIntValue3);
                }
                return sbi.a;
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                q9c q9cVar = (q9c) this.b;
                int iIntValue4 = ((Integer) obj).intValue();
                n9c n9cVar = q9cVar.i;
                if (n9cVar != null) {
                    uvc uvcVar = (uvc) n9cVar;
                    nqe nqeVar = ((gr7) uvcVar.b).s;
                    q9c q9cVar2 = (q9c) uvcVar.c;
                    nqeVar.f = qx6.a((((iIntValue4 + 0.5f) * q9cVar2.getAvatarSize()) + q9cVar2.getTop()) - (q9cVar2.getAvatarOffset() * iIntValue4), (q9cVar2.getMeasuredHeight() / 2.0f) + q9cVar2.getTop());
                    nqeVar.a();
                    nqeVar.invalidateSelf();
                    nqeVar.start();
                }
                return sbi.a;
            case 21:
                return Boolean.valueOf(((View) obj).getId() != ((tcc) this.b).getId());
            case 22:
                PickChatMembers pickChatMembers = (PickChatMembers) this.b;
                zv8[] zv8VarArr4 = PickChatMembers.p;
                ltb onBackPressedDispatcher2 = pickChatMembers.getOnBackPressedDispatcher();
                if (onBackPressedDispatcher2 != null) {
                    onBackPressedDispatcher2.d();
                }
                return sbi.a;
            case 23:
                PickLocationScreen pickLocationScreen = (PickLocationScreen) this.b;
                zv8[] zv8VarArr5 = PickLocationScreen.p;
                ltb onBackPressedDispatcher3 = pickLocationScreen.getOnBackPressedDispatcher();
                if (onBackPressedDispatcher3 != null) {
                    onBackPressedDispatcher3.d();
                }
                return sbi.a;
            case 24:
                PickStoryPresetScreen pickStoryPresetScreen = (PickStoryPresetScreen) this.b;
                zv8[] zv8VarArr6 = PickStoryPresetScreen.o;
                ltb onBackPressedDispatcher4 = pickStoryPresetScreen.getOnBackPressedDispatcher();
                if (onBackPressedDispatcher4 != null) {
                    onBackPressedDispatcher4.d();
                }
                return sbi.a;
            case 25:
                cxc cxcVar = (cxc) this.b;
                ohg ohgVar = (ohg) obj;
                ohgVar.k();
                ohgVar.e(ohgVar.j(((bxc) cxcVar).a));
                return sbi.a;
            case 26:
                PinBarsWidget pinBarsWidget = (PinBarsWidget) this.b;
                mza mzaVar = (mza) obj;
                zv8[] zv8VarArr7 = PinBarsWidget.z;
                View view = pinBarsWidget.getView();
                if (view != null) {
                    p0m.a(view, lt7.CONFIRM);
                }
                nzc nzcVarT1 = pinBarsWidget.t1();
                int iOrdinal = mzaVar.ordinal();
                if (iOrdinal == 0) {
                    v2dVar = v2d.b;
                } else if (iOrdinal == 1) {
                    v2dVar = v2d.c;
                } else {
                    if (iOrdinal != 2) {
                        ore.o();
                        return null;
                    }
                    v2dVar = v2d.d;
                }
                n3 n3Var = nzcVarT1.v;
                za0 za0Var = (za0) n3Var.a;
                za0Var.getClass();
                ma6 ma6Var = v2d.f;
                v2d v2dVar2 = (v2d) ma6Var.get((v2dVar.ordinal() + 1) % ma6Var.getSize());
                w7b w7bVar = za0Var.c;
                float f = v2dVar2.a;
                xte xteVar = w7bVar.a;
                yab.i0(xteVar.d, null, 0, new zzc(xteVar, f, null), 3);
                ((xb9) ((et3) za0Var.g.getValue())).Q().setValue(Float.valueOf(v2dVar2.a));
                hbc hbcVar = (hbc) n3Var.b;
                hbcVar.getClass();
                v2d v2dVar3 = (v2d) ma6Var.get((v2dVar.ordinal() + 1) % ma6Var.getSize());
                d0j d0jVar = (d0j) hbcVar.b;
                float f2 = v2dVar3.a;
                e3j e3jVar = d0jVar.h;
                if (e3jVar != null) {
                    e3jVar.setPlaybackSpeed(f2);
                }
                ((xb9) ((et3) ((ny8) hbcVar.f).getValue())).Q().setValue(Float.valueOf(v2dVar3.a));
                return sbi.a;
            case 27:
                ((a0d) this.b).y.invoke();
                return sbi.a;
            case 28:
                t4d t4dVar = (t4d) this.b;
                int iIntValue5 = ((Integer) obj).intValue();
                return t4dVar.e[iIntValue5] + ": " + t4dVar.h(iIntValue5).i();
            default:
                PollAnswerVotersListScreen pollAnswerVotersListScreen = (PollAnswerVotersListScreen) this.b;
                zv8[] zv8VarArr8 = PollAnswerVotersListScreen.n;
                a8j.x(pollAnswerVotersListScreen.o1().q, rt3.b);
                return sbi.a;
        }
    }

    public /* synthetic */ lh9(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public /* synthetic */ lh9(PickSubscribersScreen pickSubscribersScreen, cxc cxcVar) {
        this.a = 25;
        this.b = cxcVar;
    }
}
