package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.BitmapFactory;
import android.graphics.Picture;
import android.net.Uri;
import android.support.v4.media.session.PlaybackStateCompat;
import android.text.Layout;
import android.text.SpannableString;
import android.text.style.StyleSpan;
import android.webkit.ValueCallback;
import androidx.work.a;
import com.vk.push.common.Logger;
import com.vk.push.core.data.imageloader.ImageDownloaderImpl;
import com.vk.push.core.filedatastore.FileDataSource;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.net.URLConnection;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import one.me.devmenu.logsviewer.IntegrityLogsViewerScreen;
import one.me.folders.edit.FolderEditScreen;
import one.me.folders.picker.FolderMemberPickerScreen;
import one.me.inviteactions.invitefriendsbottomsheet.InviteFriendsToMaxBottomSheet;
import one.me.mediaeditor.MediaEditScreen;
import one.me.settings.multilang.LocaleBottomSheet;
import one.me.webview.FaqWebViewWidget;
import org.apache.http.conn.params.ConnManagerParams;
import ru.ok.tamtam.upload.workers.DownloadFileWorker;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class el6 extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ el6(Object obj, Object obj2, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.f = obj;
        this.g = obj2;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        Object obj2 = this.g;
        switch (i) {
            case 0:
                el6 el6Var = new el6(lq4Var, (FaqWebViewWidget) obj2, 0);
                el6Var.f = obj;
                return el6Var;
            case 1:
                el6 el6Var2 = new el6((FileDataSource) obj2, lq4Var, 1);
                el6Var2.f = obj;
                return el6Var2;
            case 2:
                el6 el6Var3 = new el6((wr6) obj2, lq4Var, 2);
                el6Var3.f = obj;
                return el6Var3;
            case 3:
                return new el6((b99) this.f, (t07) obj2, lq4Var, 3);
            case 4:
                el6 el6Var4 = new el6((FolderMemberPickerScreen) obj2, lq4Var, 4);
                el6Var4.f = obj;
                return el6Var4;
            case 5:
                return new el6((d67) this.f, (ynh) obj2, lq4Var, 5);
            case 6:
                return new el6((u87) this.f, (StringBuilder) obj2, lq4Var, 6);
            case 7:
                return new el6((ej7) this.f, (kef) obj2, lq4Var, 7);
            case 8:
                return new el6((Layout) this.f, (ao7) obj2, lq4Var, 8);
            case 9:
                return new el6((String) this.f, (b08) obj2, lq4Var, 9);
            case 10:
                return new el6((String) this.f, (ImageDownloaderImpl) obj2, lq4Var, 10);
            case 11:
                return new el6((mh7) this.f, (rb8) obj2, lq4Var, 11);
            case 12:
                el6 el6Var5 = new el6((bf8) obj2, lq4Var, 12);
                el6Var5.f = obj;
                return el6Var5;
            case 13:
                return new el6((String) this.f, (bf8) obj2, lq4Var, 13);
            case 14:
                return new el6((IntegrityLogsViewerScreen) this.f, (String) obj2, lq4Var, 14);
            case 15:
                el6 el6Var6 = new el6((gm8) obj2, lq4Var, 15);
                el6Var6.f = obj;
                return el6Var6;
            case 16:
                el6 el6Var7 = new el6((InviteFriendsToMaxBottomSheet) obj2, lq4Var, 16);
                el6Var7.f = obj;
                return el6Var7;
            case 17:
                el6 el6Var8 = new el6((sr8) obj2, lq4Var, 17);
                el6Var8.f = obj;
                return el6Var8;
            case 18:
                el6 el6Var9 = new el6((vr8) obj2, lq4Var, 18);
                el6Var9.f = obj;
                return el6Var9;
            case 19:
                el6 el6Var10 = new el6((ib9) obj2, lq4Var, 19);
                el6Var10.f = obj;
                return el6Var10;
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                el6 el6Var11 = new el6(lq4Var, (LocaleBottomSheet) obj2, 20);
                el6Var11.f = obj;
                return el6Var11;
            case 21:
                el6 el6Var12 = new el6((we9) obj2, lq4Var, 21);
                el6Var12.f = obj;
                return el6Var12;
            case 22:
                el6 el6Var13 = new el6((CharSequence) obj2, lq4Var, 22);
                el6Var13.f = obj;
                return el6Var13;
            case 23:
                return new el6((kj9) this.f, (List) obj2, lq4Var, 23);
            case 24:
                return new el6((as9) this.f, (jef) obj2, lq4Var, 24);
            case 25:
                el6 el6Var14 = new el6(lq4Var, (wd2) obj2, 25);
                el6Var14.f = obj;
                return el6Var14;
            case 26:
                return new el6((xv9) this.f, (Uri) obj2, lq4Var, 26);
            case 27:
                return new el6((MediaEditScreen) this.f, (qw9) obj2, lq4Var, 27);
            case 28:
                el6 el6Var15 = new el6(lq4Var, (npb) obj2, 28);
                el6Var15.f = obj;
                return el6Var15;
            default:
                return new el6((lx9) this.f, (jef) obj2, lq4Var, 29);
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) throws IllegalAccessException, IOException, InvocationTargetException {
        int i = this.e;
        sbi sbiVar = sbi.a;
        switch (i) {
            case 0:
                ((el6) create(obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 1:
                return ((el6) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 2:
                ((el6) create((h50) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 3:
                ((el6) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 4:
                ((el6) create((m37) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 5:
                ((el6) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 6:
                return ((el6) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 7:
                ((el6) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 8:
                ((el6) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 9:
                ((el6) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 10:
                return ((el6) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 11:
                return ((el6) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 12:
                ((el6) create((me8) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 13:
                ((el6) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 14:
                ((el6) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 15:
                ((el6) create((gh8) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 16:
                ((el6) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 17:
                ((el6) create((List) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 18:
                ((el6) create((rt2) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 19:
                ((el6) create((List) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                ((el6) create(obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 21:
                ((el6) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 22:
                return ((el6) create((File) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 23:
                return ((el6) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 24:
                ((el6) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 25:
                ((el6) create(obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 26:
                return ((el6) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 27:
                ((el6) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 28:
                ((el6) create(obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            default:
                ((el6) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
        }
    }

    /* JADX WARN: Code duplicated, block: B:271:0x07e1  */
    /* JADX WARN: Code duplicated, block: B:273:0x07e4  */
    /* JADX WARN: Code duplicated, block: B:275:0x080a  */
    /* JADX WARN: Code duplicated, block: B:276:0x080d  */
    /* JADX WARN: Code duplicated, block: B:279:0x0818  */
    /* JADX WARN: Code duplicated, block: B:288:0x0832  */
    /* JADX WARN: Code duplicated, block: B:38:0x00e2  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) throws IllegalAccessException, IOException, InvocationTargetException {
        Object poeVar;
        Integer num;
        rvc rvcVar;
        rvc rvcVar2;
        hb9 hb9Var;
        Uri uri;
        int i;
        int i2;
        Uri uri2;
        Uri uriA;
        String path;
        int count;
        Object value;
        Object objA;
        Object value2;
        Object objA2;
        Object poeVar2;
        int i3 = -1;
        int i4 = 0;
        int i5 = 0;
        switch (this.e) {
            case 0:
                Object obj2 = this.f;
                ch3.d0(obj);
                gr6 gr6Var = (gr6) obj2;
                FaqWebViewWidget faqWebViewWidget = (FaqWebViewWidget) this.g;
                ldf ldfVar = FaqWebViewWidget.k;
                if (gr6Var instanceof er6) {
                    byte b = ((er6) gr6Var).a.getMode() == 1 ? (byte) 1 : (byte) 0;
                    String str = sj8.a;
                    Intent intent = new Intent("android.intent.action.GET_CONTENT");
                    intent.addCategory("android.intent.category.OPENABLE");
                    intent.setType("*/*");
                    if (b != 0) {
                        intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
                    }
                    try {
                        faqWebViewWidget.startActivityForResult(intent, 1001);
                    } catch (ActivityNotFoundException e) {
                        gm0.V(FaqWebViewWidget.class.getName(), "Failed to open file chooser", e);
                        ValueCallback<Uri[]> filePathCallback = faqWebViewWidget.p1().getFilePathCallback();
                        if (filePathCallback != null) {
                            filePathCallback.onReceiveValue(null);
                        }
                        faqWebViewWidget.p1().setFilePathCallback(null);
                    }
                    break;
                } else {
                    if (!(gr6Var instanceof fr6)) {
                        ore.o();
                        return null;
                    }
                    fr6 fr6Var = (fr6) gr6Var;
                    ValueCallback<Uri[]> filePathCallback2 = faqWebViewWidget.p1().getFilePathCallback();
                    if (filePathCallback2 != null) {
                        filePathCallback2.onReceiveValue(fr6Var.a);
                    }
                    faqWebViewWidget.p1().setFilePathCallback(null);
                }
                return sbi.a;
            case 1:
                ch3.d0(obj);
                try {
                    poeVar = lu6.p0(FileDataSource.access$getFileSource((FileDataSource) this.g), pt2.a);
                    break;
                } catch (Throwable th) {
                    poeVar = new poe(th);
                }
                return new roe(poeVar);
            case 2:
                h50 h50Var = (h50) this.f;
                ch3.d0(obj);
                ((wr6) this.g).U(h50Var);
                return sbi.a;
            case 3:
                ch3.d0(obj);
                ((b99) this.f).f((t07) this.g);
                return sbi.a;
            case 4:
                FolderMemberPickerScreen folderMemberPickerScreen = (FolderMemberPickerScreen) this.g;
                vv vvVar = folderMemberPickerScreen.o;
                m37 m37Var = (m37) this.f;
                ch3.d0(obj);
                if (m37Var == null) {
                    ore.o();
                    return null;
                }
                zv8[] zv8VarArr = FolderMemberPickerScreen.q;
                zv8 zv8Var = zv8VarArr[1];
                if (!r5h.X0((String) vvVar.a(folderMemberPickerScreen))) {
                    hve router = folderMemberPickerScreen.getRouter();
                    zv8 zv8Var2 = zv8VarArr[1];
                    br4 br4VarG = router.g((String) vvVar.a(folderMemberPickerScreen));
                    FolderEditScreen folderEditScreen = br4VarG instanceof FolderEditScreen ? (FolderEditScreen) br4VarG : null;
                    if (folderEditScreen != null) {
                        Set set = m37Var.a;
                        f37 f37VarP1 = folderEditScreen.p1();
                        f37VarP1.y.B(f37VarP1, f37.D[1], yab.h0(f37VarP1.b, ((n0c) f37VarP1.d).a(), 2, new qc5(set, f37VarP1, (lq4) null, 20)));
                    }
                }
                folderMemberPickerScreen.getRouter().D();
                return sbi.a;
            case 5:
                ch3.d0(obj);
                h8c h8cVar = (h8c) ((d67) this.f).f.getValue();
                h8cVar.m((ynh) this.g);
                h8cVar.h(new w8c(R.drawable.icon_check_round_fill));
                h8cVar.p();
                return sbi.a;
            case 6:
                ch3.d0(obj);
                u87 u87Var = (u87) this.f;
                h8c h8cVar2 = (h8c) u87Var.k.getValue();
                h8cVar2.n((StringBuilder) this.g);
                h8cVar2.c(new o8c(0, 0, f55.o(u87Var.f).f, 11));
                return h8cVar2.p();
            case 7:
                sbi sbiVar = sbi.a;
                ch3.d0(obj);
                ej7 ej7Var = (ej7) this.f;
                mjg mjgVar = ej7Var.n;
                List list = (List) mjgVar.getValue();
                kef kefVar = (kef) this.g;
                Iterator it = list.iterator();
                int i6 = 0;
                while (it.hasNext()) {
                    if (s1m.a(((ki7) it.next()).c.b, kefVar.a.d())) {
                        i3 = i6;
                        num = new Integer(i3);
                        if (num.intValue() < 0) {
                            num = null;
                        }
                        if (num != null) {
                            int iIntValue = num.intValue();
                            ki7 ki7Var = (ki7) ((List) mjgVar.getValue()).get(iIntValue);
                            rvcVar = kefVar.c;
                            fvi fviVar = kefVar.b;
                            ArrayList arrayList = new ArrayList((Collection) mjgVar.getValue());
                            rvcVar2 = kefVar.c;
                            hb9Var = kefVar.a;
                            if (rvcVar2 != null) {
                                uri = rvcVar2.e;
                            } else {
                                uri = null;
                            }
                            i = hb9Var.e;
                            Uri uri3 = ki7Var.l;
                            if (rvc.b(hb9Var, rvcVar)) {
                                uriA = rvc.a(hb9Var, rvcVar);
                                if (uriA != null || (path = uriA.getPath()) == null || path.equals(hb9Var.c)) {
                                    i2 = 0;
                                } else {
                                    i2 = 0;
                                    uri2 = uriA;
                                }
                                arrayList.set(iIntValue, ki7.b(ki7Var, rvcVar, fviVar, uri, 0, false, i2, uri2, 2503));
                                mjgVar.getClass();
                                mjgVar.j(null, arrayList);
                                ej7Var.e.B(srh.a(ej7Var.w));
                            } else {
                                i2 = i;
                            }
                            uri2 = uri3;
                            arrayList.set(iIntValue, ki7.b(ki7Var, rvcVar, fviVar, uri, 0, false, i2, uri2, 2503));
                            mjgVar.getClass();
                            mjgVar.j(null, arrayList);
                            ej7Var.e.B(srh.a(ej7Var.w));
                        }
                        return sbiVar;
                    }
                    i6++;
                }
                num = new Integer(i3);
                if (num.intValue() < 0) {
                    num = null;
                }
                if (num != null) {
                    int iIntValue2 = num.intValue();
                    ki7 ki7Var2 = (ki7) ((List) mjgVar.getValue()).get(iIntValue2);
                    rvcVar = kefVar.c;
                    fvi fviVar2 = kefVar.b;
                    ArrayList arrayList2 = new ArrayList((Collection) mjgVar.getValue());
                    rvcVar2 = kefVar.c;
                    hb9Var = kefVar.a;
                    if (rvcVar2 != null) {
                        uri = rvcVar2.e;
                    } else {
                        uri = null;
                    }
                    i = hb9Var.e;
                    Uri uri4 = ki7Var2.l;
                    if (rvc.b(hb9Var, rvcVar)) {
                        uriA = rvc.a(hb9Var, rvcVar);
                        if (uriA != null) {
                        }
                        i2 = 0;
                    } else {
                        i2 = i;
                    }
                    uri2 = uri4;
                    arrayList2.set(iIntValue2, ki7.b(ki7Var2, rvcVar, fviVar2, uri, 0, false, i2, uri2, 2503));
                    mjgVar.getClass();
                    mjgVar.j(null, arrayList2);
                    ej7Var.e.B(srh.a(ej7Var.w));
                }
                return sbiVar;
            case 8:
                Layout layout = (Layout) this.f;
                ch3.d0(obj);
                sbd sbdVar = ao7.c;
                Picture picture = (Picture) sbdVar.a();
                if (picture == null) {
                    picture = new Picture();
                }
                try {
                    try {
                        layout.draw(picture.beginRecording(layout.getWidth(), layout.getHeight()));
                        picture.endRecording();
                        sbdVar.d(picture);
                    } catch (Throwable th2) {
                        picture.endRecording();
                        throw th2;
                    }
                } catch (Throwable th3) {
                    gm0.V(((ao7) this.g).b, "fail to warm layout", th3);
                }
                return sbi.a;
            case 9:
                sbi sbiVar2 = sbi.a;
                ch3.d0(obj);
                String str2 = (String) this.f;
                boolean zK0 = z5h.K0(str2, "Custom", false);
                b08 b08Var = (b08) this.g;
                ny8 ny8Var = b08Var.e;
                ic6 ic6Var = b08Var.i;
                if (zK0) {
                    a8j.x(ic6Var, new yz7(b08Var.f.getString("Custom", "")));
                } else {
                    boolean zB = ((svb) ny8Var.getValue()).b();
                    b08Var.B().a();
                    xb9 xb9Var = b08Var.B().a;
                    xb9Var.o0.B(xb9Var, xb9.g1[3], str2);
                    b08Var.B().a.m0("443");
                    b08Var.h.setValue(b08Var.C());
                    if (zB) {
                        a8j.x(ic6Var, zz7.a);
                        ((svb) ny8Var.getValue()).d(true);
                    }
                    a8j.x(ic6Var, xz7.a);
                }
                return sbiVar2;
            case 10:
                ImageDownloaderImpl imageDownloaderImpl = (ImageDownloaderImpl) this.g;
                String str3 = (String) this.f;
                ch3.d0(obj);
                try {
                    if (r5h.X0(str3)) {
                        throw new IllegalArgumentException("You have to provide a valid URL");
                    }
                    URLConnection uRLConnectionOpenConnection = new URL(str3).openConnection();
                    if (uRLConnectionOpenConnection.getContentLength() <= PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) {
                        return BitmapFactory.decodeStream(uRLConnectionOpenConnection.getInputStream());
                    }
                    Logger.DefaultImpls.warn$default(ImageDownloaderImpl.access$getLogger(imageDownloaderImpl), "Image size exceeds 1048576 bytes", null, 2, null);
                    return null;
                } catch (Exception e2) {
                    ImageDownloaderImpl.access$getLogger(imageDownloaderImpl).error("Could not download image", e2);
                    return null;
                }
            case 11:
                ch3.d0(obj);
                mh7 mh7Var = (mh7) this.f;
                if (cqk.d(mh7Var, jh7.a)) {
                    return new Integer(-1);
                }
                List<gh7> listD = mh7Var.d();
                rb8 rb8Var = (rb8) this.g;
                int i7 = 0;
                for (gh7 gh7Var : listD) {
                    Cursor cursorQuery = rb8Var.e.query(gh7Var.j(), new String[]{gh7Var.f()}, mh7Var.e(gh7Var), mh7Var.a(gh7Var), null);
                    if (cursorQuery != null) {
                        try {
                            count = cursorQuery.getCount();
                            cursorQuery.close();
                        } catch (Throwable th4) {
                            try {
                                throw th4;
                            } catch (Throwable th5) {
                                rx8.n(cursorQuery, th4);
                                throw th5;
                            }
                        }
                    } else {
                        count = 0;
                    }
                    i7 += count;
                }
                return new Integer(i7);
            case 12:
                me8 me8Var = (me8) this.f;
                ch3.d0(obj);
                bf8 bf8Var = (bf8) this.g;
                int i8 = bf8.s;
                je9 je9Var = je9.d;
                if (me8Var instanceof ke8) {
                    String str4 = bf8Var.o;
                    a4c a4cVar = gm0.f;
                    if (a4cVar != null && a4cVar.b(je9Var)) {
                        a4cVar.c(je9Var, str4, zo5.m(((ke8) me8Var).b, "Informer update file download with success, file:"), null);
                    }
                    bf8Var.q.updateAndGet(new ea1(6, me8Var));
                    mjg mjgVar2 = bf8Var.h;
                    do {
                        value2 = mjgVar2.getValue();
                        objA2 = (if8) value2;
                        gf8 gf8Var = objA2 instanceof gf8 ? (gf8) objA2 : null;
                        if (gf8Var != null) {
                            objA2 = gf8.a(gf8Var, null, null, null, null, 2, 511);
                        }
                    } while (!mjgVar2.h(value2, objA2));
                } else {
                    if (!(me8Var instanceof le8) && !(me8Var instanceof je8)) {
                        ore.o();
                        return null;
                    }
                    String str5 = bf8Var.o;
                    a4c a4cVar2 = gm0.f;
                    if (a4cVar2 != null && a4cVar2.b(je9Var)) {
                        a4cVar2.c(je9Var, str5, "Informer update file download with fail", null);
                    }
                    mjg mjgVar3 = bf8Var.h;
                    do {
                        value = mjgVar3.getValue();
                        objA = (if8) value;
                        gf8 gf8Var2 = objA instanceof gf8 ? (gf8) objA : null;
                        if (gf8Var2 != null) {
                            objA = gf8.a(gf8Var2, null, null, null, null, 0, 511);
                        }
                    } while (!mjgVar3.h(value, objA));
                    bf8Var.q.set(null);
                    sgg sggVar = bf8Var.r;
                    if (sggVar != null) {
                        sggVar.b(null);
                    }
                }
                return sbi.a;
            case 13:
                ch3.d0(obj);
                String str6 = (String) this.f;
                bf8 bf8Var2 = (bf8) this.g;
                String string = bf8Var2.n.getString(R.string.informer_self_update_notif_title);
                wjh wjhVar = new wjh(7777L, str6, "MAX.apk", string);
                wp6 wp6Var = (wp6) bf8Var2.p.getValue();
                xyj xyjVar = (xyj) wp6Var.n.getValue();
                ha9 ha9Var = wp6Var.k;
                gm0.m("workers:DownloadFileWorker", "start %s", wjhVar);
                String strA = ha9Var.a("workers:DownloadFileWorker/" + wjhVar, null);
                cdc cdcVar = (cdc) ((a) ((a) ((a) ((a) new a(DownloadFileWorker.class).setExpedited(yic.a)).setBackoffCriteria(rn0.b, 10000L, TimeUnit.MILLISECONDS)).addTag("workers:DownloadFileWorker")).setInputData(f55.t(ha9Var, new ylc("taskName", strA), new ylc("requestId", 7777L), new ylc("fileName", "MAX.apk"), new ylc("fileUrl", str6), new ylc("notifTitle", string)))).build();
                ve6 ve6Var = ve6.b;
                a8g a8gVar = xyj.l;
                n19 n19VarB = xyjVar.b(strA, ve6Var, cdcVar);
                n19VarB.N();
                iyl.a(n19VarB.o.O());
                return sbi.a;
            case 14:
                ch3.d0(obj);
                oj8 oj8Var = ((IntegrityLogsViewerScreen) this.f).c;
                String str7 = (String) this.g;
                ArrayList arrayList3 = oj8Var.d;
                SpannableString spannableString = new SpannableString(str7);
                Matcher matcher = oj8Var.e.matcher(str7);
                while (matcher.find()) {
                    int iStart = matcher.start();
                    int iEnd = matcher.end();
                    spannableString.setSpan(new StyleSpan(1), iStart, iEnd, 33);
                    spannableString.setSpan(new h5h(1), iStart, iEnd, 33);
                }
                arrayList3.add(spannableString);
                oj8Var.a.e(arrayList3.size() - 1, 1);
                return sbi.a;
            case 15:
                gh8 gh8Var = (gh8) this.f;
                ch3.d0(obj);
                if (cqk.d(gh8Var, gh8.a)) {
                    a8j.x(((gm8) this.g).l, yl8.a);
                    return sbi.a;
                }
                ore.o();
                return null;
            case 16:
                ch3.d0(obj);
                InviteFriendsToMaxBottomSheet inviteFriendsToMaxBottomSheet = (InviteFriendsToMaxBottomSheet) this.g;
                ari ariVar = (ari) inviteFriendsToMaxBottomSheet.y.getValue();
                int i9 = inviteFriendsToMaxBottomSheet.z;
                Context context = inviteFriendsToMaxBottomSheet.getContext();
                g5d g5dVar = (g5d) ((gjf) inviteFriendsToMaxBottomSheet.w.getValue());
                String str8 = String.format(context.getString(R.string.tt_sms_invite_text), Arrays.copyOf(new Object[]{g5dVar.b()}, 1));
                ariVar.getClass();
                CharSequence charSequenceA = ari.a(i9, str8);
                CharSequence charSequence = charSequenceA != null ? charSequenceA : "";
                it3.a(inviteFriendsToMaxBottomSheet.getContext(), charSequence.toString());
                try {
                    szd szdVar = (szd) ((mm8) inviteFriendsToMaxBottomSheet.A.getValue()).i.a.getValue();
                    poeVar2 = szdVar != null ? szdVar.a : null;
                    break;
                } catch (Throwable th6) {
                    poeVar2 = new poe(th6);
                }
                Uri uri5 = (Uri) (poeVar2 instanceof poe ? null : poeVar2);
                if (uri5 != null) {
                    dp4.c(uri5);
                }
                String str9 = sj8.a;
                sj8.j(inviteFriendsToMaxBottomSheet.getContext(), charSequence, uri5);
                ((sm8) inviteFriendsToMaxBottomSheet.x.getValue()).a("clicked_to_invite", "main", "trigger_max");
                s7f s7fVar = (s7f) ((et3) inviteFriendsToMaxBottomSheet.v.getValue());
                s7fVar.I.B(s7fVar, s7f.j0[31], Boolean.TRUE);
                inviteFriendsToMaxBottomSheet.v1(true);
                return sbi.a;
            case 17:
                List list2 = (List) this.f;
                ch3.d0(obj);
                qt4.C(list2 != null, ((sr8) this.g).j, null);
                return sbi.a;
            case 18:
                rt2 rt2Var = (rt2) this.f;
                ch3.d0(obj);
                vr8 vr8Var = (vr8) this.g;
                String strS = rt2Var.s(us0.c, rs0.a);
                long jQ = rt2Var.q();
                rt2Var.L0();
                String string2 = rt2Var.m.toString();
                nx2 nx2Var = rt2Var.b;
                zw2 zw2Var = nx2Var.I;
                boolean z = zw2Var != null ? zw2Var.l : false;
                long j = nx2Var.R;
                Long lValueOf = j > 0 ? Long.valueOf(j) : null;
                mjg mjgVar4 = vr8Var.f;
                vp8 vp8Var = new vp8(rt2Var.F(), rt2Var.d0(), rt2Var.v(), rt2Var.b.b(), strS, Long.valueOf(jQ), string2, z, lValueOf);
                mjgVar4.getClass();
                mjgVar4.j(null, vp8Var);
                return sbi.a;
            case 19:
                List list3 = (List) this.f;
                ch3.d0(obj);
                gm0.n("ib9", "albums loaded");
                List list4 = list3;
                int iP0 = wm9.P0(yw3.W0(list4, 10));
                if (iP0 < 16) {
                    iP0 = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iP0);
                for (Object obj3 : list4) {
                    linkedHashMap.put(((nh7) obj3).a.b(), obj3);
                }
                return sbi.a;
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                Object obj4 = this.f;
                ch3.d0(obj);
                ((LocaleBottomSheet) this.g).y.H((List) obj4);
                return sbi.a;
            case 21:
                sbi sbiVar3 = sbi.a;
                we9 we9Var = (we9) this.g;
                gu4 gu4Var = (gu4) this.f;
                ch3.d0(obj);
                try {
                    we9Var.d = Runtime.getRuntime().exec(new String[]{"", "-v", "tag", "-T", new SimpleDateFormat("MM-dd HH:mm:ss.SSS", Locale.US).format(new Date())});
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(we9Var.d.getInputStream()));
                    while (cqk.x(gu4Var)) {
                        try {
                            String line = bufferedReader.readLine();
                            if (line != null) {
                                we9Var.c.invoke(line);
                            }
                        } catch (IOException e3) {
                            gm0.V(gu4Var.getClass().getName(), "Ошибка чтения logcat", e3);
                        }
                    }
                } catch (IOException e4) {
                    gm0.V(gu4Var.getClass().getName(), "Ошибка инициализации чтения logcat", e4);
                }
                return sbiVar3;
            case 22:
                File file = (File) this.f;
                ch3.d0(obj);
                return new q0d(new bye(new mhh(new h6f(file.getAbsolutePath()), null)), ((CharSequence) this.g).toString(), 27);
            case 23:
                ch3.d0(obj);
                List list5 = (List) this.g;
                kmf kmfVar = new kmf();
                Iterator it2 = list5.iterator();
                while (it2.hasNext()) {
                    kmfVar.a(((cli) it2.next()).s);
                }
                return Boolean.valueOf(((Number) kmfVar.b().g.a().getUpper()).intValue() > 30);
            case 24:
                jef jefVar = (jef) this.g;
                ch3.d0(obj);
                as9 as9Var = (as9) this.f;
                zv8[] zv8VarArr2 = as9.I;
                ib9 ib9VarC = as9Var.C();
                ib9VarC.getClass();
                ief iefVar = ib9VarC.a;
                iefVar.getClass();
                ArrayList arrayList4 = new ArrayList();
                for (kef kefVar2 : iefVar.a) {
                    kefVar2.getClass();
                    arrayList4.add(kefVar2.a);
                }
                Iterator it3 = arrayList4.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        i5 = -1;
                    } else if (((hb9) it3.next()).b != jefVar.a.a) {
                        i5++;
                    }
                }
                if (i5 != -1) {
                    as9Var.s.c(new rff(jefVar, i5));
                    as9Var.r.c(new yq9(jefVar, i5));
                }
                return sbi.a;
            case 25:
                Object obj5 = this.f;
                ch3.d0(obj);
                ((wd2) this.g).setVisibility(((Boolean) obj5).booleanValue() ? 0 : 8);
                return sbi.a;
            case 26:
                ch3.d0(obj);
                Long l = (Long) ((xv9) this.f).d.c((Uri) this.g);
                if (l == null || l.longValue() == -1) {
                    return null;
                }
                return l;
            case 27:
                ch3.d0(obj);
                MediaEditScreen mediaEditScreen = (MediaEditScreen) this.f;
                qw9 qw9Var = (qw9) this.g;
                if (mediaEditScreen.getView() != null) {
                    zv8[] zv8VarArr3 = MediaEditScreen.w1;
                    mediaEditScreen.G1().h(qw9Var.b, false);
                }
                return sbi.a;
            case 28:
                Object obj6 = this.f;
                ch3.d0(obj);
                ((npb) this.g).setNumber(((Number) obj6).intValue());
                return sbi.a;
            default:
                je9 je9Var2 = je9.f;
                sbi sbiVar4 = sbi.a;
                ch3.d0(obj);
                rw9 rw9Var = (rw9) ((lx9) this.f).u.a.getValue();
                if (rw9Var instanceof qw9) {
                    List list6 = ((qw9) rw9Var).a;
                    jef jefVar2 = (jef) this.g;
                    Iterator it4 = list6.iterator();
                    while (true) {
                        if (!it4.hasNext()) {
                            i4 = -1;
                        } else if (((kb9) it4.next()).a != jefVar2.a.a) {
                            i4++;
                        }
                    }
                    lx9 lx9Var = (lx9) this.f;
                    if (i4 == -1) {
                        String str10 = lx9Var.d;
                        jef jefVar3 = (jef) this.g;
                        a4c a4cVar3 = gm0.f;
                        if (a4cVar3 != null && a4cVar3.b(je9Var2)) {
                            a4cVar3.c(je9Var2, str10, zo5.j(jefVar3.a.a, "onMediaClick: no media exist with id: "), null);
                        }
                    } else {
                        hb9 hb9VarG = lx9Var.G();
                        if (hb9VarG != null) {
                            long j2 = hb9VarG.b;
                            jef jefVar4 = (jef) this.g;
                            if (j2 == jefVar4.a.a) {
                                String str11 = ((lx9) this.f).d;
                                a4c a4cVar4 = gm0.f;
                                if (a4cVar4 != null) {
                                    je9 je9Var3 = je9.d;
                                    if (a4cVar4.b(je9Var3)) {
                                        a4cVar4.c(je9Var3, str11, zo5.j(jefVar4.a.a, "Clicked on same media as current with id: "), null);
                                    }
                                }
                            } else {
                                a8j.x(((lx9) this.f).n1, new mb6(i4));
                            }
                        } else {
                            a8j.x(((lx9) this.f).n1, new mb6(i4));
                        }
                    }
                } else {
                    String str12 = ((lx9) this.f).d;
                    jef jefVar5 = (jef) this.g;
                    a4c a4cVar5 = gm0.f;
                    if (a4cVar5 != null && a4cVar5.b(je9Var2)) {
                        a4cVar5.c(je9Var2, str12, "onMediaClick: id " + jefVar5.a.a + ", state is " + rw9Var + ", cannot click", null);
                    }
                }
                return sbiVar4;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ el6(Object obj, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ el6(lq4 lq4Var, Object obj, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = obj;
    }
}
