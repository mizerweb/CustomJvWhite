package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.net.Uri;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import one.me.android.root.RootController;
import one.me.calls.ui.bottomsheet.raisehand.RaiseHandActionBottomSheet;
import one.me.chatscreen.search.SearchMessageBottomWidget;
import one.me.devmenu.tools.server.ServerHostBottomSheet;
import one.me.login.restrict.RestrictLoginScreen;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.bottomsheet.ConfirmationBottomSheet;
import one.me.sdk.gallery.selectalbum.SelectAlbumWidget;
import one.me.sdk.phoneutils.countriesdialog.SelectCountryBottomSheet;
import one.me.settings.battery.ui.SettingsBatteryScreen;
import one.me.settings.media.SettingsMediaScreen;
import one.me.settings.media.autosave.SettingsAutoSaveScreen;
import one.me.settings.ringtone.ui.SettingRingtoneScreen;
import one.me.settings.storage.ui.SettingsStorageScreen;
import one.me.sharedata.ShareDataPickerScreen;
import org.apache.http.conn.params.ConnManagerParams;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final class dtd extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dtd(Object obj, Object obj2, lq4 lq4Var, int i) {
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
                dtd dtdVar = new dtd((jtd) obj2, lq4Var, 0);
                dtdVar.f = obj;
                return dtdVar;
            case 1:
                dtd dtdVar2 = new dtd((yfj) obj2, lq4Var, 1);
                dtdVar2.f = obj;
                return dtdVar2;
            case 2:
                return new dtd((dvd) this.f, (c39) obj2, lq4Var, 2);
            case 3:
                return new dtd((dvd) this.f, (RectF) obj2, lq4Var, 3);
            case 4:
                dtd dtdVar3 = new dtd((js8) obj2, lq4Var, 4);
                dtdVar3.f = obj;
                return dtdVar3;
            case 5:
                dtd dtdVar4 = new dtd((RaiseHandActionBottomSheet) obj2, lq4Var, 5);
                dtdVar4.f = obj;
                return dtdVar4;
            case 6:
                dtd dtdVar5 = new dtd((c8e) obj2, lq4Var, 6);
                dtdVar5.f = obj;
                return dtdVar5;
            case 7:
                dtd dtdVar6 = new dtd((jce) obj2, lq4Var, 7);
                dtdVar6.f = obj;
                return dtdVar6;
            case 8:
                return new dtd((Bitmap) this.f, (kje) obj2, lq4Var, 8);
            case 9:
                return new dtd((kje) this.f, (String) obj2, lq4Var, 9);
            case 10:
                dtd dtdVar7 = new dtd((z18) obj2, lq4Var, 10);
                dtdVar7.f = obj;
                return dtdVar7;
            case 11:
                dtd dtdVar8 = new dtd(lq4Var, (RestrictLoginScreen) obj2, 11);
                dtdVar8.f = obj;
                return dtdVar8;
            case 12:
                return new dtd((wze) this.f, (byte[]) obj2, lq4Var, 12);
            case 13:
                return new dtd((File) this.f, (k0f) obj2, lq4Var, 13);
            case 14:
                dtd dtdVar9 = new dtd((SearchMessageBottomWidget) obj2, lq4Var, 14);
                dtdVar9.f = obj;
                return dtdVar9;
            case 15:
                dtd dtdVar10 = new dtd(lq4Var, (aef) obj2, 15);
                dtdVar10.f = obj;
                return dtdVar10;
            case 16:
                dtd dtdVar11 = new dtd(lq4Var, (SelectAlbumWidget) obj2, 16);
                dtdVar11.f = obj;
                return dtdVar11;
            case 17:
                dtd dtdVar12 = new dtd((SelectCountryBottomSheet) obj2, lq4Var, 17);
                dtdVar12.f = obj;
                return dtdVar12;
            case 18:
                dtd dtdVar13 = new dtd(lq4Var, (ServerHostBottomSheet) obj2, 18);
                dtdVar13.f = obj;
                return dtdVar13;
            case 19:
                return new dtd((bpf) this.f, (RectF) obj2, lq4Var, 19);
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                dtd dtdVar14 = new dtd(lq4Var, (SettingRingtoneScreen) obj2, 20);
                dtdVar14.f = obj;
                return dtdVar14;
            case 21:
                dtd dtdVar15 = new dtd(lq4Var, (SettingsAutoSaveScreen) obj2, 21);
                dtdVar15.f = obj;
                return dtdVar15;
            case 22:
                dtd dtdVar16 = new dtd(lq4Var, (SettingsBatteryScreen) obj2, 22);
                dtdVar16.f = obj;
                return dtdVar16;
            case 23:
                dtd dtdVar17 = new dtd((qrf) obj2, lq4Var, 23);
                dtdVar17.f = obj;
                return dtdVar17;
            case 24:
                dtd dtdVar18 = new dtd(lq4Var, (SettingsMediaScreen) obj2, 24);
                dtdVar18.f = obj;
                return dtdVar18;
            case 25:
                dtd dtdVar19 = new dtd(lq4Var, (SettingsStorageScreen) obj2, 25);
                dtdVar19.f = obj;
                return dtdVar19;
            case 26:
                return new dtd((String) this.f, (nwf) obj2, lq4Var, 26);
            case 27:
                return new dtd((String) this.f, (vxf) obj2, lq4Var, 27);
            case 28:
                dtd dtdVar20 = new dtd(lq4Var, (ShareDataPickerScreen) obj2, 28);
                dtdVar20.f = obj;
                return dtdVar20;
            default:
                return new dtd((String) this.f, (m7g) obj2, lq4Var, 29);
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        int i = this.e;
        sbi sbiVar = sbi.a;
        switch (i) {
            case 0:
                ((dtd) create((rt2) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 1:
                ((dtd) create((vg4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 2:
                ((dtd) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 3:
                ((dtd) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 4:
                ((dtd) create(obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 5:
                ((dtd) create((g4e) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 6:
                ((dtd) create((rt2) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 7:
                ((dtd) create((dce) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 8:
                ((dtd) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 9:
                return ((dtd) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 10:
                ((dtd) create((rt2) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 11:
                ((dtd) create(obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 12:
                return ((dtd) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 13:
                return ((dtd) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 14:
                ((dtd) create((i65) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 15:
                ((dtd) create(obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 16:
                ((dtd) create(obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 17:
                ((dtd) create((List) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 18:
                ((dtd) create(obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 19:
                ((dtd) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                ((dtd) create(obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 21:
                ((dtd) create(obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 22:
                ((dtd) create(obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 23:
                ((dtd) create((ppf) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 24:
                ((dtd) create(obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 25:
                ((dtd) create(obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 26:
                ((dtd) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 27:
                return ((dtd) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 28:
                ((dtd) create(obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            default:
                ((dtd) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
        }
    }

    /* JADX WARN: Code duplicated, block: B:160:0x0492  */
    /* JADX WARN: Code duplicated, block: B:21:0x0089  */
    /* JADX WARN: Code duplicated, block: B:23:0x008f  */
    /* JADX WARN: Code duplicated, block: B:24:0x00be  */
    /* JADX WARN: Code duplicated, block: B:291:0x07b7  */
    /* JADX WARN: Code duplicated, block: B:328:0x0830  */
    /* JADX WARN: Code duplicated, block: B:451:0x049d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:454:0x048c A[SYNTHETIC] */
    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object value;
        Object value2;
        nx2 nx2Var;
        int i;
        int i2;
        Matrix matrix;
        Bitmap bitmapDecodeByteArray;
        int iA0;
        String str;
        ArrayList arrayList;
        Long l;
        g8c g8cVar = null;
        Object obj2 = null;
        Object obj3 = null;
        switch (this.e) {
            case 0:
                rt2 rt2Var = (rt2) this.f;
                ch3.d0(obj);
                if (!rt2Var.z0() || !rt2Var.W()) {
                    a8j.x(((jtd) this.g).l, wsd.a);
                }
                return sbi.a;
            case 1:
                vg4 vg4Var = (vg4) this.f;
                ch3.d0(obj);
                String strZ = vg4Var != null ? vg4Var.z(us0.c) : null;
                CharSequence charSequenceU = vg4Var != null ? vg4Var.u() : null;
                Object w1dVar = (strZ == null || strZ.length() == 0) ? (charSequenceU == null || ((String) charSequenceU).length() == 0) ? x1d.a : new w1d(charSequenceU, vg4Var != null ? vg4Var.v() : 0L) : new z1d(strZ);
                mjg mjgVar = (mjg) ((yfj) this.g).d;
                mjgVar.getClass();
                mjgVar.j(null, w1dVar);
                return sbi.a;
            case 2:
                ch3.d0(obj);
                dvd dvdVar = (dvd) this.f;
                xu1 xu1Var = dvdVar.e;
                c39 c39Var = (c39) this.g;
                xu1Var.k(c39Var.a, true, false, false, new k9d(dvdVar, 15, c39Var));
                return sbi.a;
            case 3:
                ch3.d0(obj);
                dvd dvdVar2 = (dvd) this.f;
                zv8[] zv8VarArr = dvd.u1;
                dvdVar2.J(((ju6) dvdVar2.r.getValue()).t((String) dvdVar2.q1.get()).getAbsolutePath(), (RectF) this.g);
                return sbi.a;
            case 4:
                ch3.d0(obj);
                Object obj4 = this.f;
                js8 js8Var = (js8) this.g;
                zv zvVar = (zv) js8Var.e;
                zvVar.addLast(obj4);
                p41 p41Var = (p41) js8Var.f;
                for (Object objH = p41Var.h(); !(objH instanceof cs2); objH = p41Var.h()) {
                    ds2.b(objH);
                    zvVar.addLast(objH);
                }
                Log.d("CXCP", "PruningProcessingQueue: Pruning " + zvVar);
                ((cf7) js8Var.a).invoke(zvVar);
                return sbi.a;
            case 5:
                g4e g4eVar = (g4e) this.f;
                ch3.d0(obj);
                RaiseHandActionBottomSheet raiseHandActionBottomSheet = (RaiseHandActionBottomSheet) this.g;
                j8e j8eVar = raiseHandActionBottomSheet.x;
                j8e j8eVar2 = raiseHandActionBottomSheet.w;
                zv8[] zv8VarArr2 = RaiseHandActionBottomSheet.y;
                ((TextView) j8eVar2.m(raiseHandActionBottomSheet, zv8VarArr2[0])).setText(g4eVar.a.b(raiseHandActionBottomSheet.getContext()));
                ynh ynhVar = g4eVar.b;
                if (ynhVar != null) {
                    ((TextView) j8eVar.m(raiseHandActionBottomSheet, zv8VarArr2[1])).setText(ynhVar.b(raiseHandActionBottomSheet.getContext()));
                }
                ((TextView) j8eVar.m(raiseHandActionBottomSheet, zv8VarArr2[1])).setVisibility(ynhVar != null ? 0 : 4);
                return sbi.a;
            case 6:
                rt2 rt2Var2 = (rt2) this.f;
                ch3.d0(obj);
                a8e a8eVarB = ((c8e) this.g).B();
                long j = rt2Var2.b.j0;
                a8eVarB.getClass();
                return sbi.a;
            case 7:
                dce dceVar = (dce) this.f;
                ch3.d0(obj);
                jce jceVar = (jce) this.g;
                qbe qbeVar = jceVar.d;
                qbeVar.B((dceVar instanceof bce) || (dceVar instanceof zbe) || (dceVar instanceof ybe));
                boolean zN = jceVar.N();
                mjg mjgVar2 = qbeVar.i;
                do {
                    value = mjgVar2.getValue();
                    ((Boolean) value).getClass();
                } while (!mjgVar2.h(value, Boolean.valueOf(zN)));
                if (jceVar.c == fbe.a) {
                    boolean z = !(dceVar instanceof cce);
                    mjg mjgVar3 = qbeVar.k;
                    do {
                        value2 = mjgVar3.getValue();
                        ((Boolean) value2).getClass();
                    } while (!mjgVar3.h(value2, Boolean.valueOf(z)));
                }
                return sbi.a;
            case 8:
                ch3.d0(obj);
                Bitmap bitmap = (Bitmap) this.f;
                int width = bitmap.getWidth();
                int height = bitmap.getHeight();
                int i3 = width * height;
                int[] iArr = new int[i3];
                ((Bitmap) this.f).getPixels(iArr, 0, width, 0, 0, width, height);
                int iNanoTime = (int) System.nanoTime();
                int[] iArr2 = ((kje) this.g).f;
                int length = iArr2.length;
                for (int i4 = 0; i4 < i3; i4++) {
                    int i5 = iArr[i4];
                    int i6 = (i5 >> 24) & 255;
                    if (i6 != 0) {
                        iNanoTime = (iNanoTime << 5) ^ (((iNanoTime << 13) ^ iNanoTime) ^ (iNanoTime >>> 17));
                        iArr[i4] = Color.argb(i6, oc9.v(((i5 >>> 16) & 255) + iArr2[(iNanoTime & Integer.MAX_VALUE) % length], 0, 255), oc9.v(((i5 >>> 8) & 255) + iArr2[((iNanoTime >>> 5) & Integer.MAX_VALUE) % length], 0, 255), oc9.v((i5 & 255) + iArr2[(Integer.MAX_VALUE & (iNanoTime >>> 10)) % length], 0, 255));
                    }
                }
                ((Bitmap) this.f).setPixels(iArr, 0, width, 0, 0, width, height);
                return sbi.a;
            case 9:
                ch3.d0(obj);
                File fileS = ((ju6) ((rs6) ((kje) this.f).c.getValue())).s((String) this.g, "jpg");
                if (ku6.p(fileS.getAbsolutePath())) {
                    return fileS;
                }
                return null;
            case 10:
                rt2 rt2Var3 = (rt2) this.f;
                ch3.d0(obj);
                if (rt2Var3 != null && (nx2Var = rt2Var3.b) != null && (nx2Var.q0 & 1) == 0) {
                    mjg mjgVar4 = (mjg) ((z18) this.g).f;
                    ((qke) mjgVar4.getValue()).getClass();
                    qke qkeVar = new qke(false);
                    mjgVar4.getClass();
                    mjgVar4.j(null, qkeVar);
                }
                return sbi.a;
            case 11:
                Object obj5 = this.f;
                ch3.d0(obj);
                rbb rbbVar = (rbb) obj5;
                if (rbbVar instanceof boe) {
                    ((bk8) ((RestrictLoginScreen) this.g).c.getValue()).a((2 & 1) != 0, false);
                    sb8.O(((RestrictLoginScreen) this.g).getContext(), ((boe) rbbVar).b);
                } else if (rbbVar instanceof aoe) {
                    ((bk8) ((RestrictLoginScreen) this.g).c.getValue()).a(false, true);
                } else {
                    a4c a4cVar = gm0.f;
                    if (a4cVar != null) {
                        je9 je9Var = je9.e;
                        if (a4cVar.b(je9Var)) {
                            a4cVar.c(je9Var, "RestrictLoginScreen", "Ignore nav event: " + rbbVar, null);
                        }
                    }
                }
                return sbi.a;
            case 12:
                ch3.d0(obj);
                wze wzeVar = (wze) this.f;
                v3f v3fVar = (v3f) wzeVar.b;
                v3f v3fVar2 = (v3f) wzeVar.b;
                lz8 lz8VarE = v3fVar.e();
                byte[] bArr = (byte[]) this.g;
                lz8VarE.getClass();
                int i7 = sb8.j;
                int i8 = 0;
                while (true) {
                    if (i8 + 3 < bArr.length) {
                        int i9 = i8 + 1;
                        if ((bArr[i8] & 255) == 255) {
                            int i10 = bArr[i9] & 255;
                            if (i10 != 255) {
                                i9 = i8 + 2;
                                if (i10 != 216 && i10 != 1) {
                                    if (i10 != 217 && i10 != 218) {
                                        int iA1 = sb8.a0(bArr, i9, 2, false);
                                        if (iA1 >= 2 && (i9 = i9 + iA1) <= bArr.length) {
                                            if (i10 == 225 && iA1 >= 8 && sb8.a0(bArr, i8 + 4, 4, false) == 1165519206 && sb8.a0(bArr, i8 + 8, 2, false) == 0) {
                                                i8 += 10;
                                                i = iA1 - 8;
                                            }
                                        }
                                    }
                                    i2 = 0;
                                    matrix = new Matrix();
                                    matrix.setRotate(i2);
                                    bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
                                    if (bitmapDecodeByteArray.isMutable() || !matrix.isIdentity()) {
                                        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmapDecodeByteArray, 0, 0, bitmapDecodeByteArray.getWidth(), bitmapDecodeByteArray.getHeight(), matrix, true);
                                        bitmapDecodeByteArray.recycle();
                                        bitmapDecodeByteArray = bitmapCreateBitmap;
                                    }
                                    Uri uriB = v3fVar2.b(new my0(bitmapDecodeByteArray), v3fVar2.f(false));
                                    bitmapDecodeByteArray.recycle();
                                    return uriB;
                                }
                            }
                            i8 = i9;
                        }
                        i = 0;
                        i8 = i9;
                    } else {
                        i = 0;
                    }
                    if (i <= 8 || !((iA0 = sb8.a0(bArr, i8, 4, false)) == 1229531648 || iA0 == 1296891946)) {
                        i2 = 0;
                    } else {
                        boolean z2 = iA0 == 1229531648;
                        int iA2 = sb8.a0(bArr, i8 + 4, 4, z2) + 2;
                        if (iA2 < 10 || iA2 > i) {
                            i2 = 0;
                        } else {
                            int i11 = i8 + iA2;
                            int i12 = i - iA2;
                            int iA3 = sb8.a0(bArr, i11 - 2, 2, z2);
                            while (true) {
                                int i13 = iA3 - 1;
                                if (iA3 > 0 && i12 >= 12) {
                                    if (sb8.a0(bArr, i11, 2, z2) == 274) {
                                        int iA4 = sb8.a0(bArr, i11 + 8, 2, z2);
                                        if (iA4 == 3) {
                                            i2 = 180;
                                        } else if (iA4 == 6) {
                                            i2 = 90;
                                        } else if (iA4 == 8) {
                                            i2 = 270;
                                        }
                                    } else {
                                        i11 += 12;
                                        i12 -= 12;
                                        iA3 = i13;
                                    }
                                }
                                i2 = 0;
                            }
                        }
                    }
                    matrix = new Matrix();
                    matrix.setRotate(i2);
                    bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
                    if (bitmapDecodeByteArray.isMutable()) {
                        Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(bitmapDecodeByteArray, 0, 0, bitmapDecodeByteArray.getWidth(), bitmapDecodeByteArray.getHeight(), matrix, true);
                        bitmapDecodeByteArray.recycle();
                        bitmapDecodeByteArray = bitmapCreateBitmap2;
                    } else {
                        Bitmap bitmapCreateBitmap3 = Bitmap.createBitmap(bitmapDecodeByteArray, 0, 0, bitmapDecodeByteArray.getWidth(), bitmapDecodeByteArray.getHeight(), matrix, true);
                        bitmapDecodeByteArray.recycle();
                        bitmapDecodeByteArray = bitmapCreateBitmap3;
                    }
                    Uri uriB2 = v3fVar2.b(new my0(bitmapDecodeByteArray), v3fVar2.f(false));
                    bitmapDecodeByteArray.recycle();
                    return uriB2;
                }
            case 13:
                ch3.d0(obj);
                ljf ljfVar = new ljf((File) this.f, 14);
                v3f v3fVar3 = ((k0f) this.g).a;
                return v3fVar3.b(ljfVar, v3fVar3.d());
            case 14:
                i65 i65Var = (i65) this.f;
                ch3.d0(obj);
                z8f.b.e(i65Var);
                return sbi.a;
            case 15:
                Object obj6 = this.f;
                ch3.d0(obj);
                ((aef) this.g).H((List) obj6);
                return sbi.a;
            case 16:
                Object obj7 = this.f;
                ch3.d0(obj);
                if (((zcf) obj7) == null) {
                    ore.o();
                    return null;
                }
                SelectAlbumWidget selectAlbumWidget = (SelectAlbumWidget) this.g;
                zv8[] zv8VarArr3 = SelectAlbumWidget.f;
                selectAlbumWidget.p1().j(true);
                return sbi.a;
            case 17:
                List list = (List) this.f;
                ch3.d0(obj);
                SelectCountryBottomSheet selectCountryBottomSheet = (SelectCountryBottomSheet) this.g;
                wme wmeVar = selectCountryBottomSheet.r;
                selectCountryBottomSheet.q.I(list, new h7b(22, selectCountryBottomSheet));
                if ((list.isEmpty() || wmeVar.d()) && selectCountryBottomSheet.getView() != null) {
                    n7j.a((LinearLayout) selectCountryBottomSheet.p.m(selectCountryBottomSheet, SelectCountryBottomSheet.t[1]), (View) wmeVar.getValue(), -1);
                    ((View) wmeVar.getValue()).setVisibility(list.isEmpty() ? 0 : 8);
                }
                return sbi.a;
            case 18:
                Object obj8 = this.f;
                ch3.d0(obj);
                ((ServerHostBottomSheet) this.g).x.H((List) obj8);
                return sbi.a;
            case 19:
                ch3.d0(obj);
                bpf bpfVar = (bpf) this.f;
                zv8[] zv8VarArr4 = bpf.Y;
                bpfVar.F(((ju6) bpfVar.l.getValue()).t((String) bpfVar.F.get()).getAbsolutePath(), (RectF) this.g);
                return sbi.a;
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                SettingRingtoneScreen settingRingtoneScreen = (SettingRingtoneScreen) this.g;
                Object obj9 = this.f;
                ch3.d0(obj);
                rbb rbbVar2 = (rbb) obj9;
                if (rbbVar2 instanceof qvf) {
                    zv8[] zv8VarArr5 = SettingRingtoneScreen.i;
                    try {
                        String str2 = sj8.a;
                        Intent intent = new Intent("android.intent.action.GET_CONTENT");
                        intent.addCategory("android.intent.category.OPENABLE");
                        intent.setType("audio/*");
                        settingRingtoneScreen.startActivityForResult(intent, 998);
                    } catch (ActivityNotFoundException unused) {
                        h8c h8cVar = new h8c(settingRingtoneScreen);
                        h8cVar.n(settingRingtoneScreen.getContext().getString(R.string.no_app_found));
                        h8cVar.p();
                    }
                    break;
                } else if (rbbVar2 instanceof rvf) {
                    h8c h8cVar2 = new h8c(settingRingtoneScreen);
                    rvf rvfVar = (rvf) rbbVar2;
                    h8cVar2.m(rvfVar.b);
                    h8cVar2.h(new w8c(rvfVar.c));
                    h8cVar2.p();
                } else if (rbbVar2 instanceof i65) {
                    svf.b.e((i65) rbbVar2);
                }
                return sbi.a;
            case 21:
                Object obj10 = this.f;
                ch3.d0(obj);
                SettingsAutoSaveScreen settingsAutoSaveScreen = (SettingsAutoSaveScreen) this.g;
                zv8[] zv8VarArr6 = SettingsAutoSaveScreen.g;
                h8c h8cVar3 = new h8c(settingsAutoSaveScreen);
                h8cVar3.n(settingsAutoSaveScreen.getContext().getString(R.string.oneme_settings_media_autosave_video_disabled_snackbar_text));
                h8cVar3.j(new e9c(new tnh(R.string.go_to_forward)));
                h8cVar3.e(new ahc(16, settingsAutoSaveScreen));
                h8cVar3.p();
                return sbi.a;
            case 22:
                Object obj11 = this.f;
                ch3.d0(obj);
                rbb rbbVar3 = (rbb) obj11;
                if (rbbVar3 instanceof vqf) {
                    SettingsBatteryScreen settingsBatteryScreen = (SettingsBatteryScreen) this.g;
                    vqf vqfVar = (vqf) rbbVar3;
                    zv8[] zv8VarArr7 = SettingsBatteryScreen.g;
                    zv8[] zv8VarArr8 = BottomSheetWidget.t;
                    jc4 jc4VarA = mol.a(vqfVar.b, null, null, 4);
                    for (uqf uqfVar : vqfVar.c) {
                        uqfVar.getClass();
                        jc4VarA.d(uqfVar.b, uqfVar.a);
                    }
                    ConfirmationBottomSheet confirmationBottomSheetF = jc4VarA.f(settingsBatteryScreen);
                    confirmationBottomSheetF.setTargetController(settingsBatteryScreen);
                    br4 parentController = settingsBatteryScreen;
                    while (parentController.getParentController() != null) {
                        parentController = parentController.getParentController();
                    }
                    RootController rootController = parentController instanceof RootController ? (RootController) parentController : null;
                    hve hveVarU1 = rootController != null ? rootController.u1() : null;
                    if (hveVarU1 != null) {
                        lve lveVar = new lve(confirmationBottomSheetF, null, null, null, false, -1);
                        p.k(false, lveVar, true, "BottomSheetWidget");
                        hveVarU1.I(lveVar);
                    }
                }
                return sbi.a;
            case 23:
                qrf qrfVar = (qrf) this.g;
                ArrayList arrayList2 = qrfVar.o;
                ppf ppfVar = (ppf) this.f;
                ch3.d0(obj);
                if (ppfVar instanceof opf) {
                    fof fofVar = ((opf) ppfVar).a;
                    long j2 = fofVar.a;
                    Long l2 = qrfVar.l;
                    if (l2 != null && j2 == l2.longValue()) {
                        qrfVar.l = null;
                        List list2 = fofVar.b;
                        for (Object obj12 : list2) {
                            if (((dmf) obj12).e) {
                                obj3 = obj12;
                                qrfVar.n = (dmf) obj3;
                                arrayList = new ArrayList();
                                for (Object obj13 : list2) {
                                    if (!((dmf) obj13).e) {
                                        arrayList.add(obj13);
                                    }
                                }
                                arrayList2.addAll(ww3.M1(arrayList, new z70(6, new wf0(26))));
                                qrfVar.E();
                            }
                        }
                        qrfVar.n = (dmf) obj3;
                        arrayList = new ArrayList();
                        while (r0.hasNext()) {
                            if (!((dmf) obj13).e) {
                                arrayList.add(obj13);
                            }
                        }
                        arrayList2.addAll(ww3.M1(arrayList, new z70(6, new wf0(26))));
                        qrfVar.E();
                    }
                } else {
                    if (ppfVar instanceof lpf) {
                        throw null;
                    }
                    if (ppfVar instanceof npf) {
                        long j3 = ((npf) ppfVar).a.a;
                        Long l3 = qrfVar.m;
                        if (l3 != null && j3 == l3.longValue()) {
                            arrayList2.clear();
                            qrfVar.E();
                        }
                    } else {
                        if (!(ppfVar instanceof mpf)) {
                            ore.o();
                            return null;
                        }
                        mpf mpfVar = (mpf) ppfVar;
                        long j4 = mpfVar.a;
                        Long l4 = qrfVar.m;
                        if (l4 != null && j4 == l4.longValue()) {
                            qrfVar.m = null;
                            yhh yhhVar = mpfVar.b;
                            a8j.x(qrfVar.q, new bcg((yhhVar == null || (str = yhhVar.d) == null) ? new tnh(R.string.common_error_base_retry) : new xnh(str), R.drawable.icon_warning_fill, ynh.b, gm0.K(68.0f * yl5.d().getDisplayMetrics().density)));
                        } else {
                            Long l5 = qrfVar.l;
                            if (l5 != null && j4 == l5.longValue()) {
                                qrfVar.l = null;
                            }
                        }
                    }
                }
                return sbi.a;
            case 24:
                SettingsMediaScreen settingsMediaScreen = (SettingsMediaScreen) this.g;
                Object obj14 = this.f;
                ch3.d0(obj);
                rbb rbbVar4 = (rbb) obj14;
                if (rbbVar4 instanceof ytf) {
                    ytf ytfVar = (ytf) rbbVar4;
                    zv8[] zv8VarArr9 = SettingsMediaScreen.h;
                    zv8[] zv8VarArr10 = BottomSheetWidget.t;
                    jc4 jc4VarA2 = mol.a(ytfVar.b, null, null, 4);
                    for (xtf xtfVar : ytfVar.c) {
                        xtfVar.getClass();
                        jc4VarA2.d(xtfVar.b, xtfVar.a);
                    }
                    ConfirmationBottomSheet confirmationBottomSheetF2 = jc4VarA2.f(settingsMediaScreen);
                    confirmationBottomSheetF2.setTargetController(settingsMediaScreen);
                    br4 parentController2 = settingsMediaScreen;
                    while (parentController2.getParentController() != null) {
                        parentController2 = parentController2.getParentController();
                    }
                    RootController rootController2 = parentController2 instanceof RootController ? (RootController) parentController2 : null;
                    hve hveVarU2 = rootController2 != null ? rootController2.u1() : null;
                    if (hveVarU2 != null) {
                        lve lveVar2 = new lve(confirmationBottomSheetF2, null, null, null, false, -1);
                        p.k(false, lveVar2, true, "BottomSheetWidget");
                        hveVarU2.I(lveVar2);
                    }
                } else if (rbbVar4 instanceof i65) {
                    wtf.b.e((i65) rbbVar4);
                } else if (rbbVar4 instanceof ztf) {
                    svj.e(new svj(settingsMediaScreen, 1), R.string.oneme_settings_media_autosave_gallery_banner_title, new Integer(R.string.oneme_settings_media_autosave_banner_description), null, new isc(R.drawable.ic_gallery_avd, xw3.P0("_R_G_L_0_G_D_0_P_1", "_R_G_L_1_G_D_0_P_0"), Collections.singletonList("_R_G_L_0_G_D_0_P_0"), 500L), false, new Integer(R.string.oneme_settings_media_autosave_gallery_sheet_button), 16);
                } else if (rbbVar4 instanceof auf) {
                    svj svjVar = new svj(settingsMediaScreen, 1);
                    Integer num = new Integer(R.string.oneme_settings_media_autosave_storage_sheet_rationale);
                    String str3 = sj8.a;
                    Context context = settingsMediaScreen.getContext();
                    for (Object obj15 : xw3.P0(new Intent("android.settings.INTERNAL_STORAGE_SETTINGS"), new Intent("android.settings.MANAGE_APPLICATIONS_SETTINGS"))) {
                        if (((Intent) obj15).resolveActivity(context.getPackageManager()) != null) {
                            obj2 = obj15;
                            svj.e(svjVar, R.string.oneme_settings_media_autosave_storage_banner_title, num, (Intent) obj2, new isc(R.drawable.warning_fill_avd, Collections.singletonList("triangle"), xw3.P0("line", "dot"), 500L), false, new Integer(R.string.oneme_settings_media_autosave_storage_sheet_button), 16);
                        }
                    }
                    svj.e(svjVar, R.string.oneme_settings_media_autosave_storage_banner_title, num, (Intent) obj2, new isc(R.drawable.warning_fill_avd, Collections.singletonList("triangle"), xw3.P0("line", "dot"), 500L), false, new Integer(R.string.oneme_settings_media_autosave_storage_sheet_button), 16);
                }
                return sbi.a;
            case 25:
                SettingsStorageScreen settingsStorageScreen = (SettingsStorageScreen) this.g;
                Object obj16 = this.f;
                ch3.d0(obj);
                rbb rbbVar5 = (rbb) obj16;
                if (rbbVar5 instanceof fwf) {
                    fwf fwfVar = (fwf) rbbVar5;
                    zv8[] zv8VarArr11 = SettingsStorageScreen.g;
                    zv8[] zv8VarArr12 = BottomSheetWidget.t;
                    jc4 jc4VarA3 = mol.a(fwfVar.b, null, null, 4);
                    jc4VarA3.g(fwfVar.d);
                    for (ewf ewfVar : fwfVar.c) {
                        boolean z3 = ewfVar.c;
                        tnh tnhVar = ewfVar.b;
                        int i14 = ewfVar.a;
                        if (z3) {
                            jc4VarA3.b(i14, tnhVar);
                        } else {
                            jc4VarA3.d(i14, tnhVar);
                        }
                    }
                    ConfirmationBottomSheet confirmationBottomSheetF3 = jc4VarA3.f(settingsStorageScreen);
                    confirmationBottomSheetF3.setTargetController(settingsStorageScreen);
                    br4 parentController3 = settingsStorageScreen;
                    while (parentController3.getParentController() != null) {
                        parentController3 = parentController3.getParentController();
                    }
                    RootController rootController3 = parentController3 instanceof RootController ? (RootController) parentController3 : null;
                    hve hveVarU3 = rootController3 != null ? rootController3.u1() : null;
                    if (hveVarU3 != null) {
                        lve lveVar3 = new lve(confirmationBottomSheetF3, null, null, null, false, -1);
                        p.k(false, lveVar3, true, "BottomSheetWidget");
                        hveVarU3.I(lveVar3);
                    }
                } else if (rbbVar5 instanceof gwf) {
                    h8c h8cVar4 = new h8c(settingsStorageScreen);
                    h8cVar4.m(((gwf) rbbVar5).b);
                    h8cVar4.h(new w8c(R.drawable.icon_delete_fill));
                    h8cVar4.p();
                }
                return sbi.a;
            case 26:
                ch3.d0(obj);
                ifh ifhVar = a96.a;
                a8j.x(((nwf) this.g).f, a96.a((String) this.f));
                return sbi.a;
            case 27:
                ch3.d0(obj);
                String str4 = (String) this.f;
                if (!cqk.d(Uri.parse(str4).getScheme(), "content")) {
                    return str4;
                }
                String strC = ((h4c) ((c2a) ((vxf) this.g).n.getValue())).c(str4, null);
                if (strC == null) {
                    return null;
                }
                return Uri.fromFile(new File(strC)).toString();
            case 28:
                ShareDataPickerScreen shareDataPickerScreen = (ShareDataPickerScreen) this.g;
                Object obj17 = this.f;
                ch3.d0(obj);
                eyf eyfVar = (eyf) obj17;
                if (eyfVar instanceof xxf) {
                    String string = shareDataPickerScreen.getArgs().getString("tag");
                    if (string != null) {
                        Object objG = shareDataPickerScreen.getRouter().g(string);
                        oyf oyfVar = objG instanceof oyf ? (oyf) objG : null;
                        if (oyfVar != null) {
                            xxf xxfVar = (xxf) eyfVar;
                            oyfVar.x(xxfVar.c, xxfVar.b);
                        }
                        if (oyfVar == null || !oyfVar.n0()) {
                            sxf.b.j();
                        } else {
                            l = ((xxf) eyfVar).a;
                            if (l != null) {
                                yl2.a(shareDataPickerScreen);
                                sxf sxfVar = sxf.b;
                                l.getClass();
                                o65 o65VarB = sxfVar.b();
                                n65 n65Var = new n65();
                                n65Var.a = ":chats";
                                n65Var.d(l, "id");
                                n65Var.d("local", "type");
                                n65Var.d(Boolean.TRUE, "pop_controllers");
                                o65.e(o65VarB, n65Var.a(), null, null, 4);
                            } else {
                                sxf.b.j();
                            }
                        }
                    } else {
                        l = ((xxf) eyfVar).a;
                        if (l != null) {
                            yl2.a(shareDataPickerScreen);
                            sxf sxfVar2 = sxf.b;
                            l.getClass();
                            o65 o65VarB2 = sxfVar2.b();
                            n65 n65Var2 = new n65();
                            n65Var2.a = ":chats";
                            n65Var2.d(l, "id");
                            n65Var2.d("local", "type");
                            n65Var2.d(Boolean.TRUE, "pop_controllers");
                            o65.e(o65VarB2, n65Var2.a(), null, null, 4);
                        } else {
                            sxf.b.j();
                        }
                    }
                } else if (cqk.d(eyfVar, wxf.a)) {
                    String string2 = shareDataPickerScreen.getArgs().getString("tag");
                    if (string2 != null) {
                        Object objG2 = shareDataPickerScreen.getRouter().g(string2);
                        oyf oyfVar2 = objG2 instanceof oyf ? (oyf) objG2 : null;
                        if (oyfVar2 != null) {
                            oyfVar2.K();
                        }
                    }
                    sxf.b.j();
                } else if (cqk.d(eyfVar, ayf.a)) {
                    shareDataPickerScreen.d0(true);
                } else if (cqk.d(eyfVar, zxf.a)) {
                    shareDataPickerScreen.d0(false);
                    txc txcVarX1 = shareDataPickerScreen.x1();
                    txcVarX1.d.d();
                    txcVarX1.h.setValue(ui9.a);
                    ((AtomicReference) shareDataPickerScreen.p.e).updateAndGet(new g23(8));
                } else if (eyfVar instanceof yxf) {
                    it3.a(shareDataPickerScreen.getContext(), ((yxf) eyfVar).a);
                    if (it3.b()) {
                        g8c g8cVar2 = shareDataPickerScreen.B;
                        if (g8cVar2 != null) {
                            g8cVar2.a();
                        }
                        h8c h8cVar5 = new h8c(shareDataPickerScreen);
                        h8cVar5.m(new tnh(R.string.link_copied));
                        h8cVar5.h(new w8c(R.drawable.icon_copy_fill));
                        shareDataPickerScreen.B = h8cVar5.p();
                    }
                    sxf.b.j();
                } else if (eyfVar instanceof dyf) {
                    g8c g8cVar3 = shareDataPickerScreen.B;
                    if (g8cVar3 != null) {
                        g8cVar3.a();
                    }
                    h8c h8cVar6 = new h8c(shareDataPickerScreen);
                    h8cVar6.m(((dyf) eyfVar).a);
                    h8cVar6.h(new w8c(R.drawable.done_fill_round_animated));
                    g8c g8cVarP = h8cVar6.p();
                    if (g8cVarP != null) {
                        reh rehVar = (reh) g8cVarP.a.e;
                        if (rehVar != null) {
                            p0m.a(rehVar, lt7.CONFIRM);
                        }
                        g8cVar = g8cVarP;
                    }
                    shareDataPickerScreen.B = g8cVar;
                } else if (eyfVar instanceof byf) {
                    yl2.a(shareDataPickerScreen);
                    byf byfVar = (byf) eyfVar;
                    o65.c(sxf.b.b(), ":story/editor", n1g.i(new ylc("share_uri", byfVar.a), new ylc("type", String.valueOf(byfVar.b))), null, 4);
                } else if (cqk.d(eyfVar, cyf.a)) {
                    g8c g8cVar4 = shareDataPickerScreen.B;
                    if (g8cVar4 != null) {
                        g8cVar4.a();
                    }
                    h8c h8cVar7 = new h8c(shareDataPickerScreen);
                    h8cVar7.m(new tnh(R.string.common_error));
                    h8cVar7.h(new w8c(R.drawable.icon_warning));
                    shareDataPickerScreen.B = h8cVar7.p();
                }
                return sbi.a;
            default:
                ch3.d0(obj);
                gm0.n("SimpleRingtonePlayer", "Playback(" + ((String) this.f) + ") | releasing safely player on completion");
                m7g m7gVar = (m7g) this.g;
                m7gVar.h(m7gVar.d);
                m7gVar.d = null;
                return sbi.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dtd(Object obj, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dtd(lq4 lq4Var, Object obj, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = obj;
    }
}
