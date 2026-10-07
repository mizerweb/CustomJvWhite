package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ColorSpace;
import android.graphics.ImageDecoder;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.URLSpan;
import android.text.util.Linkify;
import android.view.View;
import android.view.WindowManager;
import androidx.work.WorkRequest;
import androidx.work.impl.WorkDatabase;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import kotlin.collections.a;
import one.me.android.MainActivity;
import one.me.android.root.ErrorDuringScreenCreationException;
import one.me.android.root.InvalidUriBundleException;
import one.me.android.root.InvalidUriException;
import one.me.android.root.RootController;
import one.me.android.secure.BadFileShareException;
import one.me.deeplink.FailedCreateScreenException;
import one.me.deeplink.MissedDeeplinkFactoryException;
import one.me.deeplink.MissedRequiredBundleException;
import one.me.sdk.arch.Widget;
import org.apache.http.HttpHost;
import ru.ok.android.onelog.impl.BuildConfig;
import ru.ok.tamtam.nano.ProtoException;
import ru.ok.tamtam.nano.Protos;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes.dex */
public abstract class sb8 {
    public static final c5b a = new c5b("CLOSED", 1);
    public static final nre b = new nre(3);
    public static final dz c = new dz(8);
    public static final boolean[] d = new boolean[3];
    public static final int[] e = new int[0];
    public static final long[] f = new long[0];
    public static final float[] g = new float[0];
    public static final String[] h = new String[0];
    public static final byte[] i = new byte[0];
    public static final /* synthetic */ int j = 0;
    public static final /* synthetic */ int k = 0;

    public static final pxa A(b9b b9bVar, String str) {
        return (pxa) b9bVar.d(new owh(str));
    }

