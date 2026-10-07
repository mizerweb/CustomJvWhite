package defpackage;

import android.content.Context;
import android.hardware.SensorManager;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraManager;
import android.os.Build;
import android.util.Size;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.apache.http.conn.params.ConnManagerParams;
import ru.ok.tracer.lite.TracerLite;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class twf implements af7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;

    public /* synthetic */ twf(Context context, u1j u1jVar) {
        this.a = 20;
        this.b = context;
    }

    /* JADX WARN: Code duplicated, block: B:56:0x00cf  */
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
    @Override // defpackage.af7
    public final Object invoke() throws CameraAccessException {
        String str;
        int i = 3;
        int i2 = 2;
        boolean z = true;
        switch (this.a) {
            case 0:
                return (SensorManager) this.b.getSystemService("sensor");
            case 1:
                return new tz0(this.b, 24);
            case 2:
                wti wtiVar = new wti(this.b);
                wtiVar.setBackgroundEnabled(true);
                wtiVar.setDrawableEnabled(false);
                return wtiVar;
            case 3:
                return new tz0(this.b, 1);
            case 4:
                return new p7a(this.b);
            case 5:
                wti wtiVar2 = new wti(this.b);
                wtiVar2.setBackgroundEnabled(true);
                wtiVar2.setDrawableEnabled(false);
                return wtiVar2;
            case 6:
                return new tz0(this.b, 1);
            case 7:
                return new p7a(this.b);
            case 8:
                return new tz0(this.b, 1);
            case 9:
                wti wtiVar3 = new wti(this.b);
                wtiVar3.setBackgroundEnabled(true);
                wtiVar3.setDrawableEnabled(false);
                return wtiVar3;
            case 10:
                return new tz0(this.b, 1);
            case 11:
                wti wtiVar4 = new wti(this.b);
                wtiVar4.setBackgroundEnabled(true);
                wtiVar4.setDrawableEnabled(false);
                return wtiVar4;
            case 12:
                TextView textView = new TextView(this.b);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
                layoutParams.setMarginStart(gm0.K(4.0f * yl5.d().getDisplayMetrics().density));
                textView.setLayoutParams(layoutParams);
                q9i.a(q9i.p, textView);
                n1g.N(new yvf(3, null, 1), textView);
                textView.setGravity(17);
                return textView;
            case 13:
                return new u58(this.b);
            case 14:
                Context applicationContext = this.b.getApplicationContext();
                jxh jxhVar = new jxh();
                jxhVar.b = new a7g("xrRYkU895jUPp2YZo1sxmtFadnlX1oHyouadIxpNzAp");
                TracerLite tracerLite = new TracerLite(applicationContext, "one.video.calls.externcalls", new kxh(jxhVar));
                tracerLite.setKey("calls-sdk-version", "0.2.6");
                return tracerLite;
            case 15:
                TextView textView2 = new TextView(this.b);
                q9i.a(q9i.i, textView2);
                textView2.setTextColor(pq3.j.h(textView2).getText().j);
                LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
                layoutParams2.setMargins(gm0.K(yl5.d().getDisplayMetrics().density * 12.0f), gm0.K(4.0f * yl5.d().getDisplayMetrics().density), gm0.K(12.0f * yl5.d().getDisplayMetrics().density), ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin);
                textView2.setLayoutParams(layoutParams2);
                textView2.setGravity(17);
                return textView2;
            case 16:
                Size sizeW = p90.w(this.b);
                return Integer.valueOf(Math.max(sizeW.getWidth(), sizeW.getHeight()));
            case 17:
                return new xo2(new ds0[]{new byi(), new tz0(this.b, 24)});
            case 18:
                o1i o1iVar = new o1i(this.b);
                o1iVar.setPadding(o1iVar.getPaddingLeft(), gm0.K(8.0f * yl5.d().getDisplayMetrics().density), o1iVar.getPaddingRight(), o1iVar.getPaddingBottom());
                return o1iVar;
            case 19:
                eu9 eu9Var = new eu9(gm0.K(8.0f * yl5.d().getDisplayMetrics().density), 0, this.b);
                eu9Var.e(false);
                return eu9Var;
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                Context context = this.b;
                if (Build.VERSION.SDK_INT < 29) {
                    CameraManager cameraManager = (CameraManager) context.getSystemService("camera");
                    String[] cameraIdList = cameraManager.getCameraIdList();
                    int length = cameraIdList.length;
                    int i3 = 0;
                    boolean z2 = true;
                    while (i3 < length) {
                        String str2 = cameraIdList[i3];
                        CameraCharacteristics cameraCharacteristics = cameraManager.getCameraCharacteristics(str2);
                        Integer num = (Integer) cameraCharacteristics.get(CameraCharacteristics.LENS_FACING);
                        Integer num2 = (Integer) cameraCharacteristics.get(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
                        String str3 = "UNKNOWN";
                        if (num != null && num.intValue() == z) {
                            str = "BACK";
                        } else if (num != null && num.intValue() == 0) {
                            str = "FRONT";
                        } else {
                            str = (num != null && num.intValue() == i2) ? "EXTERNAL" : "UNKNOWN";
                        }
                        if (num2 != null && num2.intValue() == i2) {
                            str3 = "LEGACY";
                        } else if (num2 != null && num2.intValue() == 0) {
                            str3 = "LIMITED";
                        } else if (num2 != null && num2.intValue() == z) {
                            str3 = "FULL";
                        } else if (num2 != null && num2.intValue() == i) {
                            str3 = "LEVEL_3";
                        }
                        boolean z3 = (num2 == null || num2.intValue() == i2) ? false : z;
                        String name = u1j.class.getName();
                        a4c a4cVar = gm0.f;
                        if (a4cVar != null) {
                            je9 je9Var = je9.e;
                            if (a4cVar.b(je9Var)) {
                                StringBuilder sbQ = qv1.q("VideoMessage Camera-", str2, " (", str, "). Level = ");
                                sbQ.append(str3);
                                sbQ.append(". isAvailable = ");
                                sbQ.append(z3);
                                sbQ.append("\n");
                                a4cVar.c(je9Var, name, sbQ.toString(), null);
                            }
                        }
                        i3++;
                        z2 = z3;
                        z = z;
                        i = 3;
                        i2 = 2;
                    }
                    if (!z2) {
                        String name2 = u1j.class.getName();
                        a4c a4cVar2 = gm0.f;
                        if (a4cVar2 != null) {
                            je9 je9Var2 = je9.g;
                            if (a4cVar2.b(je9Var2)) {
                                a4cVar2.c(je9Var2, name2, "Camera for VideoMessage is unavailable. Recording has to be disabled", null);
                            }
                        }
                    }
                    z = z2;
                }
                return Boolean.valueOf(z);
            default:
                return Integer.valueOf(((xac) pq3.j.e(this.b).m().f().b).b.a);
        }
    }

    public /* synthetic */ twf(Context context, int i) {
        this.a = i;
        this.b = context;
    }
}
