package defpackage;

import android.app.Application;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.graphics.drawable.Drawable;
import android.hardware.camera2.params.OutputConfiguration;
import android.media.MediaCodec;
import android.media.MediaDrmException;
import android.media.MediaRecorder;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import android.util.Size;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.vk.push.common.Logger;
import com.vk.push.core.ipc.RuStore;
import java.io.File;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import org.chromium.support_lib_boundary.StaticsBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class er3 implements lwi, wl, s70, edd, nsi, k74, luj, rmi, d7d, ua4, bn7, gf6, bg7 {
    public static volatile boolean l;
    public static final er3 a = new er3();
    public static final er3 b = new er3();
    public static final er3 c = new er3();
    public static final er3 d = new er3();
    public static final er3 e = new er3();
    public static final o75 f = new o75(18);
    public static final o75 g = new o75(19);
    public static final er3 h = new er3();
    public static final String[] i = new String[0];
    public static final er3 j = new er3();
    public static final er3 k = new er3();
    public static final er3 m = new er3();
    public static final er3 n = new er3();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [android.view.Surface] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v16, types: [android.hardware.camera2.params.OutputConfiguration] */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.StringBuilder] */
    public static kh A(Surface surface, Integer num, l6m l6mVar, zjc zjcVar, yjc yjcVar, akc akcVar, List list, Size size, boolean z, int i2, String str, int i3) {
        Class cls;
        ?? outputConfiguration;
        OutputConfiguration outputConfigurationE;
        ?? outputConfiguration2 = surface;
        l6m l6mVar2 = l6m.k;
        Integer num2 = (i3 & 2) != 0 ? null : num;
        l6m l6mVar3 = (i3 & 4) != 0 ? l6mVar2 : l6mVar;
        boolean z2 = (i3 & np0.o) != 0 ? false : z;
        int i4 = (i3 & 1024) != 0 ? -1 : i2;
        if (l6mVar3 == l6m.n && Build.VERSION.SDK_INT >= 35) {
            if (num2 == null) {
                ore.k("Required value was null.");
                return null;
            }
            if (size == null) {
                ore.k("Required value was null.");
                return null;
            }
            outputConfigurationE = lo.e(num2.intValue(), size);
        } else if (l6mVar3 != l6mVar2) {
            if (size == null) {
                ore.k("Size must defined when creating a deferred OutputConfiguration.");
                return null;
            }
            if (l6mVar3 == l6m.m) {
                cls = SurfaceTexture.class;
            } else if (l6mVar3 == l6m.l) {
                cls = SurfaceHolder.class;
            } else if (l6mVar3 != l6m.o) {
                if (l6mVar3 != l6m.p) {
                    c.q(l6mVar3, "Unsupported OutputType: ");
                    return null;
                }
                if (Build.VERSION.SDK_INT < 35) {
                    ore.k("OutputType.MEDIA_RECORDER requires API 35 or higher.");
                    return null;
                }
                cls = MediaRecorder.class;
            } else {
                if (Build.VERSION.SDK_INT < 35) {
                    ore.k("OutputType.MEDIA_CODEC requires API 35 or higher.");
                    return null;
                }
                cls = MediaCodec.class;
            }
            outputConfiguration = new OutputConfiguration(size, cls);
        } else {
            if (outputConfiguration2 == 0) {
                ore.k("non-null surface!");
                return null;
            }
            try {
                outputConfiguration2 = i4 != -1 ? new OutputConfiguration(i4, (Surface) outputConfiguration2) : new OutputConfiguration(outputConfiguration2);
                outputConfiguration = outputConfiguration2;
            } catch (Throwable th) {
                Log.w("CXCP", "Failed to create an OutputConfiguration for " + outputConfiguration2 + '!', th);
                return null;
            }
        }
        if (z2) {
            outputConfiguration = outputConfigurationE;
            outputConfiguration.enableSurfaceSharing();
        }
        outputConfiguration = outputConfigurationE;
        if (str != null) {
            int i5 = Build.VERSION.SDK_INT;
            if (i5 < 28) {
                ore.c(c0a.k(i5, "physicalCameraId is not supported on API ", " (requires API 28)"));
                return null;
            }
            if (i5 >= 28) {
                outputConfiguration.setPhysicalCameraId(str);
            }
        }
        if (zjcVar != null) {
            int i6 = zjcVar.a;
            int i7 = Build.VERSION.SDK_INT;
            if (i7 >= 33) {
                outputConfiguration.setMirrorMode(i6);
            } else if (i6 != 0) {
                StringBuilder sbY = zo5.y(i7, "Cannot set mirrorMode to a non-default value on API ", ". This may result in unexpected behavior. Requested ");
                sbY.append((Object) zjc.a(i6));
                Log.w("CXCP", sbY.toString());
            }
        }
        if (yjcVar != null) {
            long j2 = yjcVar.a;
            int i8 = Build.VERSION.SDK_INT;
            if (i8 >= 33) {
                outputConfiguration.setDynamicRangeProfile(j2);
            } else if (j2 != 1) {
                StringBuilder sbY2 = zo5.y(i8, "Cannot set dynamicRangeProfile to a non-default value on API ", ". This may result in unexpected behavior. Requested ");
                sbY2.append((Object) yjc.a(j2));
                Log.w("CXCP", sbY2.toString());
            }
        }
        if (akcVar != null && Build.VERSION.SDK_INT >= 33) {
            outputConfiguration.setStreamUseCase(akcVar.a);
        }
        if (!list.isEmpty()) {
            int i9 = Build.VERSION.SDK_INT;
            if (i9 >= 31) {
                Iterator it = list.iterator();
                if (it.hasNext()) {
                    throw qt4.h(it);
                }
            } else {
                Log.w("CXCP", "Cannot add sensorPixelModeUsed value on API " + i9 + ". This may result in unexpected behavior. Requested " + list);
            }
        }
        if (Build.VERSION.SDK_INT >= 28) {
            outputConfiguration.getMaxSharedSurfaceCount();
        }
        return new kh(outputConfiguration);
    }

    public static LinearLayout C(Context context, Collection collection, cf7 cf7Var) {
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            rp4 rp4Var = (rp4) it.next();
            FrameLayout frameLayout = new FrameLayout(context);
            frameLayout.setOnClickListener(new ee(cf7Var, 25, rp4Var));
            Integer num = rp4Var.d;
            a8g a8gVar = pq3.j;
            if (num != null) {
                int iIntValue = num.intValue();
                ImageView imageView = new ImageView(frameLayout.getContext());
                imageView.setImageResource(iIntValue);
                Integer num2 = rp4Var.e;
                if (num2 != null) {
                    imageView.setImageTintList(ColorStateList.valueOf(oc9.Z(num2.intValue(), a8gVar.h(imageView))));
                }
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(gm0.K(yl5.d().getDisplayMetrics().density * 24.0f), gm0.K(24.0f * yl5.d().getDisplayMetrics().density));
                layoutParams.gravity = 8388627;
                layoutParams.setMarginStart(gm0.K(yl5.d().getDisplayMetrics().density * 4.0f));
                frameLayout.addView(imageView, layoutParams);
                n1g.N(new d3(rp4Var, imageView, null, 12), frameLayout);
            } else {
                gm0.Y("ContextMenuViewHierarchyCreator", "Early return in addIcon cuz of action.icon is null");
            }
            TextView textView = new TextView(frameLayout.getContext());
            q9i.a(q9i.e, textView);
            textView.setSingleLine();
            textView.setEllipsize(TextUtils.TruncateAt.END);
            textView.setTextColor(a8gVar.h(textView).getText().b);
            textView.setText(rp4Var.b.b(textView.getContext()));
            Integer num3 = rp4Var.c;
            if (num3 != null) {
                textView.setTextColor(oc9.Z(num3.intValue(), a8gVar.h(textView)));
            }
            n1g.N(new ud9(rp4Var, (lq4) null, 16), textView);
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
            layoutParams2.gravity = 8388627;
            layoutParams2.setMarginStart(rp4Var.d != null ? gm0.K(44.0f * yl5.d().getDisplayMetrics().density) : gm0.K(yl5.d().getDisplayMetrics().density * 4.0f));
            layoutParams2.setMarginEnd(gm0.K(4.0f * yl5.d().getDisplayMetrics().density));
            layoutParams2.topMargin = gm0.K(yl5.d().getDisplayMetrics().density * 12.0f);
            layoutParams2.bottomMargin = gm0.K(12.0f * yl5.d().getDisplayMetrics().density);
            frameLayout.addView(textView, layoutParams2);
            linearLayout.addView(frameLayout, -1, -2);
        }
        return linearLayout;
    }

    public static ljh D() {
        if (!l) {
            ore.k("RuStorePushClient.init() must be called before accessing its methods.");
            return null;
        }
        if (efk.s != null) {
            efk efkVar = efk.s;
            if (efkVar != null) {
                return efkVar.deleteToken();
            }
            ore.k("Client SDK is not initialized, did you call init method in your Application class?");
            return null;
        }
        Log.w("VkpnsClientSdk", "Client SDK is not initialized, did you call init method in your Application class?");
        ik5 ik5Var = new ik5(5, new IllegalStateException("Client SDK is not initialized, did you call init method in your Application class?"));
        ljh ljhVar = new ljh();
        ljhVar.g((IllegalStateException) ik5Var.b);
        return ljhVar;
    }

    public static qf0 E(String str) {
        ma6 ma6Var = qf0.k;
        ma6Var.getClass();
        y1 y1Var = new y1(0, ma6Var);
        while (y1Var.hasNext()) {
            qf0 qf0Var = (qf0) y1Var.next();
            if (cqk.d(qf0Var.name(), str)) {
                return qf0Var;
            }
        }
        ore.f("Collection contains no element matching the predicate.");
        return null;
    }

    public static ljh F() {
        if (!l) {
            ore.k("RuStorePushClient.init() must be called before accessing its methods.");
            return null;
        }
        if (efk.s != null) {
            efk efkVar = efk.s;
            if (efkVar != null) {
                return efkVar.getToken();
            }
            ore.k("Client SDK is not initialized, did you call init method in your Application class?");
            return null;
        }
        Log.w("VkpnsClientSdk", "Client SDK is not initialized, did you call init method in your Application class?");
        ik5 ik5Var = new ik5(5, new IllegalStateException("Client SDK is not initialized, did you call init method in your Application class?"));
        ljh ljhVar = new ljh();
        ljhVar.g((IllegalStateException) ik5Var.b);
        return ljhVar;
    }

    public static void G(Application application, String str, ac5 ac5Var) {
        String str2;
        if (l) {
            Logger.DefaultImpls.warn$default(ac5Var, "RuStorePushClient already initialized", null, 2, null);
            return;
        }
        if (r5h.X0(str)) {
            ore.k("projectId can't be empty");
            return;
        }
        switch (1) {
            case 1:
                str2 = "kotlin";
                break;
            case 2:
                str2 = "unity";
                break;
            case 3:
                str2 = "flutter";
                break;
            case 4:
                str2 = "unreal-engine";
                break;
            case 5:
                str2 = "godot";
                break;
            case 6:
                str2 = "react-native";
                break;
            default:
                throw null;
        }
        String str3 = str2;
        gik gikVar = new gik(application, str, ac5Var, null, null, RuStore.INSTANCE.getAppInfo(), r66.a, str3);
        cqk.d(null, "prod");
        synchronized (efk.r) {
            try {
                if (rek.c()) {
                    Logger.DefaultImpls.warn$default(ac5Var, "Client SDK has been already initialized", null, 2, null);
                } else {
                    if (rek.c()) {
                        efk efkVarB = rek.b();
                        cqk.g(efkVarB.q);
                        vd7.f(efkVarB.q.a, null);
                    }
                    efk.s = new efk(gikVar);
                    efk efkVarB2 = rek.b();
                    Logger logger = efkVarB2.b;
                    qd2 qd2Var = ((nhk) efkVarB2.h.getValue()).a;
                    Logger.DefaultImpls.info$default(logger, "Client SDK is initialized. Version: 7.2.0", null, 2, null);
                    qhk qhkVar = (qhk) efkVarB2.e.getValue();
                    ((Application) qhkVar.a.a.b).registerActivityLifecycleCallbacks(new vn6(1, new rea(2, qhkVar, qhk.class, "onActivityCreated", "onActivityCreated(Landroid/app/Activity;Landroid/os/Bundle;)V", 0, 27)));
                    yab.i0(efkVarB2.q, null, 0, new fpf(efkVarB2, null, 22), 3);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        l = true;
    }

    public static kwb I(LinearLayout linearLayout, Drawable drawable, af7 af7Var, af7 af7Var2, int i2, int i3, s9a s9aVar, s9a s9aVar2) {
        kwb kwbVar = new kwb(linearLayout.getContext());
        kwbVar.setId(R.id.oneme_login_neuro_avatars_avatar);
        kwbVar.setLayoutParams(new ViewGroup.LayoutParams(i2, i3));
        linearLayout.setGravity(1);
        kwbVar.setCloseBadgeClickListener(af7Var);
        kwbVar.setOnImageLoadedListener(af7Var2);
        kwb.y(kwbVar, drawable, null, s9aVar, s9aVar2, 6);
        kwbVar.setAvatarShape(awb.a);
        linearLayout.addView(kwbVar);
        return kwbVar;
    }

    public static String J(List list) {
        Long l2;
        Iterator it = list.iterator();
        if (it.hasNext()) {
            wrc wrcVar = (wrc) it.next();
            Long lValueOf = Long.valueOf(wrcVar.g - ((Number) ((ylc) ww3.r1(wrcVar.e)).b).longValue());
            while (it.hasNext()) {
                wrc wrcVar2 = (wrc) it.next();
                Long lValueOf2 = Long.valueOf(wrcVar2.g - ((Number) ((ylc) ww3.r1(wrcVar2.e)).b).longValue());
                if (lValueOf.compareTo(lValueOf2) > 0) {
                    lValueOf = lValueOf2;
                }
            }
            l2 = lValueOf;
        } else {
            l2 = null;
        }
        long jLongValue = l2 != null ? l2.longValue() : 0L;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        en3 en3Var = new en3(list, jLongValue, 1);
        ts8 ts8Var = new ts8();
        en3Var.invoke(ts8Var);
        return new cu8(linkedHashMap).toString();
    }

    public static void K(ViewGroup viewGroup) {
        seb sebVar = new seb(viewGroup.getContext(), null, 0);
        sebVar.setPadding(gm0.K(yl5.d().getDisplayMetrics().density * 8.0f), 0, gm0.K(8.0f * yl5.d().getDisplayMetrics().density), 0);
        sebVar.setId(R.id.oneme_login_neuro_avatars_tabs_shimmer);
        sebVar.setElevation(0.0f);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
        marginLayoutParams.topMargin = gm0.K(yl5.d().getDisplayMetrics().density * 32.0f);
        sebVar.setLayoutParams(marginLayoutParams);
        sebVar.setVisibility(8);
        sebVar.setTabs(3);
        sebVar.setOverScrollMode(2);
        viewGroup.addView(sebVar);
        aac aacVar = new aac(viewGroup.getContext());
        aacVar.setId(R.id.oneme_login_neuro_avatars_tabs);
        aacVar.setTabMode(0);
        aacVar.setElevation(0.0f);
        ViewGroup.MarginLayoutParams marginLayoutParams2 = new ViewGroup.MarginLayoutParams(-1, -2);
        marginLayoutParams2.topMargin = gm0.K(32.0f * yl5.d().getDisplayMetrics().density);
        aacVar.setLayoutParams(marginLayoutParams2);
        aacVar.setOverScrollMode(2);
        viewGroup.addView(aacVar);
    }

    public static void L(LinearLayout linearLayout, zoh zohVar) {
        int i2 = zohVar.a;
        TextView textView = new TextView(linearLayout.getContext());
        textView.setId(R.id.oneme_login_neuro_avatars_title);
        q9i.a(q9i.c, textView);
        textView.setText(i2);
        textView.setGravity(1);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
        marginLayoutParams.setMargins(gm0.K(yl5.d().getDisplayMetrics().density * 12.0f), 0, gm0.K(yl5.d().getDisplayMetrics().density * 12.0f), 0);
        textView.setLayoutParams(marginLayoutParams);
        n1g.N(new xc9(3, null, 4), textView);
        linearLayout.addView(textView);
        int i3 = zohVar.b;
        TextView textView2 = new TextView(linearLayout.getContext());
        textView2.setId(R.id.oneme_login_neuro_avatars_description);
        q9i.a(q9i.g, textView2);
        textView2.setText(i3);
        textView2.setGravity(1);
        ViewGroup.MarginLayoutParams marginLayoutParams2 = new ViewGroup.MarginLayoutParams(-1, -2);
        marginLayoutParams2.setMargins(gm0.K(yl5.d().getDisplayMetrics().density * 12.0f), gm0.K(yl5.d().getDisplayMetrics().density * 12.0f), gm0.K(12.0f * yl5.d().getDisplayMetrics().density), 0);
        textView2.setLayoutParams(marginLayoutParams2);
        n1g.N(new xc9(3, null, 3), textView2);
        linearLayout.addView(textView2);
    }

    public static void M(ViewGroup viewGroup, zoh zohVar, cf7 cf7Var) {
        rcc rccVar = new rcc(viewGroup.getContext());
        rccVar.setId(R.id.oneme_login_neuro_avatars_toolbar);
        rccVar.setForm(gcc.Compact);
        rccVar.setLeftActions(new wbc(cf7Var));
        rccVar.setTitle(zohVar.a);
        rccVar.setTitleAlpha(0.0f);
        viewGroup.addView(rccVar);
    }

    public static ljh c() {
        ljh ljhVar;
        if (!l) {
            ore.k("RuStorePushClient.init() must be called before accessing its methods.");
            return null;
        }
        ljh ljhVar2 = new ljh();
        fjh fjhVar = new fjh(ljhVar2);
        if (efk.s != null) {
            efk efkVar = efk.s;
            if (efkVar == null) {
                ore.k("Client SDK is not initialized, did you call init method in your Application class?");
                return null;
            }
            ljhVar = efkVar.a();
        } else {
            Log.w("VkpnsClientSdk", "Client SDK is not initialized, did you call init method in your Application class?");
            ik5 ik5Var = new ik5(5, new IllegalStateException("Client SDK is not initialized, did you call init method in your Application class?"));
            ljhVar = new ljh();
            ljhVar.g((IllegalStateException) ik5Var.b);
        }
        ljhVar.b(new nwe(fjhVar), null);
        ljhVar.b(null, new nwe(fjhVar));
        return ljhVar2;
    }

    @Override // defpackage.k74
    public Object B(h74 h74Var) {
        return ch3.m((Executor) ((g85) h74Var).i(new x0e(iz0.class, Executor.class)));
    }

    @Override // defpackage.wl
    public void a(p81 p81Var) {
    }

    @Override // defpackage.bg7, defpackage.sf7, defpackage.sxe, defpackage.rf7, defpackage.mf7
    /* JADX INFO: renamed from: apply */
    public Object mo41apply(Object obj) {
        return obj;
    }

    @Override // defpackage.luj
    public WebViewProviderBoundaryInterface b(q6f q6fVar) {
        throw new UnsupportedOperationException("This should never happen, if this method was called it means we're trying to reach into WebView APK code on an incompatible device. This most likely means the current method is being called too early, or is being called on start-up rather than lazily");
    }

    @Override // defpackage.luj
    public String[] d() {
        return i;
    }

    @Override // defpackage.ua4
    public void e(x76 x76Var) {
        x76Var.h(gul.class, val.a);
        x76Var.h(x2m.class, yml.a);
        x76Var.h(wul.class, yal.a);
        x76Var.h(kvl.class, ebl.a);
        x76Var.h(evl.class, bbl.a);
        x76Var.h(hvl.class, hbl.a);
        x76Var.h(lql.class, u6l.a);
        x76Var.h(tca.class, r6l.a);
        x76Var.h(rsl.class, o9l.a);
        x76Var.h(y1m.class, vkl.a);
        x76Var.h(gql.class, o6l.a);
        x76Var.h(gz8.class, l6l.a);
        x76Var.h(cyl.class, tfl.a);
        x76Var.h(q4m.class, k8l.a);
        x76Var.h(hsl.class, c9l.a);
        x76Var.h(wrl.class, h8l.a);
        x76Var.h(eyl.class, wfl.a);
        x76Var.h(s1m.class, mkl.a);
        x76Var.h(u1m.class, pkl.a);
        x76Var.h(q1m.class, jkl.a);
        x76Var.h(svl.class, zbl.a);
        x76Var.h(o4m.class, w3l.a);
        x76Var.h(uvl.class, jcl.a);
        x76Var.h(czl.class, ugl.a);
        x76Var.h(izl.class, chl.a);
        x76Var.h(gzl.class, ahl.a);
        x76Var.h(ezl.class, xgl.a);
        x76Var.h(zzl.class, bil.a);
        x76Var.h(b0m.class, dil.a);
        x76Var.h(f0m.class, jil.a);
        x76Var.h(d0m.class, gil.a);
        x76Var.h(qvl.class, wbl.a);
        x76Var.h(h0m.class, wil.a);
        x76Var.h(j0m.class, zil.a);
        x76Var.h(l0m.class, cjl.a);
        x76Var.h(n0m.class, fjl.a);
        x76Var.h(v0m.class, ojl.a);
        x76Var.h(t0m.class, rjl.a);
        x76Var.h(xzl.class, qhl.a);
        x76Var.h(dtl.class, dal.a);
        x76Var.h(tzl.class, whl.a);
        x76Var.h(rzl.class, thl.a);
        x76Var.h(vzl.class, zhl.a);
        x76Var.h(w1m.class, skl.a);
        x76Var.h(o3m.class, qnl.a);
        x76Var.h(tol.class, k4l.a);
        x76Var.h(nol.class, d4l.a);
        x76Var.h(jol.class, a4l.a);
        x76Var.h(qol.class, g4l.a);
        x76Var.h(xol.class, s4l.a);
        x76Var.h(vol.class, o4l.a);
        x76Var.h(gpl.class, w4l.a);
        x76Var.h(jpl.class, a5l.a);
        x76Var.h(mpl.class, t5l.a);
        x76Var.h(ppl.class, w5l.a);
        x76Var.h(spl.class, z5l.a);
        x76Var.h(wwk.class, j3l.a);
        x76Var.h(cxk.class, n3l.a);
        x76Var.h(zwk.class, m3l.a);
        x76Var.h(zsl.class, x9l.a);
        x76Var.h(sql.class, x6l.a);
        x76Var.h(trk.class, zxk.a);
        x76Var.h(qrk.class, cyk.a);
        x76Var.h(srl.class, b8l.a);
        x76Var.h(zrk.class, fyk.a);
        x76Var.h(wrk.class, iyk.a);
        x76Var.h(ktk.class, pzk.a);
        x76Var.h(ftk.class, szk.a);
        x76Var.h(fsk.class, lyk.a);
        x76Var.h(csk.class, oyk.a);
        x76Var.h(xuk.class, h0l.a);
        x76Var.h(uuk.class, k0l.a);
        x76Var.h(jvk.class, t0l.a);
        x76Var.h(gvk.class, e1l.a);
        x76Var.h(twk.class, d3l.a);
        x76Var.h(qwk.class, g3l.a);
        x76Var.h(pvk.class, y1l.a);
        x76Var.h(mvk.class, b2l.a);
        x76Var.h(vvk.class, f2l.a);
        x76Var.h(svk.class, i2l.a);
        x76Var.h(e4m.class, ell.a);
        x76Var.h(q3m.class, a7l.a);
        x76Var.h(y3m.class, tbl.a);
        x76Var.h(w3m.class, qbl.a);
        x76Var.h(s3m.class, n8l.a);
        x76Var.h(c4m.class, bll.a);
        x76Var.h(a4m.class, ykl.a);
        x76Var.h(g4m.class, hll.a);
        x76Var.h(u3m.class, r9l.a);
        x76Var.h(m4m.class, wnl.a);
        x76Var.h(k4m.class, znl.a);
        x76Var.h(i4m.class, tnl.a);
        x76Var.h(c2m.class, nll.a);
        x76Var.h(tsl.class, u9l.a);
        x76Var.h(ltl.class, gal.a);
        x76Var.h(gol.class, x3l.a);
        x76Var.h(ksl.class, f9l.a);
        x76Var.h(btl.class, aal.a);
        x76Var.h(url.class, e8l.a);
        x76Var.h(yql.class, g7l.a);
        x76Var.h(brl.class, j7l.a);
        x76Var.h(vql.class, d7l.a);
        x76Var.h(erl.class, m7l.a);
        x76Var.h(ovl.class, nbl.a);
        x76Var.h(mvl.class, kbl.a);
        x76Var.h(nrk.class, fxk.a);
        x76Var.h(d3m.class, hnl.a);
        x76Var.h(m3m.class, nnl.a);
        x76Var.h(f3m.class, knl.a);
        x76Var.h(dol.class, t3l.a);
        x76Var.h(bql.class, i6l.a);
        x76Var.h(ypl.class, f6l.a);
        x76Var.h(vpl.class, c6l.a);
        x76Var.h(wxl.class, bfl.a);
        x76Var.h(ayl.class, qfl.a);
        x76Var.h(yxl.class, efl.a);
        x76Var.h(etk.class, jzk.a);
        x76Var.h(btk.class, mzk.a);
        x76Var.h(gyl.class, zfl.a);
        x76Var.h(myl.class, igl.a);
        x76Var.h(iyl.class, cgl.a);
        x76Var.h(kyl.class, fgl.a);
        x76Var.h(luk.class, vzk.a);
        x76Var.h(huk.class, yzk.a);
        x76Var.h(l2m.class, jml.a);
        x76Var.h(j2m.class, gml.a);
        x76Var.h(z2m.class, bnl.a);
        x76Var.h(b3m.class, enl.a);
        x76Var.h(gzf.class, fhl.a);
        x76Var.h(pzl.class, nhl.a);
        x76Var.h(lzl.class, hhl.a);
        x76Var.h(nzl.class, khl.a);
        x76Var.h(osl.class, l9l.a);
        x76Var.h(dvk.class, n0l.a);
        x76Var.h(avk.class, q0l.a);
        x76Var.h(msl.class, i9l.a);
        x76Var.h(fsl.class, q8l.a);
        x76Var.h(oyl.class, lgl.a);
        x76Var.h(syl.class, rgl.a);
        x76Var.h(qyl.class, ogl.a);
        x76Var.h(ruk.class, b0l.a);
        x76Var.h(ouk.class, e0l.a);
        x76Var.h(cxl.class, xdl.a);
        x76Var.h(exl.class, ael.a);
        x76Var.h(gxl.class, del.a);
        x76Var.h(rsk.class, xyk.a);
        x76Var.h(osk.class, azk.a);
        x76Var.h(wwl.class, odl.a);
        x76Var.h(ywl.class, rdl.a);
        x76Var.h(axl.class, udl.a);
        x76Var.h(lsk.class, ryk.a);
        x76Var.h(isk.class, uyk.a);
        x76Var.h(ixl.class, gel.a);
        x76Var.h(kxl.class, jel.a);
        x76Var.h(mxl.class, mel.a);
        x76Var.h(oxl.class, pel.a);
        x76Var.h(ysk.class, bzk.a);
        x76Var.h(vsk.class, gzk.a);
        x76Var.h(g2m.class, qll.a);
        x76Var.h(e2m.class, tll.a);
        x76Var.h(ntl.class, jal.a);
        x76Var.h(ttl.class, pal.a);
        x76Var.h(qtl.class, mal.a);
        x76Var.h(wtl.class, sal.a);
        x76Var.h(x0m.class, ujl.a);
        x76Var.h(z0m.class, xjl.a);
        x76Var.h(hwk.class, r2l.a);
        x76Var.h(ewk.class, u2l.a);
        x76Var.h(n2m.class, mml.a);
        x76Var.h(p0m.class, ijl.a);
        x76Var.h(r0m.class, ljl.a);
        x76Var.h(bwk.class, l2l.a);
        x76Var.h(yvk.class, o2l.a);
        x76Var.h(pqi.class, dml.a);
        x76Var.h(uwl.class, pcl.a);
        x76Var.h(mwl.class, ldl.a);
        x76Var.h(gwl.class, ddl.a);
        x76Var.h(ewl.class, adl.a);
        x76Var.h(iwl.class, gdl.a);
        x76Var.h(kwl.class, jdl.a);
        x76Var.h(cwl.class, xcl.a);
        x76Var.h(wvl.class, mcl.a);
        x76Var.h(awl.class, ucl.a);
        x76Var.h(yvl.class, scl.a);
        x76Var.h(sxl.class, vel.a);
        x76Var.h(nrl.class, v7l.a);
        x76Var.h(qxl.class, sel.a);
        x76Var.h(uxl.class, yel.a);
        x76Var.h(krl.class, s7l.a);
        x76Var.h(prl.class, y7l.a);
        x76Var.h(a2m.class, kll.a);
        x76Var.h(k1m.class, akl.a);
        x76Var.h(t2m.class, vml.a);
        x76Var.h(o1m.class, gkl.a);
        x76Var.h(m1m.class, dkl.a);
        x76Var.h(p2m.class, pml.a);
        x76Var.h(nwk.class, x2l.a);
        x76Var.h(kwk.class, a3l.a);
        x76Var.h(r2m.class, sml.a);
        x76Var.h(hrl.class, p7l.a);
    }

    @Override // defpackage.gf6
    public Map f(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // defpackage.gf6
    public ff6 g() {
        throw new IllegalStateException();
    }

    @Override // defpackage.luj
    public StaticsBoundaryInterface getStatics() {
        throw new UnsupportedOperationException("This should never happen, if this method was called it means we're trying to reach into WebView APK code on an incompatible device. This most likely means the current method is being called too early, or is being called on start-up rather than lazily");
    }

    @Override // defpackage.gf6
    public byte[] h() throws MediaDrmException {
        throw new MediaDrmException("Attempting to open a session using a dummy ExoMediaDrm.");
    }

    @Override // defpackage.lwi
    public Bitmap i(int i2, int i3, Bitmap bitmap) {
        je9 je9Var = je9.f;
        if (bitmap.getWidth() <= 0 || bitmap.getHeight() <= 0) {
            String name = er3.class.getName();
            a4c a4cVar = gm0.f;
            if (a4cVar != null && a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, name, nbh.u("Incorrect size of original bitmap: width=", bitmap.getWidth(), ", height = ", bitmap.getHeight(), ". Returning original bitmap."), null);
            }
        } else {
            if (i2 > 0 && i3 > 0) {
                float f2 = i2 / i3;
                int iMin = (int) (Math.min(bitmap.getWidth(), bitmap.getHeight()) / ((float) Math.sqrt((f2 * f2) + 1.0f)));
                int i4 = (int) (f2 * iMin);
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap, (bitmap.getWidth() - i4) / 2, (bitmap.getHeight() - iMin) / 2, i4, iMin);
                Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapCreateBitmap, i2, i3, true);
                if (bitmapCreateBitmap != bitmap) {
                    bitmapCreateBitmap.recycle();
                }
                return bitmapCreateScaledBitmap;
            }
            String name2 = er3.class.getName();
            a4c a4cVar2 = gm0.f;
            if (a4cVar2 != null && a4cVar2.b(je9Var)) {
                a4cVar2.c(je9Var, name2, nbh.u("Incorrect requested bitmap size: width=", i2, ", height = ", i3, ". Returning original bitmap."), null);
                return bitmap;
            }
        }
        return bitmap;
    }

    @Override // defpackage.gf6
    public void j(byte[] bArr, byte[] bArr2) {
        throw new IllegalStateException();
    }

    @Override // defpackage.gf6
    public void k(ks9 ks9Var) {
    }

    @Override // defpackage.gf6
    public void l(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // defpackage.gf6
    public int m() {
        return 1;
    }

    @Override // defpackage.wl
    public String p() {
        throw new UnsupportedOperationException("noop supplier");
    }

    @Override // defpackage.gf6
    public cd7 r(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // defpackage.gf6
    public void release() {
    }

    @Override // defpackage.rmi
    public boolean s() {
        return false;
    }

    @Override // defpackage.gf6
    public boolean t(byte[] bArr, String str) {
        throw new IllegalStateException();
    }

    @Override // defpackage.edd
    public boolean test(Object obj) {
        File file = (File) obj;
        return file.exists() && file.canRead();
    }

    @Override // defpackage.rmi
    public Object u(m25 m25Var, lq4 lq4Var) {
        return Boolean.FALSE;
    }

    @Override // defpackage.nsi
    public long v(kbc kbcVar) {
        return rx8.q(0, kbcVar.s().c);
    }

    @Override // defpackage.gf6
    public void w(byte[] bArr) {
    }

    @Override // defpackage.gf6
    public byte[] x(byte[] bArr, byte[] bArr2) {
        throw new IllegalStateException();
    }

    @Override // defpackage.gf6
    public ef6 y(byte[] bArr, List list, int i2, HashMap map) {
        throw new IllegalStateException();
    }

    @Override // defpackage.wl
    public void z(yt1 yt1Var) {
        yt1Var.getClass();
    }
}