    public static Point B(FileDescriptor fileDescriptor, int i2) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFileDescriptor(fileDescriptor, null, options);
        Point point = new Point(options.outWidth, options.outHeight);
        return (i2 == 6 || i2 == 8) ? new Point(point.y, point.x) : point;
    }

    public static Point C(String str, boolean z) {
        int iD;
        if (z) {
            try {
                iD = new se6(str).d(1, "Orientation");
            } catch (IOException unused) {
                iD = 1;
            }
        } else {
            iD = 1;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(str, options);
        Point point = new Point(options.outWidth, options.outHeight);
        return (iD == 6 || iD == 8) ? new Point(point.y, point.x) : point;
    }

    public static final Drawable D(int i2, int i3, Context context) {
        Drawable drawable = context.getDrawable(i2);
        if (drawable == null) {
            ore.p("Required value was null.");
            return null;
        }
        Drawable drawableMutate = drawable.mutate();
        m0(i3, drawableMutate);
        return drawableMutate;
    }

    public static int F(Point point, int i2, int i3) {
        int i4 = 1;
        while (true) {
            if (point.x / i4 <= i2 && point.y / i4 <= i3) {
                return i4;
            }
            i4 *= 2;
        }
    }

    public static final long G(long j2) {
        return gm0.L(j2 / 1024.0d);
    }

    public static Point H(Point point, int i2, int i3) {
        int i4 = point.x;
        if (i4 <= i2 && point.y <= i3) {
            return new Point(point.x, point.y);
        }
        float fMin = Math.min(i2 / i4, i3 / point.y);
        return new Point(Math.round(point.x * fMin), Math.round(point.y * fMin));
    }

    public static final int I(su3 su3Var, int i2) {
        int iC = su3Var.c();
        su3Var.u(i2);
        int i3 = 1;
        while (su3Var.s() == i2) {
            su3Var.u(i2);
            i3++;
        }
        su3Var.t(iC);
        return i3;
    }

    public static int J(int i2) {
        if (i2 == 3) {
            return 180;
        }
        if (i2 != 6) {
            return i2 != 8 ? 0 : 270;
        }
        return 90;
    }

    public static Uri K(String str) {
        String strL = L(str);
        if (TextUtils.isEmpty(strL)) {
            return null;
        }
        return Uri.parse(strL);
    }

    public static String L(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        Pattern pattern = xoh.a;
        return (str.regionMatches(true, 0, "file:", 0, 5) || str.regionMatches(true, 0, HttpHost.DEFAULT_SCHEME_NAME, 0, 4) || str.regionMatches(true, 0, "content", 0, 7) || str.regionMatches(true, 0, "android.resource:/", 0, 18) || str.regionMatches(true, 0, "res:/", 0, 5) || str.regionMatches(true, 0, "data", 0, 4)) ? str : Uri.fromFile(new File(str)).toString();
    }

    public static final WindowManager M(Context context) {
        return (WindowManager) context.getSystemService("window");
    }

    public static final void N(MainActivity mainActivity, qzb qzbVar, Intent intent, boolean z) {
        int i2;
        boolean z2;
        Class cls;
        boolean zA;
        String str;
        boolean zE;
        Object poeVar;
        vyd vydVar;
        Object poeVar2;
        Object obj;
        Object poeVar3;
        String name;
        a4c a4cVar;
        Set<String> setKeySet;
        je9 je9Var = je9.f;
        je9 je9Var2 = je9.d;
        Object obj2 = null;
        if (gm0.c()) {
            String name2 = MainActivity.class.getName();
            a4c a4cVar2 = gm0.f;
            if (a4cVar2 != null && a4cVar2.b(je9Var2)) {
                Bundle extras = intent.getExtras();
                String strZ1 = (extras == null || (setKeySet = extras.keySet()) == null) ? null : ww3.z1(setKeySet, ",", "{", "}", new ol0(28, intent), 24);
                a4cVar2.c(je9Var2, name2, "handleIntent: " + intent + ", " + intent.getAction() + "/" + strZ1, null);
            }
        }
        String[] strArr = lvb.e;
        Bundle extras2 = intent.getExtras();
        int i3 = 2;
        if (extras2 != null) {
            Set<String> setKeySet2 = extras2.keySet();
            if (setKeySet2 == null) {
                setKeySet2 = c76.a;
            }
            Iterator<String> it = setKeySet2.iterator();
            while (true) {
                if (it.hasNext()) {
                    try {
                        poeVar2 = extras2.get(it.next());
                    } catch (Throwable th) {
                        poeVar2 = new poe(th);
                    }
                    Object obj3 = poeVar2 instanceof poe ? obj2 : poeVar2;
                    if (obj3 != null) {
                        if (obj3 instanceof Uri) {
                            obj = obj3;
                        } else {
                            String string = obj3.toString();
                            if (string.length() <= 0 || r5h.X0(string)) {
                                string = obj2;
                            }
                            if (string == null) {
                                continue;
                            } else {
                                obj = Uri.parse(string);
                            }
                        }
                        Uri uri = (Uri) obj;
                        Uri uriL = l21.l(uri);
                        Uri uri2 = uriL == null ? uri : uriL;
                        if (cqk.d(uri2.getScheme(), "file")) {
                            try {
                                poeVar3 = u1m.b((Uri) obj);
                            } catch (Throwable th2) {
                                poeVar3 = new poe(th2);
                            }
                            if (poeVar3 instanceof poe) {
                                poeVar3 = null;
                            }
                            File file = (File) poeVar3;
                            if (file != null) {
                                String absolutePath = file.getAbsolutePath();
                                int i4 = 0;
                                while (true) {
                                    if (i4 < i3) {
                                        if (z5h.K0(absolutePath, strArr[i4], false)) {
                                            qzbVar.c().a("26374", new BadFileShareException("bad file: uri " + obj3 + ", fileUri=" + obj));
                                        } else {
                                            i4++;
                                            i3 = 2;
                                        }
                                    }
                                    name = MainActivity.class.getName();
                                    a4cVar = gm0.f;
                                    if (a4cVar == null && a4cVar.b(je9Var2)) {
                                        a4cVar.c(je9Var2, name, "handleIntent: sc failed, skipping handling intent", null);
                                        return;
                                    }
                                    return;
                                }
                            }
                        }
                        if (dp4.a(uri2, ((Context) qzbVar.getAccessor().d(7).getValue()).getPackageName())) {
                            qzbVar.c().a("43163", new BadFileShareException("own content provider URI: " + obj3 + ", uri=" + obj));
                        } else {
                            String encodedPath = uri.getEncodedPath();
                            if (encodedPath != null) {
                                int i5 = 0;
                                while (true) {
                                    if (i5 >= 2) {
                                        i3 = 2;
                                        obj2 = null;
                                    } else if (z5h.K0(encodedPath, strArr[i5], false)) {
                                        qzbVar.c().a("26374", new BadFileShareException("bad uri " + obj3 + ", uri=" + obj));
                                    } else {
                                        i5++;
                                    }
                                }
                            } else {
                                obj2 = null;
                                i3 = 2;
                            }
                        }
                        name = MainActivity.class.getName();
                        a4cVar = gm0.f;
                        if (a4cVar == null) {
                            return;
                        }
                        a4cVar.c(je9Var2, name, "handleIntent: sc failed, skipping handling intent", null);
                        return;
                    }
                }
            }
        }
        cxb cxbVar = (cxb) qzbVar.getAccessor().c(225);
        if (cxbVar.a()) {
            String name3 = MainActivity.class.getName();
            a4c a4cVar3 = gm0.f;
            if (a4cVar3 != null && a4cVar3.b(je9Var2)) {
                a4cVar3.c(je9Var2, name3, "handleIntent: ful failed, skipiing handlng intent", null);
            }
            cxbVar.b();
            return;
        }
        if ((intent.getFlags() & 1048576) != 0) {
            gm0.n(MainActivity.class.getName(), "handleIntent: restore from history, skip handle intent.");
            return;
        }
        if (intent.getAction() != null) {
            String action = intent.getAction();
            fte.L0.getClass();
            if (ww3.j1(ete.b, action)) {
                String name4 = MainActivity.class.getName();
                a4c a4cVar4 = gm0.f;
                if (a4cVar4 != null && a4cVar4.b(je9Var2)) {
                    a4cVar4.c(je9Var2, name4, "handleIntent: successfully handling EXTERNAL_ACTIONS", null);
                }
                zm3.b.y(intent);
                return;
            }
        }
        jc8 jc8Var = (jc8) qzbVar.getAccessor().c(873);
        if (!cqk.d(intent.getAction(), "action-open-incoming") || mainActivity.f().d.a(n09.d)) {
            i2 = 0;
        } else {
            i2 = z ? 1 : 2;
        }
        jc8Var.b = i2;
        s91 s91Var = (s91) qzbVar.getAccessor().c(1093);
        s91Var.getClass();
        gm0.n("CallActionsProcessor", "handleCallRedirectActionIntent action=" + intent.getAction());
        hve hveVarW1 = ((c1c) s91Var.f.getValue()).c().w1();
        String action2 = intent.getAction();
        if (action2 == null) {
            Uri data = intent.getData();
            if (data == null) {
                data = (Uri) n1g.D(intent, "deep_link", Uri.class);
            }
            if (data == null || !m92.c(data.toString())) {
                cls = MainActivity.class;
                zA = false;
            } else {
                zA = m92.a(hveVarW1);
                cls = MainActivity.class;
            }
        } else {
            ArrayList arrayListB = ((c1c) s91Var.f.getValue()).b();
            if (!arrayListB.isEmpty()) {
                Iterator it2 = arrayListB.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        z2 = false;
                        break;
                    } else if (((b1c) ((c65) it2.next())).c().equals(":chat-list")) {
                        z2 = true;
                        break;
                    }
                }
            } else {
                z2 = false;
                break;
            }
            po1 po1VarL = cy5.l(action2);
            int intExtra = intent.getIntExtra(Widget.ARG_ACCOUNT_ID_OVERRIDE, -1);
            ha9 ha9Var = intExtra != -1 ? new ha9(intExtra) : null;
            if ((po1VarL instanceof ko1) || (po1VarL instanceof fo1)) {
                cls = MainActivity.class;
                boolean z3 = z2;
                ha9 ha9Var2 = ha9Var;
                if (!m92.a(hveVarW1)) {
                    kk9.m(kk9.b, null, z3, ha9Var2, null, 9);
                }
            } else {
                if (!(po1VarL instanceof lo1)) {
                    boolean z4 = z2;
                    ha9 ha9Var3 = ha9Var;
                    if (po1VarL instanceof jo1) {
                        if (!m92.a(hveVarW1)) {
                            String stringExtra = intent.getStringExtra("link_param");
                            kk9.b.o(z4, ha9Var3, stringExtra != null ? stringExtra : "");
                        }
                    } else if (po1VarL instanceof mo1) {
                        String stringExtra2 = intent.getStringExtra("call_id");
                        str = stringExtra2 != null ? stringExtra2 : "";
                        boolean booleanExtra = intent.getBooleanExtra("is_group", false);
                        boolean booleanExtra2 = intent.getBooleanExtra("is_video", false);
                        String[] stringArrayExtra = intent.getStringArrayExtra("sdk_reasons");
                        if (stringArrayExtra == null) {
                            stringArrayExtra = new String[0];
                        }
                        kk9 kk9Var = kk9.b;
                        List listN1 = a.n1(stringArrayExtra);
                        kk9Var.getClass();
                        StringBuilder sb = new StringBuilder();
                        cls = MainActivity.class;
                        StringBuilder sbA = zo5.A(":call-rate?call_id=", str, "&is_group=", "&is_video=", booleanExtra);
                        sbA.append(booleanExtra2);
                        sbA.append("&animated=");
                        sbA.append(z4);
                        sb.append(sbA.toString());
                        if (!listN1.isEmpty()) {
                            sb.append("&sdk_reasons=".concat(ww3.z1(listN1, ",", null, null, null, 62)));
                        }
                        o65.c(kk9Var.b(), sb.toString(), null, ha9Var3, 2);
                    } else {
                        cls = MainActivity.class;
                        if (po1VarL instanceof no1) {
                            String stringExtra3 = intent.getStringExtra("call_id");
                            str = stringExtra3 != null ? stringExtra3 : "";
                            long longExtra = intent.getLongExtra("caller_id", 0L);
                            kk9 kk9Var2 = kk9.b;
                            kk9Var2.getClass();
                            o65.c(kk9Var2.b(), ":unknown-call?call_id=" + str + "&caller_id=" + longExtra + "&animated=" + z4, null, ha9Var3, 2);
                        } else {
                            if (po1VarL.a()) {
                                ore.j(po1VarL, " must be handled in handleCallRedirectActionIntent", "Intent with action: ");
                                return;
                            }
                            zA = false;
                        }
                    }
                } else if (!m92.b(hveVarW1)) {
                    String stringExtra4 = intent.getStringExtra("incoming_param_name");
                    if (stringExtra4 == null) {
                        stringExtra4 = "";
                    }
                    String stringExtra5 = intent.getStringExtra("incoming_param_avatar");
                    long longExtra2 = intent.getLongExtra("incoming_param_chat_id", 0L);
                    boolean booleanExtra3 = intent.getBooleanExtra("incoming_param_is_video", false);
                    kk9 kk9Var3 = kk9.b;
                    String stringExtra6 = intent.getStringExtra("arg_call_session_id");
                    kk9Var3.n(longExtra2, stringExtra4, stringExtra5, booleanExtra3, stringExtra6 == null ? "" : stringExtra6, z2, ha9Var);
                }
                cls = MainActivity.class;
            }
            zA = true;
        }
        if (zA) {
            gm0.n(cls.getName(), "handleIntent: call detect");
            return;
        }
        Uri data2 = intent.getData();
        if (data2 == null) {
            data2 = (Uri) ((Parcelable) n1g.D(intent, "deep_link", Uri.class));
        }
        Uri uri3 = data2;
        String stringExtra7 = intent.getStringExtra("external_callback_param_arg");
        Uri uri4 = (uri3 == null && stringExtra7 == null) ? (Uri) ((Parcelable) n1g.D(intent, "deferred_uri", Uri.class)) : null;
        if (uri3 == null && stringExtra7 == null && uri4 == null) {
            String name5 = cls.getName();
            a4c a4cVar5 = gm0.f;
            if (a4cVar5 != null && a4cVar5.b(je9Var2)) {
                a4cVar5.c(je9Var2, name5, "handleIntent: no uri/param/defUri found", null);
                return;
            }
            return;
        }
        ha9 ha9Var4 = new ha9(intent.getIntExtra(Widget.ARG_ACCOUNT_ID_OVERRIDE, 0));
        if (uri3 != null) {
            try {
                zE = o65.e((o65) qzbVar.getAccessor().c(184), uri3, null, ha9Var4, 2);
            } catch (FailedCreateScreenException e2) {
                String name6 = cls.getName();
                ErrorDuringScreenCreationException errorDuringScreenCreationException = new ErrorDuringScreenCreationException(e2);
                a4c a4cVar6 = gm0.f;
                if (a4cVar6 != null && a4cVar6.b(je9Var)) {
                    a4cVar6.c(je9Var, name6, "Error during creating screen", errorDuringScreenCreationException);
                }
                zE = false;
            } catch (MissedDeeplinkFactoryException e3) {
                String name7 = cls.getName();
                InvalidUriException invalidUriException = new InvalidUriException(e3);
                a4c a4cVar7 = gm0.f;
                if (a4cVar7 != null && a4cVar7.b(je9Var)) {
                    a4cVar7.c(je9Var, name7, "Got uri for non-existed screen", invalidUriException);
                }
                zE = false;
            } catch (MissedRequiredBundleException e4) {
                String name8 = cls.getName();
                InvalidUriBundleException invalidUriBundleException = new InvalidUriBundleException(e4);
                a4c a4cVar8 = gm0.f;
                if (a4cVar8 != null && a4cVar8.b(je9Var)) {
                    a4cVar8.c(je9Var, name8, "Missed required bundle param for screen", invalidUriBundleException);
                }
                zE = false;
            }
            if (!zE) {
                String name9 = cls.getName();
                a4c a4cVar9 = gm0.f;
                if (a4cVar9 != null && a4cVar9.b(je9Var2)) {
                    a4cVar9.c(je9Var2, name9, "handleIntent: uri is incorrect, skip it", null);
                    return;
                }
                return;
            }
        }
        if (stringExtra7 != null) {
            kk9.b.l(intent.getExtras(), stringExtra7);
        }
        mainActivity.J = uri4;
        String name10 = cls.getName();
        a4c a4cVar10 = gm0.f;
        if (a4cVar10 != null && a4cVar10.b(je9Var2)) {
            a4cVar10.c(je9Var2, name10, zo5.l(uri3, "deep link detect "), null);
        }
        String stringExtra8 = intent.getStringExtra("push_action");
        if (stringExtra8 == null) {
            return;
        }
        if (!stringExtra8.equals("push_action_open_chat")) {
            if (stringExtra8.equals("push_action_open_chats")) {
                ((yob) qzbVar.getAccessor().c(566)).f().d();
                return;
            }
            return;
        }
        try {
            poeVar = (vyd) n1g.D(intent, "push_info", vyd.class);
        } catch (Throwable th3) {
            poeVar = new poe(th3);
        }
        Throwable thA = roe.a(poeVar);
        if (thA != null) {
            gm0.V(cls.getName(), "fail to fetch push info", thA);
        }
        if ((poeVar instanceof poe) || (vydVar = (vyd) poeVar) == null) {
            return;
        }
        ((yob) qzbVar.getAccessor().c(566)).f().e(vydVar);
    }

    public static final void O(Context context, Uri uri) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.addCategory("android.intent.category.BROWSABLE");
        intent.setData(uri);
        try {
            context.startActivity(intent);
        } catch (ActivityNotFoundException e2) {
            a4c a4cVar = gm0.f;
            if (a4cVar == null) {
                return;
            }
            je9 je9Var = je9.f;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, "ContextExt", "openWebLink " + uri + ": " + e2.getMessage(), null);
            }
        }
    }

    public static final void P(af7 af7Var, Context context, String str) {
        String url;
        Intent intent;
        try {
            Spannable spannableNewSpannable = Spannable.Factory.getInstance().newSpannable(str);
            Linkify.addLinks(spannableNewSpannable, 1);
            URLSpan uRLSpan = (URLSpan) a.b1((URLSpan[]) spannableNewSpannable.getSpans(0, spannableNewSpannable.length(), URLSpan.class));
            url = uRLSpan != null ? uRLSpan.getURL() : null;
        } catch (Throwable th) {
            gm0.V("ContextExt", "Url cannot be processed", th);
        }
        if (url != null) {
            str = url;
        }
        if (r5h.X0(str)) {
            intent = null;
        } else {
            intent = new Intent("android.intent.action.VIEW");
            intent.setData(Uri.parse(str));
        }
        try {
            context.startActivity(intent);
        } catch (ActivityNotFoundException e2) {
            a4c a4cVar = gm0.f;
            if (a4cVar != null) {
                je9 je9Var = je9.f;
                if (a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, "ContextExt", qv1.l("openWebLink - ", str, ": ", e2.getMessage()), null);
                }
            }
            af7Var.invoke();
        }
    }

    public static final Long Q(Long l) {
        if (l.longValue() > 0) {
            return l;
        }
        return null;
    }

    public static void R(fx2 fx2Var, long j2, mg5 mg5Var) {
        if (((ex2) w(j2, fx2Var.e(mg5Var)).b) == null) {
            fx2Var.a(new ex2(j2, j2), mg5Var);
        }
    }

    public static boolean S(long j2, ex2 ex2Var) {
        return ex2Var != null && ex2Var.a <= j2 && j2 <= ex2Var.b;
    }

    public static void T(ArrayList arrayList) {
        Iterator it;
        if (arrayList.size() <= 1) {
            return;
        }
        ArrayList arrayList2 = null;
        boolean z = true;
        for (int i2 = 1; z && arrayList.size() > i2; i2 = 1) {
            Iterator it2 = arrayList.iterator();
            boolean z2 = false;
            while (it2.hasNext()) {
                ex2 ex2Var = (ex2) it2.next();
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                } else {
                    arrayList2.clear();
                }
                Iterator it3 = arrayList.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        it = it2;
                        break;
                    }
                    ex2 ex2Var2 = (ex2) it3.next();
                    if (ex2Var != ex2Var2) {
                        long j2 = ex2Var.a;
                        long j3 = ex2Var.b;
                        long j4 = ex2Var2.a;
                        it = it2;
                        long j5 = ex2Var2.b;
                        if ((j2 >= j4 && j2 <= j5) || (j3 >= j4 && j3 <= j5)) {
                            ex2 ex2Var3 = new ex2(Math.min(j2, j4), Math.max(j3, j5));
                            arrayList2.add(ex2Var);
                            arrayList2.add(ex2Var2);
                            arrayList.add(ex2Var3);
                            z2 = true;
                        }
                        if (z2) {
                            break;
                        } else {
                            it2 = it;
                        }
                    }
                }
                arrayList.removeAll(arrayList2);
                if (z2) {
                    break;
                } else {
                    it2 = it;
                }
            }
            z = z2;
        }
        arrayList.sort(new ps0(4));
        a4c a4cVar = gm0.f;
        if (a4cVar == null) {
            return;
        }
        je9 je9Var = je9.d;
        if (a4cVar.b(je9Var)) {
            a4cVar.c(je9Var, "sb8", "mergeChunks: ".concat(c0(arrayList)), null);
        }
    }

    public static final void U(File file) {
        if (!file.exists()) {
            if (file.mkdirs()) {
                return;
            }
            qr7.k(zo5.m(file, "Can't create "));
        } else {
            if (file.isDirectory()) {
                return;
            }
            throw new IOException(file + " is not a directory");
        }
    }

    public static final Boolean W(Bundle bundle, String str) {
        String string = bundle.getString(str, null);
        if (string != null) {
            return Boolean.valueOf(Boolean.parseBoolean(string));
        }
        return null;
    }

    public static final Integer X(Bundle bundle, String str) {
        String string = bundle.getString(str);
        if (string != null) {
            return Integer.valueOf(Integer.parseInt(string));
        }
        return null;
    }

    public static final Long Y(Bundle bundle, String str) {
        String string = bundle.getString(str);
        if (string != null) {
            return Long.valueOf(Long.parseLong(string));
        }
        return null;
    }

    public static final long[] Z(Bundle bundle, String str) {
        return bundle.containsKey(str) ? i0(bundle, str) : new long[0];
    }

    public static final tt8 a(qs8 qs8Var, cf7 cf7Var) {
        ys8 ys8Var = new ys8();
        at8 at8Var = qs8Var.a;
        ys8Var.a = at8Var.a;
        boolean z = at8Var.d;
        ys8Var.b = at8Var.b;
        ys8Var.c = at8Var.c;
        String str = at8Var.e;
        ys8Var.d = at8Var.f;
        String str2 = at8Var.g;
        int i2 = at8Var.i;
        boolean z2 = at8Var.h;
        ys8Var.e = qs8Var.b;
        cf7Var.invoke(ys8Var);
        if (cqk.d(str, "    ")) {
            return new tt8(new at8(ys8Var.a, ys8Var.b, ys8Var.c, z, str, ys8Var.d, str2, z2, i2), ys8Var.e);
        }
        ore.p("Indent should not be specified when default printing mode is used");
        return null;
    }

    public static int a0(byte[] bArr, int i2, int i3, boolean z) {
        int i4;
        if (z) {
            i2 += i3 - 1;
            i4 = -1;
        } else {
            i4 = 1;
        }
        int i5 = 0;
        while (true) {
            int i6 = i3 - 1;
            if (i3 <= 0) {
                return i5;
            }
            i5 = (bArr[i2] & 255) | (i5 << 8);
            i2 += i4;
            i3 = i6;
        }
    }

    public static final void b(SpannableStringBuilder spannableStringBuilder, char c2, Object... objArr) {
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append(c2);
        int length2 = spannableStringBuilder.length();
        for (Object obj : objArr) {
            spannableStringBuilder.setSpan(obj, length, length2, 33);
        }
    }

    public static String b0(ex2 ex2Var) {
        if (ex2Var == null) {
            return null;
        }
        Date date = new Date(ex2Var.a);
        Date date2 = new Date(ex2Var.b);
        return String.format(Locale.ENGLISH, "time[%tF %tT %tL - %tF %tT %tL], [start:%d,end:%d]", date, date, date, date2, date2, date2, Long.valueOf(date.getTime()), Long.valueOf(date2.getTime()));
    }

    public static final void c(SpannableStringBuilder spannableStringBuilder, String str, Object... objArr) {
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) str);
        int length2 = spannableStringBuilder.length();
        for (Object obj : objArr) {
            spannableStringBuilder.setSpan(obj, length, length2, 33);
        }
    }

    public static String c0(ArrayList arrayList) {
        StringBuilder sb = new StringBuilder();
        if (arrayList == null || arrayList.isEmpty()) {
            sb.append("chunks count=0");
        } else {
            sb.append("chunks count=");
            sb.append(arrayList.size());
            sb.append(": ");
            if (arrayList.size() > 50) {
                for (int size = arrayList.size() - 50; size < arrayList.size(); size++) {
                    sb.append(b0((ex2) arrayList.get(size)));
                    sb.append(", ");
                }
            } else {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    sb.append(b0((ex2) it.next()));
                    sb.append(", ");
                }
            }
            sb.deleteCharAt(sb.length() - 1);
        }
        return sb.toString();
    }

    public static void d(StringBuilder sb, Object obj, cf7 cf7Var) {
        if (cf7Var != null) {
            sb.append((CharSequence) cf7Var.invoke(obj));
            return;
        }
        if (obj == null ? true : obj instanceof CharSequence) {
            sb.append((CharSequence) obj);
        } else if (obj instanceof Character) {
            sb.append(((Character) obj).charValue());
        } else {
            sb.append((CharSequence) obj.toString());
        }
    }

    public static f68 d0(byte[] bArr) throws ProtoException {
        byte[] bArr2 = ru.ok.tamtam.nano.a.a;
        try {
            Protos.SelfProfile from = Protos.SelfProfile.parseFrom(bArr);
            HashMap map = new HashMap();
            Map<Integer, Protos.RestrictionsInfo> map2 = from.restrictions;
            if (map2 != null && !map2.isEmpty()) {
                for (Integer num : from.restrictions.keySet()) {
                    map.put(num, new loe(from.restrictions.get(num).expiration));
                }
            }
            ArrayList arrayList = new ArrayList();
            int[] iArr = from.profileOptions;
            if (iArr != null && iArr.length >= 1) {
                int i2 = 0;
                while (true) {
                    int[] iArr2 = from.profileOptions;
                    if (i2 >= iArr2.length) {
                        break;
                    }
                    arrayList.add(Integer.valueOf(iArr2[i2]));
                    i2++;
                }
            }
            return new f68(map, arrayList);
        } catch (InvalidProtocolBufferNanoException e2) {
            qr7.t(e2);
            return null;
        }
    }

    public static final void e(RootController rootController, qzb qzbVar, Intent intent) {
        if (rootController.w1().o()) {
            return;
        }
        cxb cxbVar = (cxb) qzbVar.getAccessor().c(225);
        if (cxbVar.a()) {
            cxbVar.b();
            return;
        }
        ha9 ha9VarA = ((y6b) d7c.a.getAccessor().c(174)).a();
        r7 r7Var = r7.a;
        if (!new qzb(r7.d(ha9VarA)).a().b()) {
            fte.L0.getClass();
            if (ww3.j1(ete.b, intent.getAction())) {
                return;
            }
        }
        hl9.b.j(ha9VarA);
    }

    public static final void e0(File file, File file2) throws IOException {
        if (file.renameTo(file2)) {
            return;
        }
        throw new IOException("Can't rename " + file + " to " + file2);
    }

    public static long f(long j2, long j3, long j4, mg5 mg5Var) {
        if (j4 >= j2) {
            return j3;
        }
        return (j3 <= 0 || (!mg5Var.a() && j3 == BuildConfig.MAX_TIME_TO_UPLOAD)) ? j4 : Math.max(j3, j4);
    }

    public static final boolean f0(Bundle bundle, String str) {
        Boolean boolW = W(bundle, str);
        if (boolW != null) {
            return boolW.booleanValue();
        }
        ore.p("Required value was null.");
        return false;
    }

    public static long g(boolean z, int i2, rn0 rn0Var, long j2, long j3, int i3, boolean z2, long j4, long j5, long j6, long j7) {
        if (j7 != BuildConfig.MAX_TIME_TO_UPLOAD && z2) {
            if (i3 != 0) {
                long j8 = j3 + 900000;
                if (j7 < j8) {
                    return j8;
                }
            }
            return j7;
        }
        if (z) {
            long jScalb = rn0Var == rn0.b ? j2 * ((long) i2) : (long) Math.scalb(j2, i2 - 1);
            if (jScalb > WorkRequest.MAX_BACKOFF_MILLIS) {
                jScalb = 18000000;
            }
            return j3 + jScalb;
        }
        if (!z2) {
            return j3 == -1 ? BuildConfig.MAX_TIME_TO_UPLOAD : j3 + j4;
        }
        long j9 = i3 == 0 ? j3 + j4 : j3 + j6;
        return (j5 == j6 || i3 != 0) ? j9 : (j6 - j5) + j9;
    }

    public static final int g0(Bundle bundle, String str) {
        Integer numX = X(bundle, str);
        if (numX != null) {
            return numX.intValue();
        }
        ore.p("Required value was null.");
        return 0;
    }

    public static final void h(oyj oyjVar, String str) {
        h0k h0kVarB;
        WorkDatabase workDatabase = oyjVar.c;
        qzj qzjVarX = workDatabase.x();
        sh5 sh5VarR = workDatabase.r();
        ArrayList arrayListR0 = xw3.R0(str);
        while (!arrayListR0.isEmpty()) {
            String str2 = (String) cx3.f1(arrayListR0);
            kyj kyjVarC = qzjVarX.c(str2);
            if (kyjVarC != kyj.c && kyjVarC != kyj.d) {
                ((Number) ch3.G(qzjVarX.a, false, true, new qo1(str2, 20))).intValue();
            }
            arrayListR0.addAll(sh5VarR.a(str2));
        }
        ijd ijdVar = oyjVar.f;
        synchronized (ijdVar.k) {
            n1g.x().p(ijd.l, "Processor cancelling " + str);
            ijdVar.i.add(str);
            h0kVarB = ijdVar.b(str);
        }
        ijd.d(str, h0kVarB, 1);
        Iterator it = oyjVar.e.iterator();
        while (it.hasNext()) {
            ((a3f) it.next()).b(str);
        }
    }

    public static final long h0(Bundle bundle, String str) {
        Long lY = Y(bundle, str);
        if (lY != null) {
            return lY.longValue();
        }
        ore.p("Required value was null.");
        return 0L;
    }

    public static void i(ig4 ig4Var, b29 b29Var, hg4 hg4Var) {
        hg4Var.o = -1;
        of4 of4Var = hg4Var.L;
        int[] iArr = hg4Var.o0;
        of4 of4Var2 = hg4Var.K;
        of4 of4Var3 = hg4Var.I;
        of4 of4Var4 = hg4Var.J;
        of4 of4Var5 = hg4Var.H;
        hg4Var.p = -1;
        int[] iArr2 = ig4Var.o0;
        if (iArr2[0] != 2 && iArr[0] == 4) {
            int i2 = of4Var5.g;
            int iO = ig4Var.o() - of4Var4.g;
            of4Var5.i = b29Var.k(of4Var5);
            of4Var4.i = b29Var.k(of4Var4);
            b29Var.d(of4Var5.i, i2);
            b29Var.d(of4Var4.i, iO);
            hg4Var.o = 2;
            hg4Var.X = i2;
            int i3 = iO - i2;
            hg4Var.T = i3;
            int i4 = hg4Var.a0;
            if (i3 < i4) {
                hg4Var.T = i4;
            }
        }
        if (iArr2[1] == 2 || iArr[1] != 4) {
            return;
        }
        int i5 = of4Var3.g;
        int i6 = ig4Var.i() - of4Var2.g;
        of4Var3.i = b29Var.k(of4Var3);
        of4Var2.i = b29Var.k(of4Var2);
        b29Var.d(of4Var3.i, i5);
        b29Var.d(of4Var2.i, i6);
        if (hg4Var.Z > 0 || hg4Var.f0 == 8) {
            adg adgVarK = b29Var.k(of4Var);
            of4Var.i = adgVarK;
            b29Var.d(adgVarK, hg4Var.Z + i5);
        }
        hg4Var.p = 2;
        hg4Var.Y = i5;
        int i7 = i6 - i5;
        hg4Var.U = i7;
        int i8 = hg4Var.b0;
        if (i7 < i8) {
            hg4Var.U = i8;
        }
    }

    public static final long[] i0(Bundle bundle, String str) {
        e65 e65Var = e65.a;
        String strJ0 = j0(bundle, str);
        return ww3.U1(yhf.w0(new m2i(yhf.m0(new m2i(r5h.d1(strJ0, new String[]{","}, true, 0), new qo1(strJ0, 15)), d65.a), e65Var)));
    }

    public static ArrayList j(fx2 fx2Var, long j2, mg5 mg5Var) {
        ArrayList arrayList = new ArrayList();
        for (ex2 ex2Var : fx2Var.e(mg5Var)) {
            long j3 = ex2Var.b;
            if (j3 >= j2) {
                if (ex2Var.a > j2) {
                    arrayList.add(ex2Var);
                } else if (S(j2, ex2Var)) {
                    long j4 = 1 + j2;
                    if (j4 <= j3) {
                        if (j4 == -1) {
                            qv1.u("start time is -1", "Chunk.Builder", "");
                        }
                        if (j3 == -1) {
                            qv1.u("end time is -1", "Chunk.Builder", "");
                        }
                        arrayList.add(new ex2(j4, j3));
                    }
                }
            }
        }
        return arrayList;
    }

    public static final String j0(Bundle bundle, String str) {
        String string = bundle.getString(str);
        if (string != null) {
            return string;
        }
        ore.p("Required value was null.");
        return null;
    }

    public static final double k(double d2, lw5 lw5Var, lw5 lw5Var2) {
        TimeUnit timeUnit = lw5Var2.a;
        TimeUnit timeUnit2 = lw5Var.a;
        long jConvert = timeUnit.convert(1L, timeUnit2);
        return jConvert > 0 ? d2 * jConvert : d2 / timeUnit2.convert(1L, timeUnit);
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [c88] */
    public static boolean k0(gjf gjfVar, String str, String str2) {
        Bitmap bitmapN;
        g5d g5dVar = (g5d) gjfVar;
        int iO = g5dVar.o();
        int iM = g5dVar.m();
        int iN = g5dVar.n();
        int iD = new se6(str).d(1, "Orientation");
        int i2 = Build.VERSION.SDK_INT;
        Point pointC = i2 >= 28 ? C(str, true) : C(str, false);
        final Point pointH = H(pointC, iO, iM);
        if (pointH.x == pointC.x && pointH.y == pointC.y) {
            return false;
        }
        if (i2 >= 28) {
            try {
                bitmapN = ImageDecoder.decodeBitmap(ImageDecoder.createSource(new File(str)), new ImageDecoder.OnHeaderDecodedListener() { // from class: c88
                    @Override // android.graphics.ImageDecoder.OnHeaderDecodedListener
                    public final void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
                        Point point = pointH;
                        imageDecoder.setTargetSize(point.x, point.y);
                        imageDecoder.setTargetColorSpace(ColorSpace.get(ColorSpace.Named.SRGB));
                        imageDecoder.setAllocator(1);
                    }
                });
            } catch (IOException unused) {
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeFile(str, options);
                bitmapN = n(str, new Point(options.outWidth, options.outHeight), pointH);
            }
            iD = 1;
        } else {
            bitmapN = n(str, pointC, pointH);
        }
        try {
            l0(str2, bitmapN, iN, Bitmap.CompressFormat.JPEG);
            bitmapN.recycle();
            try {
                se6 se6Var = new se6(str2);
                se6Var.G("Orientation", String.valueOf(iD));
                se6Var.C();
            } catch (Exception unused2) {
            }
            return true;
        } catch (Throwable th) {
            if (bitmapN != null) {
                bitmapN.recycle();
            }
            throw th;
        }
    }

    public static final long l(long j2, lw5 lw5Var) {
        long j3;
        int i2 = mw5.$EnumSwitchMapping$0[lw5Var.ordinal()];
        if (i2 == 1) {
            j3 = 86400000;
        } else if (i2 == 2) {
            j3 = 3600000;
        } else if (i2 == 3) {
            j3 = 60000;
        } else if (i2 == 4) {
            j3 = 1000;
        } else {
            if (i2 != 5) {
                qr7.v(lw5Var, "Wrong unit for millisMultiplier: ");
                return 0L;
            }
            j3 = 1;
        }
        if (j2 == 0) {
            return 0L;
        }
        if (j2 == 1) {
            if (j3 <= 4611686018427387903L) {
                return j3;
            }
        } else if (j3 != 1) {
            int iNumberOfLeadingZeros = (128 - Long.numberOfLeadingZeros(j2)) - Long.numberOfLeadingZeros(j3);
            if (iNumberOfLeadingZeros < 63) {
                return j2 * j3;
            }
            if (iNumberOfLeadingZeros <= 63) {
                long j4 = j2 * j3;
                if (j4 <= 4611686018427387903L) {
                    return j4;
                }
            }
        } else if (j2 <= 4611686018427387903L) {
            return j2;
        }
        return 4611686018427387903L;
    }

    public static void l0(String str, Bitmap bitmap, int i2, Bitmap.CompressFormat compressFormat) throws Throwable {
        FileOutputStream fileOutputStream = null;
        try {
            try {
                FileOutputStream fileOutputStream2 = new FileOutputStream(str);
                try {
                    bitmap.compress(compressFormat, i2, fileOutputStream2);
                    gm0.m("sb8", "save bitmap success! %s", str);
                    oxl.c(fileOutputStream2);
                } catch (IOException e2) {
                    e = e2;
                    fileOutputStream = fileOutputStream2;
                    gm0.V("sb8", "save bitmap failure!", e);
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    fileOutputStream = fileOutputStream2;
                    oxl.c(fileOutputStream);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException e3) {
            e = e3;
        }
    }

    public static final void m0(int i2, Drawable drawable) {
        if (drawable != null) {
            drawable.setTint(i2);
            drawable.setTintMode(PorterDuff.Mode.SRC_IN);
        }
    }

    public static Bitmap n(String str, Point point, Point point2) {
        int i2 = 1;
        while (true) {
            int i3 = i2 * 2;
            if (point.x / i3 < point2.x || point.y / i3 < point2.y) {
                break;
            }
            i2 = i3;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inSampleSize = i2;
        Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(str, options);
        int width = bitmapDecodeFile.getWidth();
        int height = bitmapDecodeFile.getHeight();
        int i4 = point2.x;
        if (width == i4 && height == point2.y) {
            return bitmapDecodeFile;
        }
        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapDecodeFile, i4, point2.y, true);
        if (bitmapCreateScaledBitmap != bitmapDecodeFile) {
            bitmapDecodeFile.recycle();
        }
        return bitmapCreateScaledBitmap;
    }

    public static final String n0(lw5 lw5Var) {
        switch (lw5Var.ordinal()) {
            case 0:
                return "ns";
            case 1:
                return "us";
            case 2:
                return "ms";
            case 3:
                return "s";
            case 4:
                return "m";
            case 5:
                return "h";
            case 6:
                return "d";
            default:
                qr7.v(lw5Var, "Unknown unit: ");
                return null;
        }
    }

    public static final void o(File file) {
        if (!file.exists() || lu6.l0(file)) {
            return;
        }
        qr7.k(zo5.m(file, "Can't delete "));
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0071  */
    public static final void o0(MainActivity mainActivity, qzb qzbVar, h9c h9cVar) {
        int height;
        o8c o8cVar = h9cVar.e;
        lve lveVar = (lve) ww3.t1(qzbVar.h().c().w1().e());
        br4 br4Var = lveVar != null ? lveVar.a : null;
        Widget widget = br4Var instanceof Widget ? (Widget) br4Var : null;
        if (widget == null) {
            gm0.Y(MainActivity.class.getName(), "widget is null for snackbar");
            return;
        }
        gm0.n(MainActivity.class.getName(), "detect snackbar");
        if (n8c.a(o8cVar.c())) {
            br4 parentController = widget;
            while (parentController.getParentController() != null) {
                parentController = parentController.getParentController();
            }
            View view = parentController.getView();
            Object parent = view != null ? view.getParent() : null;
            View view2 = parent instanceof View ? (View) parent : null;
            txb txbVar = view2 != null ? (txb) view2.findViewById(R.id.oneme_main_bottom_bar) : null;
            if (txbVar != null) {
                height = txbVar.getHeight();
            } else {
                height = 0;
            }
        } else {
            height = 0;
        }
        h8c h8cVar = new h8c(widget);
        h8cVar.o(h9c.a(h9cVar, null, null, null, null, new o8c(0, 0, o8cVar.b() + height, 11), null, null, 111));
        h8cVar.p();
    }

    public static final to5 p(xx6 xx6Var, cf7 cf7Var, qf7 qf7Var) {
        if (xx6Var instanceof to5) {
            to5 to5Var = (to5) xx6Var;
            if (to5Var.b == cf7Var && to5Var.c == qf7Var) {
                return to5Var;
            }
        }
        return new to5(xx6Var, cf7Var, qf7Var);
    }

    public static final void p0(MainActivity mainActivity, qzb qzbVar, Intent intent) {
        Object poeVar;
        h9c h9cVar;
        if (intent == null) {
            intent = mainActivity.getIntent();
        }
        try {
            poeVar = (h9c) n1g.D(intent, "snackbar", h9c.class);
        } catch (Throwable th) {
            poeVar = new poe(th);
        }
        Throwable thA = roe.a(poeVar);
        if (thA != null) {
            gm0.V(MainActivity.class.getName(), "showSnackbarIfNeeded fail", thA);
        }
        if ((poeVar instanceof poe) || (h9cVar = (h9c) poeVar) == null) {
            return;
        }
        o0(mainActivity, qzbVar, h9cVar);
    }

    public static final boolean q(int i2, int i3) {
        return (i2 & i3) == i3;
    }

    public static final nph q0(tri triVar, geh gehVar) {
        ArrayList arrayList;
        ArrayList arrayList2;
        qri qriVar = triVar.b;
        kph kphVar = qriVar != null ? new kph(qriVar.a, qriVar.b) : null;
        mph mphVar = triVar.a != null ? gehVar != null ? new mph(gehVar) : null : null;
        List list = triVar.d;
        if (list != null) {
            List<rri> list2 = list;
            ArrayList arrayList3 = new ArrayList(yw3.W0(list2, 10));
            for (rri rriVar : list2) {
                arrayList3.add(new lph(rriVar.a, rriVar.b, rriVar.c, rriVar.d, rriVar.e, rriVar.g, rriVar.f));
            }
            arrayList = arrayList3;
        } else {
            arrayList = null;
        }
        List list3 = triVar.e;
        if (list3 != null) {
            List<rri> list4 = list3;
            ArrayList arrayList4 = new ArrayList(yw3.W0(list4, 10));
            for (rri rriVar2 : list4) {
                arrayList4.add(new lph(rriVar2.a, rriVar2.b, rriVar2.c, rriVar2.d, rriVar2.e, rriVar2.g, rriVar2.f));
            }
            arrayList2 = arrayList4;
        } else {
            arrayList2 = null;
        }
        qri qriVar2 = triVar.c;
        return new nph(mphVar, kphVar, qriVar2 != null ? new kph(qriVar2.a, qriVar2.b) : null, arrayList, arrayList2, triVar.f);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0073  */
    /* JADX WARN: Code duplicated, block: B:52:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:75:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:78:0x00f3  */
    public static ArrayList r(List list, List list2, long j2, int i2, long j3, int i3, long j4, mg5 mg5Var) {
        long jF;
        long jB;
        long j5;
        long jMin = j4;
        ArrayList arrayList = new ArrayList(list);
        if (!list2.isEmpty()) {
            gda gdaVar = (gda) list2.get(0);
            gda gdaVar2 = (gda) list2.get(list2.size() - 1);
            ng5 ng5Var = gdaVar.q;
            long jB2 = ng5Var != null ? ng5Var.b() : gdaVar.b;
            ng5 ng5Var2 = gdaVar2.q;
            jB = ng5Var2 != null ? ng5Var2.b() : gdaVar2.b;
            if (i2 > 0 && i3 > 0) {
                if (j3 > 0) {
                    j5 = j2;
                    jF = f(j5, j3, jB2, mg5Var);
                } else {
                    j5 = j2;
                    jF = Math.min(j5, jB2);
                }
                if (jMin > 0) {
                    if (jB <= j5) {
                        if (jMin <= 0) {
                            jMin = jB;
                        }
                    } else if (jMin > 0) {
                        jMin = Math.min(jMin, jB);
                    } else {
                        jMin = jB;
                    }
                } else if (j5 != BuildConfig.MAX_TIME_TO_UPLOAD || !mg5Var.h()) {
                    jB = Math.max(j5, jB);
                }
            } else if (i3 > 0) {
                if (j2 != BuildConfig.MAX_TIME_TO_UPLOAD || !mg5Var.h()) {
                    jB2 = j2;
                }
                if (jB <= j2) {
                    if (jMin <= 0) {
                        jMin = jB;
                    }
                } else if (jMin > 0) {
                    jMin = Math.min(jMin, jB);
                } else {
                    jMin = jB;
                }
                jF = jB2;
            } else {
                if (i2 <= 0) {
                    gm0.n("sb8", "extend chunks, unknown case, return prev chunks");
                    return arrayList;
                }
                jF = f(j2, j3, jB2, mg5Var);
                if (j2 != BuildConfig.MAX_TIME_TO_UPLOAD || !mg5Var.h()) {
                    jB = j2;
                }
            }
            if (jF == -1) {
                qv1.u("start time is -1", "Chunk.Builder", "");
            }
            if (jB == -1) {
                qv1.u("end time is -1", "Chunk.Builder", "");
            }
            arrayList.add(new ex2(jF, jB));
            T(arrayList);
            return arrayList;
        }
        long j6 = j3 > 0 ? j3 : j2;
        if (jMin <= 0) {
            jMin = j2;
        }
        jF = j6;
        jB = jMin;
        if (jF == -1) {
            qv1.u("start time is -1", "Chunk.Builder", "");
        }
        if (jB == -1) {
            qv1.u("end time is -1", "Chunk.Builder", "");
        }
        arrayList.add(new ex2(jF, jB));
        T(arrayList);
        return arrayList;
    }

    public static final void r0(gdi gdiVar) {
        gdiVar.d(108, new g(10));
        gdiVar.d(109, new g(11));
        gdiVar.d(110, new g(12));
        gdiVar.d(111, new g(13));
        gdiVar.d(112, new g(14));
        gdiVar.d(113, new mh(4));
    }

    public static boolean s(fx2 fx2Var, long j2, long j3, mg5 mg5Var) {
        ArrayList arrayListE = fx2Var.e(mg5Var);
        ylc ylcVarW = w(j2, arrayListE);
        Object obj = ylcVarW.b;
        if (obj == null) {
            return false;
        }
        ex2 ex2Var = (ex2) obj;
        long j4 = ex2Var.a;
        if (j4 == -1) {
            qv1.u("start time is -1", "Chunk.Builder", "");
        }
        if (ex2Var.b == -1) {
            qv1.u("end time is -1", "Chunk.Builder", "");
        }
        if (j3 == -1) {
            qv1.u("end time is -1", "Chunk.Builder", "");
        }
        fx2Var.e(mg5Var).remove(((Integer) ylcVarW.a).intValue());
        fx2.f(mg5Var);
        fx2Var.a(new ex2(j4, j3), mg5Var);
        arrayListE.sort(Comparator.comparingLong(new d6(1)));
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, "sb8", "extend by prevMsg: ".concat(c0(fx2Var.e(mg5Var))), null);
            }
        }
        return true;
    }

    public static final void s0(gdi gdiVar) {
        gdiVar.d(975, new l65(19));
        gdiVar.d(927, new l65(20));
        gdiVar.d(948, new l65(21));
        gdiVar.d(1098, new l65(22));
        gdiVar.d(1010, new l65(23));
        gdiVar.d(1099, new l65(24));
        gdiVar.b(4, new gj5(16));
        gdiVar.d(1019, new l65(25));
        gdiVar.d(702, new l65(26));
        gdiVar.d(1100, new l65(27));
        gdiVar.d(973, new l65(15));
        gdiVar.d(1101, new l65(16));
        gdiVar.d(928, new l65(17));
        gdiVar.d(1102, new l65(18));
    }

    public static void t(fx2 fx2Var, List list, long j2, int i2, long j3, int i3, long j4, mg5 mg5Var) {
        ArrayList arrayListR = r(fx2Var.e(mg5Var), list, j2, i2, j3, i3, j4, mg5Var);
        fx2Var.b(mg5Var);
        fx2Var.e(mg5Var).addAll(arrayListR);
        fx2.f(mg5Var);
        gm0.m("sb8", "extendFromHistory, result chunks size: %d", Integer.valueOf(arrayListR.size()));
    }

    public static final void t0(gdi gdiVar) {
        gdiVar.b(3, new gj5(28));
        gdiVar.d(1086, new gj5(29));
        gdiVar.d(1087, new nx9(0));
        gdiVar.d(961, new lf9(9));
        gdiVar.d(1088, new lf9(10));
        gdiVar.d(1089, new nx9(1));
        gdiVar.d(1090, new lf9(11));
        gdiVar.d(1091, new nx9(2));
    }

    public static void u(fx2 fx2Var, sfa sfaVar) {
        long jB = sfaVar.D() ? sfaVar.G.b() : sfaVar.c;
        mg5 mg5Var = sfaVar.H;
        if (fx2Var.d(mg5Var) == 0) {
            gm0.m("sb8", "extendLast, chunks is empty, create first chunk with time: %d", Long.valueOf(jB));
            fx2Var.a(new ex2(jB, jB), mg5Var);
            return;
        }
        ArrayList arrayListE = fx2Var.e(mg5Var);
        int i2 = -1;
        ex2 ex2Var = null;
        for (int i3 = 0; i3 < arrayListE.size(); i3++) {
            ex2 ex2Var2 = (ex2) arrayListE.get(i3);
            if (ex2Var == null || ex2Var.b <= ex2Var2.b) {
                i2 = i3;
                ex2Var = ex2Var2;
            }
        }
        if (ex2Var.b < jB) {
            long j2 = ex2Var.a;
            if (j2 == -1) {
                qv1.u("start time is -1", "Chunk.Builder", "");
            }
            if (ex2Var.b == -1) {
                qv1.u("end time is -1", "Chunk.Builder", "");
            }
            if (jB == -1) {
                qv1.u("end time is -1", "Chunk.Builder", "");
            }
            fx2Var.e(mg5Var).remove(i2);
            fx2.f(mg5Var);
            fx2Var.a(new ex2(j2, jB), mg5Var);
            a4c a4cVar = gm0.f;
            if (a4cVar == null) {
                return;
            }
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, "sb8", "extendLast: ".concat(c0(fx2Var.e(mg5Var))), null);
            }
        }
    }

    public static final void u0(gdi gdiVar) {
        gdiVar.d(190, new b7c(25));
        gdiVar.d(191, new b7c(26));
        gdiVar.d(192, new b7c(27));
        gdiVar.d(193, new b7c(28));
        gdiVar.d(194, new pwb(7));
        gdiVar.d(195, new pwb(8));
        gdiVar.d(196, new b7c(29));
        gdiVar.d(197, new m3d(0));
        gdiVar.d(198, new m3d(1));
        gdiVar.d(199, new m3d(2));
        gdiVar.d(200, new rwb(10));
        gdiVar.d(201, new m3d(3));
        gdiVar.d(202, new b7c(22));
        gdiVar.d(203, new b7c(23));
        gdiVar.d(204, new b7c(24));
        gdiVar.b(4, new pwb(6));
    }

    public static final void v0(gdi gdiVar) {
        gdiVar.d(748, new y6f(21));
        gdiVar.d(749, new z6f(28));
        gdiVar.d(750, new z6f(29));
        gdiVar.d(751, new eaf(0));
        gdiVar.d(752, new y6f(22));
        gdiVar.d(753, new y6f(23));
    }

    public static ylc w(long j2, List list) {
        ex2 ex2Var;
        int i2 = 0;
        while (i2 < list.size()) {
            ex2Var = (ex2) list.get(i2);
            long j3 = ex2Var.a;
            long j4 = ex2Var.b;
            if (j3 == j4) {
                if (j2 == j3) {
                    return new ylc(Integer.valueOf(i2), ex2Var);
                }
                i2++;
            } else {
                if (j2 >= j3 && j2 <= j4) {
                    return new ylc(Integer.valueOf(i2), ex2Var);
                }
                i2++;
            }
        }
        ex2Var = null;
        i2 = -1;
        return new ylc(Integer.valueOf(i2), ex2Var);
    }

    public static ex2 x(long j2, ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        ex2 ex2Var = null;
        while (it.hasNext()) {
            ex2 ex2Var2 = (ex2) it.next();
            long j3 = ex2Var2.b;
            if (j3 < j2 && (ex2Var == null || j3 > ex2Var.b)) {
                ex2Var = ex2Var2;
            }
        }
        return ex2Var;
    }

    public static final RootController y(MainActivity mainActivity) {
        hve hveVar = mainActivity.A;
        if (hveVar == null) {
            hveVar = null;
        }
        if (hveVar.o()) {
            hve hveVar2 = mainActivity.A;
            if (hveVar2 == null) {
                hveVar2 = null;
            }
            RootController rootController = (RootController) hveVar2.g("RootController");
            hve hveVar3 = mainActivity.A;
            (hveVar3 != null ? hveVar3 : null).K();
            return rootController;
        }
        RootController rootController2 = new RootController(ha9.b);
        hve hveVar4 = mainActivity.A;
        if (hveVar4 == null) {
            hveVar4 = null;
        }
        lve lveVarE = oc9.e(rootController2, null, null);
        lveVarE.e("RootController");
        hveVar4.T(lveVarE);
        return rootController2;
    }

    public static final Object z(gcf gcfVar, long j2, qf7 qf7Var) {
        while (true) {
            if (gcfVar.e >= j2 && !gcfVar.g()) {
                return gcfVar;
            }
            Object objE = gcfVar.e();
            c5b c5bVar = a;
            if (objE == c5bVar) {
                return c5bVar;
            }
            gcf gcfVar2 = (gcf) ((p94) objE);
            if (gcfVar2 == null) {
                gcfVar2 = (gcf) qf7Var.invoke(Long.valueOf(gcfVar.e + 1), gcfVar);
                if (gcfVar.j(gcfVar2)) {
                    if (gcfVar.g()) {
                        gcfVar.i();
                    }
                }
            }
            gcfVar = gcfVar2;
        }
    }

    public abstract Map E(ep6 ep6Var, int i2);

    public abstract void V(ep6 ep6Var, int i2);

    public abstract ep6 m(lq0 lq0Var, es0 es0Var);

    public abstract void v(ep6 ep6Var, qg7 qg7Var);
}
