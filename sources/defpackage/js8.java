package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import androidx.camera.core.ImageCaptureException;
import androidx.core.graphics.drawable.IconCompat;
import com.vk.push.common.Logger;
import com.vk.push.common.messaging.ClickActionType;
import com.vk.push.common.messaging.NotificationAnalyticsPayload;
import com.vk.push.common.messaging.NotificationPayload;
import com.vk.push.common.messaging.NotificationResourceType;
import java.net.Socket;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;
import kotlinx.coroutines.TimeoutCancellationException;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final class js8 implements f20 {
    public static final p51 g = new p51(6);
    public Object a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;

    public js8(c4d c4dVar, fmf fmfVar, h3d h3dVar, c98 c98Var, Bundle bundle, pmf pmfVar) {
        this.a = c4dVar;
        this.b = fmfVar;
        this.c = h3dVar;
        this.d = c98Var;
        this.e = bundle == null ? Bundle.EMPTY : bundle;
        this.f = pmfVar;
    }

    public static final void h(js8 js8Var, Throwable th) {
        zv zvVar = (zv) js8Var.e;
        p41 p41Var = (p41) js8Var.f;
        if (p41Var.l(false, th)) {
            for (Object objH = p41Var.h(); !(objH instanceof cs2); objH = p41Var.h()) {
                ds2.b(objH);
                zvVar.addLast(objH);
            }
            if (zvVar.isEmpty()) {
                return;
            }
            ((cf7) js8Var.b).invoke(new ArrayList(zvVar));
            zvVar.clear();
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:31:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:32:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:41:0x0111  */
    /* JADX WARN: Code duplicated, block: B:44:0x0140  */
    /* JADX WARN: Code duplicated, block: B:47:0x0147  */
    /* JADX WARN: Code duplicated, block: B:49:0x014a  */
    /* JADX WARN: Code duplicated, block: B:55:0x017b  */
    /* JADX WARN: Code duplicated, block: B:57:0x0181  */
    /* JADX WARN: Code duplicated, block: B:60:0x0195 A[ADDED_TO_REGION, REMOVE] */
    /* JADX WARN: Code duplicated, block: B:63:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:66:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:68:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:70:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:71:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:74:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:76:0x01fb A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:77:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public Object a(NotificationPayload notificationPayload, int i, ylc ylcVar, NotificationAnalyticsPayload notificationAnalyticsPayload, nq4 nq4Var) {
        adk adkVar;
        NotificationPayload notificationPayload2;
        int i2;
        ylc ylcVar2;
        NotificationAnalyticsPayload notificationAnalyticsPayload2;
        Bitmap bitmap;
        Logger logger;
        ifh ifhVar;
        String icon;
        Integer num;
        ylc ylcVar3;
        String color;
        ylc ylcVar4;
        String body;
        Integer num2;
        String clickAction;
        ClickActionType clickActionType;
        qlb qlbVar;
        Intent intent;
        int length;
        boolean z;
        int identifier;
        js8 js8Var = this;
        if (nq4Var instanceof adk) {
            adkVar = (adk) nq4Var;
            int i3 = adkVar.k;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                adkVar.k = i3 - Integer.MIN_VALUE;
            } else {
                adkVar = new adk(js8Var, nq4Var);
            }
        } else {
            adkVar = new adk(js8Var, nq4Var);
        }
        Object objG = adkVar.i;
        int i4 = adkVar.k;
        try {
            if (i4 == 0) {
                ch3.d0(objG);
                Logger.DefaultImpls.info$default((Logger) js8Var.f, "Show notification requested", null, 2, null);
                String image = notificationPayload.getImage();
                if (image != null) {
                    adkVar.d = js8Var;
                    notificationPayload2 = notificationPayload;
                    adkVar.e = notificationPayload2;
                    ylcVar2 = ylcVar;
                    adkVar.f = ylcVar2;
                    notificationAnalyticsPayload2 = notificationAnalyticsPayload;
                    adkVar.g = notificationAnalyticsPayload2;
                    i2 = i;
                    adkVar.h = i2;
                    adkVar.k = 1;
                    objG = js8Var.g(image, adkVar);
                    hu4 hu4Var = hu4.a;
                    if (objG == hu4Var) {
                        return hu4Var;
                    }
                } else {
                    notificationPayload2 = notificationPayload;
                    i2 = i;
                    ylcVar2 = ylcVar;
                    notificationAnalyticsPayload2 = notificationAnalyticsPayload;
                    bitmap = null;
                }
                js8Var.getClass();
                logger = (Logger) js8Var.f;
                ifhVar = (ifh) ((phf) js8Var.d).c;
                Context context = (Context) js8Var.a;
                icon = notificationPayload2.getIcon();
                if (icon != null || r5h.X0(icon) || (identifier = context.getResources().getIdentifier(notificationPayload2.getIcon(), "drawable", context.getPackageName())) == 0) {
                    num = ((c9k) ifhVar.getValue()).a;
                    if (num != null) {
                        ylcVar3 = new ylc(num, NotificationResourceType.MANIFEST);
                    } else {
                        ylcVar3 = new ylc(Integer.valueOf(R.drawable.vkpns_default_notification_icon), NotificationResourceType.DEFAULT_SDK);
                    }
                } else {
                    ylcVar3 = new ylc(Integer.valueOf(identifier), NotificationResourceType.PAYLOAD);
                }
                color = notificationPayload2.getColor();
                if (color != null || r5h.X0(color)) {
                    ylcVar4 = new ylc(((c9k) ifhVar.getValue()).b, NotificationResourceType.MANIFEST);
                } else {
                    try {
                        ylcVar4 = new ylc(Integer.valueOf(Color.parseColor(notificationPayload2.getColor())), NotificationResourceType.PAYLOAD);
                    } catch (IllegalArgumentException unused) {
                        Logger.DefaultImpls.error$default(logger, "Could not parse color: " + notificationPayload2.getColor(), null, 2, null);
                        ylcVar4 = new ylc(((c9k) ifhVar.getValue()).b, NotificationResourceType.MANIFEST);
                    }
                }
                zfh zfhVar = (zfh) js8Var.b;
                String title = notificationPayload2.getTitle();
                body = notificationPayload2.getBody();
                int iIntValue = ((Number) ylcVar3.a).intValue();
                num2 = (Integer) ylcVar4.a;
                clickAction = notificationPayload2.getClickAction();
                if (clickAction == null) {
                    clickAction = "android.intent.action.MAIN";
                } else {
                    if (r5h.X0(clickAction)) {
                        clickAction = null;
                    }
                    if (clickAction == null) {
                        clickAction = "android.intent.action.MAIN";
                    }
                }
                clickActionType = notificationPayload2.getClickActionType();
                String str = (String) ylcVar2.a;
                Context context2 = (Context) zfhVar.a;
                qlbVar = new qlb(context2, str);
                qlbVar.e = qlb.c(title);
                qlbVar.d(body);
                if (clickActionType != ClickActionType.DEEP_LINK && clickAction.length() > 0) {
                    intent = new Intent("android.intent.action.VIEW", Uri.parse(clickAction));
                } else if (clickAction.equals("android.intent.action.MAIN") || (intent = context2.getPackageManager().getLaunchIntentForPackage(context2.getPackageName())) == null) {
                    intent = new Intent(clickAction);
                }
                intent.putExtra("vkpns.click_event_marker", "");
                intent.putExtra("vkpns.click_event_marker.request_code", i2);
                if (notificationAnalyticsPayload2 != null) {
                    intent.putExtra("vkpns.analytics_payload.push_token_part", notificationAnalyticsPayload2.getPushTokenPart());
                    intent.putExtra("vkpns.analytics_payload.message_id", notificationAnalyticsPayload2.getMessageId());
                }
                intent.setPackage(context2.getPackageName());
                intent.setFlags(335544320);
                qlbVar.g = PendingIntent.getActivity(context2, i2, intent, 201326592);
                qlbVar.G.icon = iIntValue;
                if (num2 != null) {
                    qlbVar.y = num2.intValue();
                }
                if (bitmap != null) {
                    qlbVar.g(bitmap);
                }
                if (body != null) {
                    length = body.length();
                } else {
                    length = 0;
                }
                if (length >= 35) {
                    if (bitmap != null) {
                        nlb nlbVar = new nlb();
                        nlbVar.e = IconCompat.b(bitmap);
                        nlbVar.f = null;
                        z = true;
                        nlbVar.g = true;
                        qlbVar.i(nlbVar);
                    }
                    qlbVar.f(16, z);
                    ((umb) js8Var.c).a(null, i2, qlbVar.a());
                    return sbi.a;
                }
                olb olbVar = new olb();
                olbVar.e = qlb.c(body);
                qlbVar.i(olbVar);
                z = true;
                qlbVar.f(16, z);
                ((umb) js8Var.c).a(null, i2, qlbVar.a());
                return sbi.a;
            }
            if (i4 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int i5 = adkVar.h;
            NotificationAnalyticsPayload notificationAnalyticsPayload3 = adkVar.g;
            ylcVar2 = adkVar.f;
            NotificationPayload notificationPayload3 = adkVar.e;
            js8 js8Var2 = adkVar.d;
            ch3.d0(objG);
            notificationAnalyticsPayload2 = notificationAnalyticsPayload3;
            notificationPayload2 = notificationPayload3;
            i2 = i5;
            js8Var = js8Var2;
            if (length >= 35) {
                if (bitmap != null) {
                    nlb nlbVar2 = new nlb();
                    nlbVar2.e = IconCompat.b(bitmap);
                    nlbVar2.f = null;
                    z = true;
                    nlbVar2.g = true;
                    qlbVar.i(nlbVar2);
                }
                qlbVar.f(16, z);
                ((umb) js8Var.c).a(null, i2, qlbVar.a());
                return sbi.a;
            }
            olb olbVar2 = new olb();
            olbVar2.e = qlb.c(body);
            qlbVar.i(olbVar2);
            ((umb) js8Var.c).a(null, i2, qlbVar.a());
        } catch (SecurityException unused2) {
            Logger.DefaultImpls.warn$default(logger, "Post notification permission is missing", null, 2, null);
        }
        bitmap = (Bitmap) objG;
        js8Var.getClass();
        logger = (Logger) js8Var.f;
        ifhVar = (ifh) ((phf) js8Var.d).c;
        Context context3 = (Context) js8Var.a;
        icon = notificationPayload2.getIcon();
        if (icon != null) {
            num = ((c9k) ifhVar.getValue()).a;
            if (num != null) {
                ylcVar3 = new ylc(num, NotificationResourceType.MANIFEST);
            } else {
                ylcVar3 = new ylc(Integer.valueOf(R.drawable.vkpns_default_notification_icon), NotificationResourceType.DEFAULT_SDK);
            }
        } else {
            num = ((c9k) ifhVar.getValue()).a;
            if (num != null) {
                ylcVar3 = new ylc(num, NotificationResourceType.MANIFEST);
            } else {
                ylcVar3 = new ylc(Integer.valueOf(R.drawable.vkpns_default_notification_icon), NotificationResourceType.DEFAULT_SDK);
            }
        }
        color = notificationPayload2.getColor();
        if (color != null) {
            ylcVar4 = new ylc(((c9k) ifhVar.getValue()).b, NotificationResourceType.MANIFEST);
        } else {
            ylcVar4 = new ylc(((c9k) ifhVar.getValue()).b, NotificationResourceType.MANIFEST);
        }
        zfh zfhVar2 = (zfh) js8Var.b;
        String title2 = notificationPayload2.getTitle();
        body = notificationPayload2.getBody();
        int iIntValue2 = ((Number) ylcVar3.a).intValue();
        num2 = (Integer) ylcVar4.a;
        clickAction = notificationPayload2.getClickAction();
        if (clickAction == null) {
            clickAction = "android.intent.action.MAIN";
        } else {
            if (r5h.X0(clickAction)) {
                clickAction = null;
            }
            if (clickAction == null) {
                clickAction = "android.intent.action.MAIN";
            }
        }
        clickActionType = notificationPayload2.getClickActionType();
        String str2 = (String) ylcVar2.a;
        Context context4 = (Context) zfhVar2.a;
        qlbVar = new qlb(context4, str2);
        qlbVar.e = qlb.c(title2);
        qlbVar.d(body);
        if (clickActionType != ClickActionType.DEEP_LINK) {
            if (clickAction.equals("android.intent.action.MAIN")) {
                intent = new Intent(clickAction);
            } else {
                intent = new Intent(clickAction);
            }
        } else if (clickAction.equals("android.intent.action.MAIN")) {
            intent = new Intent(clickAction);
        } else {
            intent = new Intent(clickAction);
        }
        intent.putExtra("vkpns.click_event_marker", "");
        intent.putExtra("vkpns.click_event_marker.request_code", i2);
        if (notificationAnalyticsPayload2 != null) {
            intent.putExtra("vkpns.analytics_payload.push_token_part", notificationAnalyticsPayload2.getPushTokenPart());
            intent.putExtra("vkpns.analytics_payload.message_id", notificationAnalyticsPayload2.getMessageId());
        }
        intent.setPackage(context4.getPackageName());
        intent.setFlags(335544320);
        qlbVar.g = PendingIntent.getActivity(context4, i2, intent, 201326592);
        qlbVar.G.icon = iIntValue2;
        if (num2 != null) {
            qlbVar.y = num2.intValue();
        }
        if (bitmap != null) {
            qlbVar.g(bitmap);
        }
        if (body != null) {
            length = body.length();
        } else {
            length = 0;
        }
        z = true;
        qlbVar.f(16, z);
        return sbi.a;
    }

    @Override // defpackage.f20
    public String c() {
        return (String) this.f;
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:45:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    @Override // defpackage.f20
    public Object d(long j, p20 p20Var, nq4 nq4Var) {
        u04 u04Var;
        p20 p20Var2;
        long j2;
        Object objO;
        sfa sfaVar;
        long j3;
        p20 p20Var3;
        String str;
        a4c a4cVar;
        je9 je9Var = je9.d;
        Object obj = sbi.a;
        if (nq4Var instanceof u04) {
            u04Var = (u04) nq4Var;
            int i = u04Var.i;
            if ((i & Integer.MIN_VALUE) != 0) {
                u04Var.i = i - Integer.MIN_VALUE;
            } else {
                u04Var = new u04(this, nq4Var);
            }
        } else {
            u04Var = new u04(this, nq4Var);
        }
        Object obj2 = u04Var.g;
        Object obj3 = hu4.a;
        int i2 = u04Var.i;
        if (i2 == 0) {
            ch3.d0(obj2);
            p20Var2 = p20Var;
            u04Var.e = p20Var2;
            j2 = j;
            u04Var.d = j2;
            u04Var.i = 1;
            objO = o(u04Var);
            if (objO != obj3) {
            }
        }
        if (i2 == 1) {
            long j4 = u04Var.d;
            p20 p20Var4 = u04Var.e;
            ch3.d0(obj2);
            objO = obj2;
            p20Var2 = p20Var4;
            j2 = j4;
        } else {
            if (i2 != 2) {
                if (i2 == 3) {
                    ch3.d0(obj2);
                    return obj;
                }
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j3 = u04Var.d;
            sfaVar = u04Var.f;
            p20Var3 = u04Var.e;
            ch3.d0(obj2);
        }
        str = (String) ((qg7) this.b).b;
        a4cVar = gm0.f;
        if (a4cVar != null && a4cVar.b(je9Var)) {
            q24 q24Var = (q24) this.a;
            long j5 = sfaVar.c;
            StringBuilder sb = new StringBuilder("Empty chunks in comments chat: ");
            sb.append(q24Var);
            sb.append(", time=");
            sb.append(j3);
            a4cVar.c(je9Var, str, qt4.k(j5, ", load around ", sb), null);
        }
        if (j3 == 1) {
            p20Var3.m(sfaVar.c);
            return obj;
        }
        u04Var.e = null;
        u04Var.f = null;
        u04Var.d = j3;
        u04Var.i = 3;
        p20Var3.E(-1L);
        p20Var3.A(p20Var3.s, b10.a);
        p20Var3.m(j3);
        return obj == obj3 ? obj3 : obj;
        sfaVar = (sfa) objO;
        if (sfaVar != null) {
            u04Var.e = p20Var2;
            u04Var.f = sfaVar;
            u04Var.d = j2;
            u04Var.i = 2;
            if (m(sfaVar, u04Var) != obj3) {
                j3 = j2;
                p20Var3 = p20Var2;
                str = (String) ((qg7) this.b).b;
                a4cVar = gm0.f;
                if (a4cVar != null) {
                    q24 q24Var2 = (q24) this.a;
                    long j6 = sfaVar.c;
                    StringBuilder sb2 = new StringBuilder("Empty chunks in comments chat: ");
                    sb2.append(q24Var2);
                    sb2.append(", time=");
                    sb2.append(j3);
                    a4cVar.c(je9Var, str, qt4.k(j6, ", load around ", sb2), null);
                }
                if (j3 == 1) {
                    p20Var3.m(sfaVar.c);
                    return obj;
                }
                u04Var.e = null;
                u04Var.f = null;
                u04Var.d = j3;
                u04Var.i = 3;
                p20Var3.E(-1L);
                p20Var3.A(p20Var3.s, b10.a);
                p20Var3.m(j3);
                if (obj == obj3) {
                }
            }
        }
        String str2 = (String) ((qg7) this.b).b;
        a4c a4cVar2 = gm0.f;
        if (a4cVar2 != null && a4cVar2.b(je9Var)) {
            a4cVar2.c(je9Var, str2, "Parent message not found", null);
            return obj;
        }
    }

    @Override // defpackage.f20
    public Object e(n20 n20Var) {
        xn3 xn3Var = (xn3) ((ny8) this.e).getValue();
        q24 q24Var = (q24) this.a;
        xn3Var.getClass();
        return e9i.N(new jz(xn3Var.c.i(q24Var), 13), n20Var);
    }

    @Override // defpackage.f20
    public void f() {
        r();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object g(String str, nq4 nq4Var) {
        xck xckVar;
        if (nq4Var instanceof xck) {
            xckVar = (xck) nq4Var;
            int i = xckVar.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                xckVar.g = i - Integer.MIN_VALUE;
            } else {
                xckVar = new xck(this, nq4Var);
            }
        } else {
            xckVar = new xck(this, nq4Var);
        }
        Object objJ0 = xckVar.e;
        int i2 = xckVar.g;
        try {
            if (i2 == 0) {
                ch3.d0(objJ0);
                oli oliVar = new oli(this, str, null, 23);
                xckVar.d = this;
                xckVar.g = 1;
                objJ0 = lvb.J0(5000L, oliVar, xckVar);
                hu4 hu4Var = hu4.a;
                if (objJ0 == hu4Var) {
                    return hu4Var;
                }
            } else {
                if (i2 != 1) {
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                this = xckVar.d;
                ch3.d0(objJ0);
            }
            return (Bitmap) objJ0;
        } catch (TimeoutCancellationException unused) {
            Logger.DefaultImpls.warn$default((Logger) this.f, "Unable to download image for 5000 ms", null, 2, null);
            return null;
        }
    }

    public void i(String str, String str2) {
        HashMap map = (HashMap) this.f;
        if (map != null) {
            map.put(str, str2);
        } else {
            ore.k("Property \"autoMetadata\" has not been set");
        }
    }

    public kh0 j() {
        String strConcat = ((String) this.a) == null ? " transportName" : "";
        if (((r76) this.c) == null) {
            strConcat = strConcat.concat(" encodedPayload");
        }
        if (((Long) this.d) == null) {
            strConcat = strConcat.concat(" eventMillis");
        }
        if (((Long) this.e) == null) {
            strConcat = strConcat.concat(" uptimeMillis");
        }
        if (((HashMap) this.f) == null) {
            strConcat = strConcat.concat(" autoMetadata");
        }
        if (strConcat.isEmpty()) {
            return new kh0((String) this.a, (Integer) this.b, (r76) this.c, ((Long) this.d).longValue(), ((Long) this.e).longValue(), (HashMap) this.f);
        }
        ore.k("Missing required properties:".concat(strConcat));
        return null;
    }

    public w08 k() {
        return new w08(this);
    }

    public int l() {
        int iN;
        wxl.a();
        qyj.l("The ImageReader is not initialized.", ((ls9) this.b) != null);
        ls9 ls9Var = (ls9) this.b;
        synchronized (ls9Var.a) {
            iN = ((o78) ls9Var.d).n() - ls9Var.b;
        }
        return iN;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0102, code lost:
    
        if (r8.e(r9, r0, r7) == r15) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object m(defpackage.sfa r59, defpackage.nq4 r60) {
        /*
            Method dump skipped, instruction units count: 264
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.js8.m(sfa, nq4):java.lang.Object");
    }

    public void n(c9e c9eVar) {
        this.f = c9eVar;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x006e, code lost:
    
        if (r10 == r8) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object o(defpackage.nq4 r10) {
        /*
            r9 = this;
            java.lang.Object r0 = r9.a
            q24 r0 = (defpackage.q24) r0
            boolean r1 = r10 instanceof defpackage.w04
            if (r1 == 0) goto L18
            r1 = r10
            w04 r1 = (defpackage.w04) r1
            int r2 = r1.f
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L18
            int r2 = r2 - r3
            r1.f = r2
        L16:
            r7 = r1
            goto L1e
        L18:
            w04 r1 = new w04
            r1.<init>(r9, r10)
            goto L16
        L1e:
            java.lang.Object r10 = r7.d
            int r1 = r7.f
            r2 = 0
            r3 = 2
            r4 = 1
            hu4 r8 = defpackage.hu4.a
            if (r1 == 0) goto L3b
            if (r1 == r4) goto L37
            if (r1 != r3) goto L31
            defpackage.ch3.d0(r10)
            goto L71
        L31:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ore.k(r9)
            return r2
        L37:
            defpackage.ch3.d0(r10)
            goto L53
        L3b:
            defpackage.ch3.d0(r10)
            java.lang.Object r10 = r9.e
            ny8 r10 = (defpackage.ny8) r10
            java.lang.Object r10 = r10.getValue()
            xn3 r10 = (defpackage.xn3) r10
            long r5 = r0.a
            r7.f = r4
            java.lang.Object r10 = r10.i(r5, r7)
            if (r10 != r8) goto L53
            goto L70
        L53:
            rt2 r10 = (defpackage.rt2) r10
            if (r10 != 0) goto L58
            return r2
        L58:
            java.lang.Object r9 = r9.d
            ny8 r9 = (defpackage.ny8) r9
            java.lang.Object r9 = r9.getValue()
            r2 = r9
            sua r2 = (defpackage.sua) r2
            long r9 = r10.a
            long r5 = r0.b
            r7.f = r3
            r3 = r9
            java.lang.Object r10 = r2.p(r3, r5, r7)
            if (r10 != r8) goto L71
        L70:
            return r8
        L71:
            sfa r10 = (defpackage.sfa) r10
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.js8.o(nq4):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:15:0x008d  */
    public void p(l78 l78Var) throws Exception {
        boolean z;
        hjd hjdVar;
        hjd hjdVar2;
        wxl.a();
        if (((hjd) this.a) == null) {
            tvj.g("CaptureNode", "Discarding ImageProxy which was inadvertently acquired: " + l78Var);
            l78Var.close();
            return;
        }
        ghh ghhVarD = l78Var.getImageInfo().d();
        if (((Integer) ghhVarD.a.get(((hjd) this.a).h)) == null) {
            tvj.g("CaptureNode", "Discarding ImageProxy which was acquired for another request, mCurrentRequest id = " + ((hjd) this.a).a + ", ImageProxy tagBundle keys = " + ghhVarD.a.keySet());
            l78Var.close();
            return;
        }
        wxl.a();
        li0 li0Var = (li0) this.d;
        Objects.requireNonNull(li0Var);
        li0Var.a.accept(new mi0((hjd) this.a, l78Var));
        hjd hjdVar3 = (hjd) this.a;
        zg0 zg0Var = (zg0) this.e;
        if (zg0Var != null) {
            z = zg0Var.h.size() > 1;
        }
        if (z && (hjdVar2 = (hjd) this.a) != null) {
            hjdVar2.b.b(l78Var.getFormat());
        }
        if (!z || ((hjdVar = (hjd) this.a) != null && hjdVar.b.a())) {
            this.a = null;
        }
        tvj.e("ProcessingRequest", "onImageCaptured: request ID = " + hjdVar3.a);
        if (hjdVar3.k != -1) {
            hjdVar3.a(100);
        }
        qme qmeVar = hjdVar3.g;
        wxl.a();
        if (qmeVar.g) {
            return;
        }
        if (!qmeVar.h) {
            qmeVar.b();
        }
        qmeVar.e.b(null);
    }

    public void q(hjd hjdVar) {
        wxl.a();
        qyj.l("only one capture stage is supported.", hjdVar.i.size() == 1);
        qyj.l("Too many acquire images. Close image to be able to process next.", l() > 0);
        this.a = hjdVar;
        o9b.a(hjdVar.j, new xp9(this, hjdVar, false, 10), zjl.a());
    }

    public void r() {
        xn3 xn3Var = (xn3) ((ny8) this.e).getValue();
        q24 q24Var = (q24) this.a;
        pq3 pq3Var = xn3Var.c;
        s04 s04Var = (s04) ((r8e) pq3Var.i(q24Var)).a.getValue();
        if (s04Var != null) {
            tw2 tw2VarH = s04Var.b.h();
            tw2VarH.n.b(mg5.REGULAR);
            tw2VarH.y = 0L;
            tw2VarH.j = 0L;
            pq3Var.q(xn3Var.j().D(q24Var, new nx2(tw2VarH)));
        }
    }

    public void s(fj0 fj0Var) {
        int i;
        boolean z;
        wxl.a();
        hjd hjdVar = (hjd) this.a;
        if (hjdVar == null || (i = hjdVar.a) != fj0Var.a) {
            return;
        }
        ImageCaptureException imageCaptureException = fj0Var.b;
        tvj.i("ProcessingRequest", "onCaptureFailure: request ID = " + i, imageCaptureException);
        qme qmeVar = hjdVar.g;
        gj0 gj0Var = qmeVar.a;
        wxl.a();
        if (qmeVar.g) {
            return;
        }
        wxl.a();
        int i2 = gj0Var.a;
        if (i2 > 0) {
            z = true;
            gj0Var.a = i2 - 1;
        } else {
            z = false;
        }
        if (!z) {
            wxl.a();
            gj0Var.c.execute(new ewg(gj0Var, 5, imageCaptureException));
        }
        qmeVar.a();
        qmeVar.e.d(imageCaptureException);
        if (z) {
            qhh qhhVar = qmeVar.b;
            wxl.a();
            tvj.a("TakePictureManagerImpl", "Add a new request for retrying.");
            qhhVar.a.addFirst(gj0Var);
            qhhVar.c();
        }
    }

    public void t() {
        ((wl) this.c).getClass();
    }

    public void u(Socket socket, String str, u8e u8eVar, s8e s8eVar) {
        this.b = socket;
        this.c = uqi.g + ' ' + str;
        this.d = u8eVar;
        this.e = s8eVar;
    }

    public js8(pkh pkhVar) {
        this.a = pkhVar;
        this.f = p08.a;
    }
}
