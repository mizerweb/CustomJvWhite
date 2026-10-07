package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import org.apache.http.entity.ContentLengthStrategy;
import org.webrtc.MediaStreamTrack;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes.dex */
public final class s80 {
    public final Object a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;

    public s80() {
        this.a = new int[]{R.drawable.abc_textfield_search_default_mtrl_alpha, R.drawable.abc_textfield_default_mtrl_alpha, R.drawable.abc_ab_share_pack_mtrl_alpha};
        this.b = new int[]{R.drawable.abc_ic_commit_search_api_mtrl_alpha, R.drawable.abc_seekbar_tick_mark_material, R.drawable.abc_ic_menu_share_mtrl_alpha, R.drawable.abc_ic_menu_copy_mtrl_am_alpha, R.drawable.abc_ic_menu_cut_mtrl_alpha, R.drawable.abc_ic_menu_selectall_mtrl_alpha, R.drawable.abc_ic_menu_paste_mtrl_am_alpha};
        this.c = new int[]{R.drawable.abc_textfield_activated_mtrl_alpha, R.drawable.abc_textfield_search_activated_mtrl_alpha, R.drawable.abc_cab_background_top_mtrl_alpha, R.drawable.abc_text_cursor_material, R.drawable.abc_text_select_handle_left_mtrl, R.drawable.abc_text_select_handle_middle_mtrl, R.drawable.abc_text_select_handle_right_mtrl};
        this.d = new int[]{R.drawable.abc_popup_background_mtrl_mult, R.drawable.abc_cab_background_internal_bg, R.drawable.abc_menu_hardkey_panel_mtrl_mult};
        this.e = new int[]{R.drawable.abc_tab_indicator_material, R.drawable.abc_textfield_search_material};
        this.f = new int[]{R.drawable.abc_btn_check_material, R.drawable.abc_btn_radio_material, R.drawable.abc_btn_check_material_anim, R.drawable.abc_btn_radio_material_anim};
    }

    public static k95 a(DataInputStream dataInputStream) throws IOException {
        int i = dataInputStream.readInt();
        HashMap map = new HashMap();
        for (int i2 = 0; i2 < i; i2++) {
            String utf = dataInputStream.readUTF();
            int i3 = dataInputStream.readInt();
            if (i3 < 0) {
                qr7.k(zo5.h(i3, "Invalid value size: "));
                return null;
            }
            int iMin = Math.min(i3, 10485760);
            byte[] bArrCopyOf = vqi.b;
            int i4 = 0;
            while (i4 != i3) {
                int i5 = i4 + iMin;
                bArrCopyOf = Arrays.copyOf(bArrCopyOf, i5);
                dataInputStream.readFully(bArrCopyOf, i4, iMin);
                iMin = Math.min(i3 - i5, 10485760);
                i4 = i5;
            }
            map.put(utf, bArrCopyOf);
        }
        return new k95(map);
    }

    public static void b(k95 k95Var, DataOutputStream dataOutputStream) {
        Set<Map.Entry> setC = k95Var.c();
        dataOutputStream.writeInt(setC.size());
        for (Map.Entry entry : setC) {
            dataOutputStream.writeUTF((String) entry.getKey());
            byte[] bArr = (byte[]) entry.getValue();
            dataOutputStream.writeInt(bArr.length);
            dataOutputStream.write(bArr);
        }
    }

