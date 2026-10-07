package defpackage;

import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Build;
import android.view.Surface;
import android.view.Window;
import androidx.recyclerview.widget.RecyclerView;
import java.io.DataOutput;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import one.me.android.MainActivity;
import one.me.android.root.RootController;
import one.me.chats.list.ChatsListWidget;
import one.me.chats.tab.ChatsTabWidget;
import one.me.login.inputphone.InputPhoneScreen;
import org.apache.http.conn.params.ConnManagerParams;
import ru.ok.android.externcalls.sdk.audio.MicrophoneManager;
import ru.ok.android.externcalls.sdk.video.CameraManager;
import ru.ok.tamtam.stats.LogController$AnalyticsDebugException;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g3 implements cf7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ g3(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:247:0x0526  */
    /* JADX WARN: Code duplicated, block: B:260:0x0546  */
    /* JADX WARN: Code duplicated, block: B:303:0x011d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:42:0x010e  */
    /* JADX WARN: Code duplicated, block: B:45:0x0117 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:46:0x0119 A[LOOP:0: B:9:0x0032->B:46:0x0119, LOOP_END] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.cf7
    public final Object invoke(Object obj) throws Exception {
        boolean z;
        boolean z2;
        lve lveVar;
        int i;
        boolean z3 = false;
        switch (this.a) {
            case 0:
                final o3 o3Var = (o3) this.b;
                ((as6) obj).registerOnSharedPreferenceChangeListener(new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: h3
                    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
                        o3Var.b.a(sbi.a);
                    }
                });
                return sbi.a;
            case 1:
                pq3 pq3Var = (pq3) this.b;
                Activity activity = (Activity) obj;
                ix3 ix3Var = ix3.b;
                y9 y9Var = activity instanceof y9 ? (y9) activity : null;
                if (y9Var != null) {
                    MainActivity mainActivity = (MainActivity) y9Var;
                    RootController rootController = (RootController) mainActivity.v().a.get();
                    Object objX = (rootController == null || (lveVar = (lve) ww3.D1(rootController.y1().e())) == null) ? null : lveVar.a;
                    if (objX == null) {
                        objX = mainActivity.x();
                    }
                    z4f z4fVar = objX instanceof z4f ? (z4f) objX : null;
                    int a = z4fVar != null ? z4fVar.getA() : 0;
                    if (a == 1 || a == 2) {
                        z = true;
                    } else {
                        z = false;
                    }
                } else {
                    z = false;
                }
                if (y9Var != null) {
                    Object objX2 = ((MainActivity) y9Var).x();
                    z4f z4fVar2 = objX2 instanceof z4f ? (z4f) objX2 : null;
                    int a2 = z4fVar2 != null ? z4fVar2.getA() : 0;
                    if (a2 == 1 || a2 == 3) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                } else {
                    z2 = false;
                }
                Window window = activity.getWindow();
                if (window != null) {
                    if (!z) {
                        ix3 ix3VarA = pq3Var.m().A();
                        v56 v56Var = new v56(window.getDecorView());
                        int i2 = Build.VERSION.SDK_INT;
                        (i2 >= 35 ? new lxj(window, v56Var) : i2 >= 30 ? new kxj(window, v56Var) : new jxj(window, v56Var)).a0(ix3VarA != ix3Var);
                    }
                    if (!z2) {
                        boolean z4 = pq3Var.m().A() != ix3Var;
                        if (Build.VERSION.SDK_INT < 29) {
                            pq3.j.e(window.getContext()).m();
                            window.setNavigationBarColor(0);
                        } else {
                            window.setNavigationBarContrastEnforced(z4);
                        }
                        v56 v56Var2 = new v56(window.getDecorView());
                        int i3 = Build.VERSION.SDK_INT;
                        (i3 >= 35 ? new lxj(window, v56Var2) : i3 >= 30 ? new kxj(window, v56Var2) : new jxj(window, v56Var2)).Z(z4);
                    }
                }
                return sbi.a;
            case 2:
                return Boolean.valueOf(((y10) this.b).l((kw7) obj));
            case 3:
                m90 m90Var = (m90) this.b;
                w7b w7bVar = m90Var.a;
                k90 k90Var = m90Var.h;
                xte xteVar = w7bVar.a;
                synchronized (xteVar.i) {
                    tte tteVar = (tte) xteVar.j.remove(k90Var);
                    if (tteVar != null) {
                        xteVar.i.remove(tteVar);
                    }
                    break;
                }
                m90Var.b.get().q(m90Var.i);
                return sbi.a;
            case 4:
                za0 za0Var = (za0) this.b;
                w7b w7bVar2 = za0Var.c;
                v56 v56Var3 = za0Var.l;
                xte xteVar2 = w7bVar2.a;
                synchronized (xteVar2.i) {
                    tte tteVar2 = (tte) xteVar2.j.remove(v56Var3);
                    if (tteVar2 != null) {
                        xteVar2.i.remove(tteVar2);
                    }
                    break;
                }
                return sbi.a;
            case 5:
                ac1 ac1Var = (ac1) this.b;
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                MicrophoneManager microphoneManagerB = ac1Var.b();
                if (microphoneManagerB != null) {
                    microphoneManagerB.setMicEnabled(zBooleanValue);
                }
                MicrophoneManager microphoneManagerB2 = ac1Var.b();
                if (microphoneManagerB2 != null && microphoneManagerB2.isMicEnabled()) {
                    z3 = true;
                }
                return Boolean.valueOf(z3);
            case 6:
                rd1 rd1Var = (rd1) this.b;
                boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                CameraManager cameraManagerA = rd1Var.a();
                if (cameraManagerA != null) {
                    cameraManagerA.setCameraEnabled(zBooleanValue2);
                }
                CameraManager cameraManagerA2 = rd1Var.a();
                if (cameraManagerA2 != null && cameraManagerA2.isCameraEnabled()) {
                    z3 = true;
                }
                return Boolean.valueOf(z3);
            case 7:
                ph3 ph3Var = (ph3) this.b;
                vxe vxeVarO0 = ((qxe) obj).O0("SELECT * FROM chats");
                try {
                    int iE = qyj.E(vxeVarO0, "id");
                    int iE2 = qyj.E(vxeVarO0, "server_id");
                    int iE3 = qyj.E(vxeVarO0, "data");
                    int iE4 = qyj.E(vxeVarO0, "favourite_index");
                    int iE5 = qyj.E(vxeVarO0, "sort_time");
                    int iE6 = qyj.E(vxeVarO0, "cid");
                    ArrayList arrayList = new ArrayList();
                    while (vxeVarO0.M0()) {
                        arrayList.add(new jy2(vxeVarO0.getLong(iE), vxeVarO0.getLong(iE2), ph3Var.c().c(vxeVarO0.getBlob(iE3)), vxeVarO0.getLong(iE4), vxeVarO0.getLong(iE5), vxeVarO0.getLong(iE6)));
                    }
                    vxeVarO0.close();
                    return arrayList;
                } catch (Throwable th) {
                    vxeVarO0.close();
                    throw th;
                }
            case 8:
                ri3 ri3Var = (ri3) this.b;
                int iIntValue = ((Integer) obj).intValue();
                if (((Boolean) ri3Var.b.invoke()).booleanValue()) {
                    if (!ri3Var.f) {
                        ri3Var.f = true;
                        ((u03) ri3Var.c.getValue()).D(iIntValue);
                    }
                    if (ri3Var.e) {
                        ri3Var.a.p0(ri3Var);
                    }
                    z3 = true;
                }
                return Boolean.valueOf(z3);
            case 9:
                ChatsListWidget chatsListWidget = (ChatsListWidget) this.b;
                Long l = (Long) obj;
                long jLongValue = l.longValue();
                zv8[] zv8VarArr = ChatsListWidget.X;
                if (jLongValue >= 0) {
                    rl3 rl3VarT1 = chatsListWidget.t1();
                    if (!rl3VarT1.R1.a(l)) {
                        String str = rl3VarT1.U1;
                        a4c a4cVar = gm0.f;
                        if (a4cVar != null) {
                            je9 je9Var = je9.f;
                            if (a4cVar.b(je9Var)) {
                                a4cVar.c(je9Var, str, zo5.j(jLongValue, "drop chat #"), null);
                            }
                        }
                    }
                }
                return sbi.a;
            case 10:
                ym3 ym3Var = (ym3) this.b;
                RecyclerView recyclerView = ym3Var.a;
                ym3Var.b();
                ym3Var.c();
                tp3 tp3Var = ym3Var.e;
                if (tp3Var != null) {
                    recyclerView.o0(tp3Var);
                }
                ym3Var.e = null;
                b65 b65Var = ym3Var.f;
                if (b65Var != null) {
                    recyclerView.q0(b65Var);
                }
                ym3Var.f = null;
                recyclerView.X();
                recyclerView.requestLayout();
                recyclerView.invalidate();
                ym3Var.i = 1;
                return sbi.a;
            case 11:
                ChatsTabWidget chatsTabWidget = (ChatsTabWidget) this.b;
                boolean zBooleanValue3 = ((Boolean) obj).booleanValue();
                gve gveVar = chatsTabWidget.x1;
                if (gveVar != null) {
                    gveVar.f(zBooleanValue3);
                }
                return sbi.a;
            case 12:
                sy4 sy4Var = (sy4) this.b;
                String string = sy4Var.b.a.getString(R.string.folder_all);
                c76 c76Var = c76.a;
                o4c o4cVarL = sy4Var.l();
                c76 c76Var2 = (14 & 2) != 0 ? c76Var : null;
                r66 r66Var = r66.a;
                return p90.a(new r17("all.chat.folder", o4cVarL.a(string, null, 2, false, 0, true, false), -1, c76Var, c76Var2, r66Var, s66.a, r66Var, c76Var, new LinkedHashSet(), 0L, null, null, false, null, c76Var, c76Var));
            case 13:
                w17 w17Var = (w17) this.b;
                Throwable th2 = (Throwable) obj;
                String name = w17.class.getName();
                a4c a4cVar2 = gm0.f;
                if (a4cVar2 != null) {
                    je9 je9Var2 = je9.e;
                    if (a4cVar2.b(je9Var2)) {
                        a4cVar2.c(je9Var2, name, w17Var + ": cancel observe chatFolderDataSource.folder, reason=" + th2, null);
                    }
                }
                return sbi.a;
            case 14:
                InputPhoneScreen inputPhoneScreen = (InputPhoneScreen) this.b;
                zv8[] zv8VarArr2 = InputPhoneScreen.v;
                ml9.b(inputPhoneScreen);
                a8j.x(inputPhoneScreen.s1().i, oh8.b);
                return sbi.a;
            case 15:
                gm0.V(((ae9) this.b).m, "Error in log buffer", new LogController$AnalyticsDebugException("Error in log buffer", (Throwable) obj));
                return sbi.a;
            case 16:
                fh9 fh9Var = (fh9) this.b;
                if (!(((Throwable) obj) instanceof CancellationException)) {
                    fh9Var.a();
                }
                return sbi.a;
            case 17:
                af7 af7Var = (af7) obj;
                ia8 ia8VarE = ((MainActivity) this.b).z.e();
                if (ia8VarE != null) {
                    ia8VarE.k = af7Var;
                }
                return sbi.a;
            case 18:
                ((ika) this.b).e.set(false);
                return sbi.a;
            case 19:
                vf8 vf8Var = (vf8) obj;
                return ((lwd) ((zya) this.b).h.getValue()).a(vf8Var.d, vf8Var.q);
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                gza gzaVar = (gza) this.b;
                Throwable th3 = (Throwable) obj;
                String name2 = gza.class.getName();
                a4c a4cVar3 = gm0.f;
                if (a4cVar3 != null) {
                    je9 je9Var3 = je9.e;
                    if (a4cVar3.b(je9Var3)) {
                        a4cVar3.c(je9Var3, name2, gzaVar + ": cancel startObserve(), reason=" + th3, null);
                    }
                }
                return sbi.a;
            case 21:
                List list = ((nob) this.b).b;
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    Iterator it = list.iterator();
                    if (it.hasNext()) {
                        qt4.A(it.next());
                        throw null;
                    }
                }
                return Boolean.FALSE;
            case 22:
                evb evbVar = (evb) this.b;
                sbi sbiVar = sbi.a;
                boolean z5 = evbVar.e;
                String str2 = evbVar.b;
                if (z5) {
                    gm0.n(str2, "should show onboarding");
                    evbVar.e = evbVar.l();
                } else {
                    gm0.n(str2, "cancel shown onboarding");
                }
                return sbiVar;
            case 23:
                ((r5c) this.b).i.setText(String.valueOf((CharSequence) obj));
                return Boolean.TRUE;
            case 24:
                return (zj5) this.b;
            case 25:
                ned nedVar = (ned) obj;
                String str3 = ((wed) this.b).g;
                a4c a4cVar4 = gm0.f;
                if (a4cVar4 != null) {
                    je9 je9Var4 = je9.f;
                    if (a4cVar4.b(je9Var4)) {
                        a4cVar4.c(je9Var4, str3, "onUndeliveredElement: " + nedVar, null);
                    }
                }
                return sbi.a;
            case 26:
                String str4 = ((yfd) this.b).g;
                a4c a4cVar5 = gm0.f;
                if (a4cVar5 != null) {
                    je9 je9Var5 = je9.f;
                    if (a4cVar5.b(je9Var5)) {
                        a4cVar5.c(je9Var5, str4, c0a.n(obj, "notifQueue: onUndeliveredElement "), null);
                    }
                }
                return sbi.a;
            case 27:
                return p90.a((qfd) this.b);
            case 28:
                p1f p1fVar = (p1f) this.b;
                DataOutput dataOutput = (DataOutput) obj;
                fbc fbcVar = new fbc(9);
                Object[] objArr = p1fVar.b;
                Object[] objArr2 = p1fVar.c;
                long[] jArr = p1fVar.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i4 = 0;
                    while (true) {
                        long j = jArr[i4];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i5 = 8 - ((~(i4 - length)) >>> 31);
                            long j2 = j;
                            int i6 = 0;
                            while (i6 < i5) {
                                if ((255 & j2) < 128) {
                                    int i7 = (i4 << 3) + i6;
                                    Object obj2 = objArr[i7];
                                    Object obj3 = objArr2[i7];
                                    String str5 = (String) obj2;
                                    if (str5 == null || obj3 == null) {
                                        i = i6;
                                    } else {
                                        if (obj3 instanceof Boolean) {
                                            f55.L(dataOutput, str5, d9i.BOOLEAN);
                                            dataOutput.writeBoolean(((Boolean) obj3).booleanValue());
                                        } else if (obj3 instanceof Float) {
                                            f55.L(dataOutput, str5, d9i.FLOAT);
                                            dataOutput.writeFloat(((Number) obj3).floatValue());
                                        } else if (obj3 instanceof Integer) {
                                            f55.L(dataOutput, str5, d9i.INTEGER);
                                            dataOutput.writeInt(((Number) obj3).intValue());
                                        } else if (obj3 instanceof Long) {
                                            f55.L(dataOutput, str5, d9i.LONG);
                                            dataOutput.writeLong(((Number) obj3).longValue());
                                        } else if (obj3 instanceof String) {
                                            i = i6;
                                            f55.M(dataOutput, str5, d9i.STRING, d9i.BIG_STRING, (String) obj3, fbcVar);
                                        } else {
                                            i = i6;
                                            if (obj3 instanceof Set) {
                                                Iterable iterable = (Iterable) obj3;
                                                f55.M(dataOutput, str5, d9i.STRINGS_SET, d9i.BIG_STRINGS_SET, ww3.s1(iterable) instanceof String ? ww3.z1((Set) obj3, ",", null, null, null, 62) : ww3.z1(iterable, ",", null, null, new ik4(28), 30), fbcVar);
                                            }
                                        }
                                        i = i6;
                                    }
                                } else {
                                    i = i6;
                                }
                                j2 >>= 8;
                                i6 = i + 1;
                            }
                            if (i5 == 8) {
                                if (i4 != length) {
                                    i4++;
                                }
                            }
                        } else if (i4 != length) {
                            i4++;
                        }
                    }
                }
                return sbi.a;
            default:
                ((wfe) this.b).a = (Surface) obj;
                return sbi.a;
        }
    }
}