    public static boolean d(int i, int[] iArr) {
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    public static ColorStateList e(Context context, int i) {
        int iC = dqh.c(context, R.attr.colorControlHighlight);
        int iB = dqh.b(context, R.attr.colorButtonNormal);
        int[] iArr = dqh.b;
        int[] iArr2 = dqh.d;
        int iC2 = mx3.c(iC, i);
        return new ColorStateList(new int[][]{iArr, iArr2, dqh.c, dqh.f}, new int[]{iB, iC2, mx3.c(iC, i), i});
    }

    public static x4a f(l3d l3dVar, c98 c98Var, x4a x4aVar, rsh rshVar) {
        ush ushVarV = l3dVar.v();
        int iB = l3dVar.B();
        Object objL = ushVarV.p() ? null : ushVarV.l(iB);
        int iB2 = (l3dVar.f() || ushVarV.p()) ? -1 : ushVarV.f(iB, rshVar, false).b(vqi.X(l3dVar.e()) - rshVar.e);
        for (int i = 0; i < c98Var.size(); i++) {
            x4a x4aVar2 = (x4a) c98Var.get(i);
            if (r(x4aVar2, objL, l3dVar.f(), l3dVar.s(), l3dVar.C(), iB2)) {
                return x4aVar2;
            }
        }
        if (c98Var.isEmpty() && x4aVar != null && r(x4aVar, objL, l3dVar.f(), l3dVar.s(), l3dVar.C(), iB2)) {
            return x4aVar;
        }
        return null;
    }

    public static LayerDrawable m(hne hneVar, Context context, int i) {
        BitmapDrawable bitmapDrawable;
        BitmapDrawable bitmapDrawable2;
        BitmapDrawable bitmapDrawable3;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(i);
        Drawable drawableE = hneVar.e(context, R.drawable.abc_star_black_48dp);
        Drawable drawableE2 = hneVar.e(context, R.drawable.abc_star_half_black_48dp);
        if ((drawableE instanceof BitmapDrawable) && drawableE.getIntrinsicWidth() == dimensionPixelSize && drawableE.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable = (BitmapDrawable) drawableE;
            bitmapDrawable2 = new BitmapDrawable(bitmapDrawable.getBitmap());
        } else {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            drawableE.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            drawableE.draw(canvas);
            bitmapDrawable = new BitmapDrawable(bitmapCreateBitmap);
            bitmapDrawable2 = new BitmapDrawable(bitmapCreateBitmap);
        }
        bitmapDrawable2.setTileModeX(Shader.TileMode.REPEAT);
        if ((drawableE2 instanceof BitmapDrawable) && drawableE2.getIntrinsicWidth() == dimensionPixelSize && drawableE2.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable3 = (BitmapDrawable) drawableE2;
        } else {
            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(bitmapCreateBitmap2);
            drawableE2.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            drawableE2.draw(canvas2);
            bitmapDrawable3 = new BitmapDrawable(bitmapCreateBitmap2);
        }
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable, bitmapDrawable3, bitmapDrawable2});
        layerDrawable.setId(0, android.R.id.background);
        layerDrawable.setId(1, android.R.id.secondaryProgress);
        layerDrawable.setId(2, android.R.id.progress);
        return layerDrawable;
    }

    public static boolean r(x4a x4aVar, Object obj, boolean z, int i, int i2, int i3) {
        Object obj2 = x4aVar.a;
        int i4 = x4aVar.b;
        if (!obj2.equals(obj)) {
            return false;
        }
        if (z && i4 == i && x4aVar.c == i2) {
            return true;
        }
        return !z && i4 == -1 && x4aVar.e == i3;
    }

    public static void w(Drawable drawable, int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilterF;
        Drawable drawableMutate = drawable.mutate();
        if (mode == null) {
            mode = xr.b;
        }
        PorterDuff.Mode mode2 = xr.b;
        synchronized (xr.class) {
            porterDuffColorFilterF = hne.f(i, mode);
        }
        drawableMutate.setColorFilter(porterDuffColorFilterF);
    }

    public void c(hle hleVar, x4a x4aVar, ush ushVar) {
        if (x4aVar == null) {
            return;
        }
        if (ushVar.b(x4aVar.a) != -1) {
            hleVar.j(x4aVar, ushVar);
            return;
        }
        ush ushVar2 = (ush) ((lhe) this.c).get(x4aVar);
        if (ushVar2 != null) {
            hleVar.j(x4aVar, ushVar2);
        }
    }

    public g81 g(String str) {
        return (g81) ((HashMap) this.a).get(str);
    }

    public rac h() {
        return (rac) this.c;
    }

    public rac i() {
        return (rac) this.d;
    }

    public rac j() {
        return (rac) this.a;
    }

    public rac k() {
        return (rac) this.b;
    }

    public g81 l(String str) {
        HashMap map = (HashMap) this.a;
        g81 g81Var = (g81) map.get(str);
        if (g81Var != null) {
            return g81Var;
        }
        SparseArray sparseArray = (SparseArray) this.b;
        int size = sparseArray.size();
        int i = 0;
        int iKeyAt = size == 0 ? 0 : sparseArray.keyAt(size - 1) + 1;
        if (iKeyAt < 0) {
            while (i < size && i == sparseArray.keyAt(i)) {
                i++;
            }
            iKeyAt = i;
        }
        g81 g81Var2 = new g81(iKeyAt, str);
        map.put(str, g81Var2);
        sparseArray.put(iKeyAt, str);
        ((SparseBooleanArray) this.d).put(iKeyAt, true);
        ((i81) this.e).b(g81Var2);
        return g81Var2;
    }

    public fbc n() {
        return (fbc) this.e;
    }

    public fbc o() {
        return (fbc) this.f;
    }

    public ColorStateList p(Context context, int i) {
        if (i == R.drawable.abc_edit_text_material) {
            return np4.l(context, R.color.abc_tint_edittext);
        }
        if (i == R.drawable.abc_switch_track_mtrl_alpha) {
            return np4.l(context, R.color.abc_tint_switch_track);
        }
        if (i != R.drawable.abc_switch_thumb_material) {
            if (i == R.drawable.abc_btn_default_mtrl_shape) {
                return e(context, dqh.c(context, R.attr.colorButtonNormal));
            }
            if (i == R.drawable.abc_btn_borderless_material) {
                return e(context, 0);
            }
            if (i == R.drawable.abc_btn_colored_material) {
                return e(context, dqh.c(context, R.attr.colorAccent));
            }
            if (i == R.drawable.abc_spinner_mtrl_am_alpha || i == R.drawable.abc_spinner_textfield_background_material) {
                return np4.l(context, R.color.abc_tint_spinner);
            }
            if (d(i, (int[]) this.b)) {
                return dqh.d(context, R.attr.colorControlNormal);
            }
            if (d(i, (int[]) this.e)) {
                return np4.l(context, R.color.abc_tint_default);
            }
            if (d(i, (int[]) this.f)) {
                return np4.l(context, R.color.abc_tint_btn_checkable);
            }
            if (i == R.drawable.abc_seekbar_thumb_material) {
                return np4.l(context, R.color.abc_tint_seek_thumb);
            }
            return null;
        }
        int[][] iArr = new int[3][];
        int[] iArr2 = new int[3];
        ColorStateList colorStateListD = dqh.d(context, R.attr.colorSwitchThumbNormal);
        if (colorStateListD == null || !colorStateListD.isStateful()) {
            iArr[0] = dqh.b;
            iArr2[0] = dqh.b(context, R.attr.colorSwitchThumbNormal);
            iArr[1] = dqh.e;
            iArr2[1] = dqh.c(context, R.attr.colorControlActivated);
            iArr[2] = dqh.f;
            iArr2[2] = dqh.c(context, R.attr.colorSwitchThumbNormal);
        } else {
            int[] iArr3 = dqh.b;
            iArr[0] = iArr3;
            iArr2[0] = colorStateListD.getColorForState(iArr3, 0);
            iArr[1] = dqh.e;
            iArr2[1] = dqh.c(context, R.attr.colorControlActivated);
            iArr[2] = dqh.f;
            iArr2[2] = colorStateListD.getDefaultColor();
        }
        return new ColorStateList(iArr, iArr2);
    }

    public void q(long j) {
        i81 i81Var;
        SparseArray sparseArray = (SparseArray) this.b;
        HashMap map = (HashMap) this.a;
        i81 i81Var2 = (i81) this.e;
        i81Var2.e(j);
        i81 i81Var3 = (i81) this.f;
        if (i81Var3 != null) {
            i81Var3.e(j);
        }
        if (i81Var2.c() || (i81Var = (i81) this.f) == null || !i81Var.c()) {
            i81Var2.n(map, sparseArray);
        } else {
            ((i81) this.f).n(map, sparseArray);
            i81Var2.i(map);
        }
        i81 i81Var4 = (i81) this.f;
        if (i81Var4 != null) {
            i81Var4.o();
            this.f = null;
        }
    }

    public void s(String str) {
        SparseBooleanArray sparseBooleanArray = (SparseBooleanArray) this.d;
        HashMap map = (HashMap) this.a;
        g81 g81Var = (g81) map.get(str);
        if (g81Var != null && g81Var.g() && g81Var.i()) {
            map.remove(str);
            int i = g81Var.a;
            boolean z = sparseBooleanArray.get(i);
            ((i81) this.e).j(g81Var, z);
            SparseArray sparseArray = (SparseArray) this.b;
            if (z) {
                sparseArray.remove(i);
                sparseBooleanArray.delete(i);
            } else {
                sparseArray.put(i, null);
                ((SparseBooleanArray) this.c).put(i, true);
            }
        }
    }

    public void t(int i) {
        String strK;
        r80 r80Var = (r80) this.b;
        String str = (String) this.c;
        switch (i) {
            case -3:
                strK = "AUDIOFOCUS_LOSS_TRANSIENT_CAN_DUCK";
                break;
            case ContentLengthStrategy.CHUNKED /* -2 */:
                strK = "AUDIOFOCUS_LOSS_TRANSIENT";
                break;
            case -1:
                strK = "AUDIOFOCUS_LOSS";
                break;
            case 0:
                strK = "AUDIOFOCUS_NONE";
                break;
            case 1:
                strK = "AUDIOFOCUS_GAIN";
                break;
            case 2:
                strK = "AUDIOFOCUS_GAIN_TRANSIENT";
                break;
            case 3:
                strK = "AUDIOFOCUS_GAIN_TRANSIENT_MAY_DUCK";
                break;
            case 4:
                strK = "AUDIOFOCUS_GAIN_TRANSIENT_EXCLUSIVE";
                break;
            default:
                strK = c0a.k(i, "AUDIO_FOCUS_UNKNOWN(", ")");
                break;
        }
        gm0.m(str, "On audio focus change, %d", strK);
        if (i == -3) {
            if (!r80Var.d() || r80Var.a() <= 0.0f) {
                return;
            }
            gm0.n(str, "Player. Audio Focus. Focus changed: AUDIOFOCUS_LOSS_TRANSIENT_CAN_DUCK. Setting volume to 0.2");
            r80Var.b(0.2f);
            return;
        }
        if (i == -2) {
            if (!r80Var.d() || r80Var.a() <= 0.0f) {
                return;
            }
            gm0.n(str, "Player. Audio Focus. Focus changed: AUDIOFOCUS_LOSS_TRANSIENT. Pausing current player");
            r80Var.pause();
            return;
        }
        if (i == -1) {
            gm0.n(str, "onAudioFocusChange: AUDIOFOCUS_LOSS");
            if (!r80Var.d() || r80Var.a() <= 0.0f) {
                return;
            }
            gm0.n(str, "Player. Audio Focus. Focus changed: AUDIOFOCUS_LOSS. Stop");
            r80Var.pause();
            return;
        }
        if (i != 1 && i != 2 && i != 3 && i != 4) {
            gm0.Y(str, "Player. Audio Focus. Focus changed: " + i + ". It's not implemented");
            return;
        }
        if (!r80Var.d() && r80Var.W()) {
            gm0.n(str, "Player. Audio Focus. Focus changed: AUDIOFOCUS_GAIN. Resuming player");
            r80Var.play();
        }
        float fA = r80Var.a();
        if (fA <= 0.0f || fA >= 1.0f) {
            return;
        }
        gm0.n(str, "Player. Audio Focus. Focus changed: AUDIOFOCUS_GAIN. Volume up");
        r80Var.b(1.0f);
    }

    public void u() {
        AudioFocusRequest audioFocusRequest = (AudioFocusRequest) this.f;
        if (audioFocusRequest == null) {
            return;
        }
        this.f = null;
        gm0.n((String) this.c, "Release audio focus");
        wme wmeVar = (wme) this.d;
        if (wmeVar.d()) {
            ((Context) this.a).unregisterReceiver((BroadcastReceiver) wmeVar.getValue());
            wmeVar.a();
        }
        ((AudioManager) ((ifh) this.e).getValue()).abandonAudioFocusRequest(audioFocusRequest);
    }

    public void v(int i, int i2, int i3) {
        Context context = (Context) this.a;
        wme wmeVar = (wme) this.d;
        String str = (String) this.c;
        r80 r80Var = (r80) this.b;
        if (r80Var.a() <= 0.0f || !r80Var.d()) {
            gm0.n(str, "Skip request audio focus volume:" + r80Var.a() + " isPlaying:" + r80Var.d());
            return;
        }
        if (wmeVar.d()) {
            context.unregisterReceiver((BroadcastReceiver) wmeVar.getValue());
            wmeVar.a();
        }
        context.registerReceiver((BroadcastReceiver) wmeVar.getValue(), new IntentFilter("android.media.AUDIO_BECOMING_NOISY"));
        AudioFocusRequest audioFocusRequestBuild = new AudioFocusRequest.Builder(i2).setOnAudioFocusChangeListener(r80Var).setAudioAttributes(new AudioAttributes.Builder().setUsage(i3).setContentType(i).build()).build();
        this.f = audioFocusRequestBuild;
        gm0.n(str, "Request audio focus");
        ((AudioManager) ((ifh) this.e).getValue()).requestAudioFocus(audioFocusRequestBuild);
    }

    public void x() {
        ((i81) this.e).d((HashMap) this.a);
        SparseBooleanArray sparseBooleanArray = (SparseBooleanArray) this.c;
        int size = sparseBooleanArray.size();
        for (int i = 0; i < size; i++) {
            ((SparseArray) this.b).remove(sparseBooleanArray.keyAt(i));
        }
        sparseBooleanArray.clear();
        ((SparseBooleanArray) this.d).clear();
    }

    public void y(ush ushVar) {
        c98 c98Var;
        hle hleVar = new hle(4);
        if (((c98) this.b).isEmpty()) {
            c(hleVar, (x4a) this.e, ushVar);
            if (!Objects.equals((x4a) this.f, (x4a) this.e)) {
                c(hleVar, (x4a) this.f, ushVar);
            }
            if (!Objects.equals((x4a) this.d, (x4a) this.e) && !Objects.equals((x4a) this.d, (x4a) this.f)) {
                c(hleVar, (x4a) this.d, ushVar);
            }
        } else {
            int i = 0;
            while (true) {
                int size = ((c98) this.b).size();
                c98Var = (c98) this.b;
                if (i >= size) {
                    break;
                }
                c(hleVar, (x4a) c98Var.get(i), ushVar);
                i++;
            }
            if (!c98Var.contains((x4a) this.d)) {
                c(hleVar, (x4a) this.d, ushVar);
            }
        }
        this.c = hleVar.c(true);
    }

    public s80(Context context, r80 r80Var) {
        this.a = context;
        this.b = r80Var;
        this.c = zo5.p(s80.class.getName(), "#", av7.g(System.identityHashCode(this)));
        final int i = 0;
        this.d = new wme(new af7(this) { // from class: q80
            public final /* synthetic */ s80 b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                int i2 = i;
                s80 s80Var = this.b;
                switch (i2) {
                    case 0:
                        return new cg(3, s80Var);
                    default:
                        return (AudioManager) ((Context) s80Var.a).getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
                }
            }
        });
        final int i2 = 1;
        this.e = new ifh(new af7(this) { // from class: q80
            public final /* synthetic */ s80 b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                int i3 = i2;
                s80 s80Var = this.b;
                switch (i3) {
                    case 0:
                        return new cg(3, s80Var);
                    default:
                        return (AudioManager) ((Context) s80Var.a).getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
                }
            }
        });
    }

    public s80(String str, String str2, Set set) {
        Set setUnmodifiableSet = set == null ? Collections.EMPTY_SET : Collections.unmodifiableSet(set);
        this.a = setUnmodifiableSet;
        Map map = Collections.EMPTY_MAP;
        this.c = str;
        this.d = str2;
        this.e = h4g.a;
        HashSet hashSet = new HashSet(setUnmodifiableSet);
        Iterator it = map.values().iterator();
        if (!it.hasNext()) {
            this.b = Collections.unmodifiableSet(hashSet);
            return;
        }
        throw qt4.h(it);
    }

    public s80(m35 m35Var, File file, boolean z) {
        gvb gvbVar;
        this.a = new HashMap();
        this.b = new SparseArray();
        this.c = new SparseBooleanArray();
        this.d = new SparseBooleanArray();
        if (m35Var != null) {
            gvbVar = new gvb();
            gvbVar.b = m35Var;
            gvbVar.c = new SparseArray();
        } else {
            gvbVar = null;
        }
        h81 h81Var = new h81(new File(file, "cached_content_index.exi"));
        if (gvbVar != null && !z) {
            this.e = gvbVar;
            this.f = h81Var;
        } else {
            String str = vqi.a;
            this.e = h81Var;
            this.f = gvbVar;
        }
    }

    public s80(rsh rshVar) {
        this.a = rshVar;
        a98 a98Var = c98.b;
        this.b = ghe.e;
        this.c = lhe.g;
    }

    public s80(rac racVar, rac racVar2, rac racVar3, rac racVar4, fbc fbcVar, fbc fbcVar2) {
        this.a = racVar;
        this.b = racVar2;
        this.c = racVar3;
        this.d = racVar4;
        this.e = fbcVar;
        this.f = fbcVar2;
    }
}
