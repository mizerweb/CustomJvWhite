package defpackage;

import android.os.Environment;
import android.os.StatFs;
import android.support.v4.media.session.PlaybackStateCompat;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import kotlin.collections.a;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class j0f {
    public final ny8 a;
    public final ny8 b;
    public final ny8 c;
    public final ny8 d;
    public final ny8 e;
    public final ny8 f;
    public e0f g;
    public final pzf h;
    public final q8e i;

    public j0f(ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, ny8 ny8Var4, ny8 ny8Var5, ny8 ny8Var6) {
        this.a = ny8Var;
        this.b = ny8Var2;
        this.c = ny8Var3;
        this.d = ny8Var4;
        this.e = ny8Var5;
        this.f = ny8Var6;
        pzf pzfVarB = e9i.b(0, Integer.MAX_VALUE, 4);
        this.h = pzfVarB;
        this.i = new q8e(pzfVarB);
    }

    public static zze e() {
        return new zze(new tnh(R.string.oneme_media_download_viewer_all_media_not_enough_space), Integer.valueOf(R.drawable.icon_cross_round_fill));
    }

    /* JADX WARN: Code duplicated, block: B:97:0x0190  */
    /* JADX WARN: Code duplicated, block: B:98:0x0195  */
    public final boolean a(Collection collection, Long l) {
        Object poeVar;
        long j;
        boolean z;
        long jA;
        long jA2;
        long jLongValue;
        File dataDirectory = Environment.getDataDirectory();
        long j2 = PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED;
        try {
            StatFs statFs = new StatFs(dataDirectory.getPath());
            poeVar = Long.valueOf((statFs.getBlockSizeLong() * statFs.getAvailableBlocksLong()) / PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED);
        } catch (Throwable th) {
            poeVar = new poe(th);
        }
        boolean z2 = poeVar instanceof poe;
        Object obj = poeVar;
        if (z2) {
            obj = -1L;
        }
        long jLongValue2 = ((Number) obj).longValue();
        boolean z3 = false;
        if (jLongValue2 < ((f5d) ((wo6) this.c.getValue())).h()) {
            return false;
        }
        Iterator it = collection.iterator();
        long j3 = 0;
        while (true) {
            Long lValueOf = null;
            Object obj2 = null;
            lValueOf = null;
            lValueOf = null;
            lValueOf = null;
            lValueOf = null;
            lValueOf = null;
            lValueOf = null;
            if (!it.hasNext()) {
                boolean z4 = jLongValue2 > ((f5d) ((wo6) this.c.getValue())).h() + ((j3 / j2) + 1) ? true : z3;
                if (!z4) {
                    String name = j0f.class.getName();
                    a4c a4cVar = gm0.f;
                    if (a4cVar != null) {
                        je9 je9Var = je9.d;
                        if (a4cVar.b(je9Var)) {
                            a4cVar.c(je9Var, name, nbh.s(jLongValue2, "Not enough space: ", " mb"), null);
                        }
                    }
                }
                return z4;
            }
            t50 t50Var = (t50) it.next();
            if (t50Var instanceof aq6) {
                lValueOf = Long.valueOf(((aq6) t50Var).e);
            } else {
                if (t50Var instanceof h8g) {
                    lValueOf = Long.valueOf(pvk.a(((h8g) t50Var).c));
                } else if (t50Var instanceof yv3) {
                    ArrayList<yu3> arrayList = ((yv3) t50Var).b;
                    if (l != null) {
                        Iterator it2 = arrayList.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                j = j2;
                                break;
                            }
                            Object next = it2.next();
                            j = j2;
                            yu3 yu3Var = (yu3) next;
                            if (yu3Var instanceof g58) {
                                if (((g58) yu3Var).a == l.longValue()) {
                                    obj2 = next;
                                    break;
                                }
                                j2 = j;
                            } else {
                                if (!(yu3Var instanceof fti)) {
                                    ore.o();
                                    return z3;
                                }
                                if (((fti) yu3Var).a == l.longValue()) {
                                    obj2 = next;
                                    break;
                                }
                                j2 = j;
                            }
                        }
                        yu3 yu3Var2 = (yu3) obj2;
                        if (yu3Var2 != null) {
                            if (yu3Var2 instanceof g58) {
                                jA = pvk.a((g58) yu3Var2);
                            } else {
                                if (!(yu3Var2 instanceof fti)) {
                                    ore.o();
                                    return z3;
                                }
                                jA = ((fti) yu3Var2).g;
                            }
                            z = z3;
                        } else {
                            z = z3;
                            jA = 0;
                        }
                    } else {
                        j = j2;
                        long j4 = 0;
                        for (yu3 yu3Var3 : arrayList) {
                            if (yu3Var3 instanceof g58) {
                                jA2 = pvk.a((g58) yu3Var3);
                            } else {
                                if (!(yu3Var3 instanceof fti)) {
                                    boolean z5 = z3;
                                    ore.o();
                                    return z5;
                                }
                                jA2 = ((fti) yu3Var3).g;
                            }
                            j4 += jA2;
                            z3 = z3;
                        }
                        z = z3;
                        jA = j4;
                    }
                    lValueOf = Long.valueOf(jA);
                } else {
                    j = j2;
                    z = z3;
                    if (t50Var instanceof y90) {
                        lValueOf = Long.valueOf(((y90) t50Var).i.length);
                    } else if (t50Var instanceof eag) {
                        lValueOf = Long.valueOf(((eag) t50Var).c.g);
                    } else if (t50Var instanceof oxi) {
                        lValueOf = Long.valueOf(((oxi) t50Var).c.g);
                    } else if (!(t50Var instanceof yb1) && !(t50Var instanceof jh4) && !(t50Var instanceof zj7) && !(t50Var instanceof mxf) && !(t50Var instanceof plg) && !(t50Var instanceof e7d) && !(t50Var instanceof n1h)) {
                        ore.o();
                        return z;
                    }
                }
                if (lValueOf != null) {
                    jLongValue = lValueOf.longValue();
                } else {
                    f0f f0fVar = new f0f(t50Var);
                    gm0.V(j0f.class.getName(), f0fVar.getMessage(), f0fVar);
                    jLongValue = 0;
                }
                j3 += jLongValue;
                j2 = j;
                z3 = z;
            }
            j = j2;
            z = z3;
            if (lValueOf != null) {
                jLongValue = lValueOf.longValue();
            } else {
                f0f f0fVar2 = new f0f(t50Var);
                gm0.V(j0f.class.getName(), f0fVar2.getMessage(), f0fVar2);
                jLongValue = 0;
            }
            j3 += jLongValue;
            j2 = j;
            z3 = z;
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x00ab  */
    public final void b(wp6 wp6Var, t50 t50Var, long j, long j2, ns5 ns5Var) {
        ylc ylcVar;
        ylc ylcVar2;
        Integer num;
        Integer num2;
        int size = ((yv3) t50Var).b.size();
        lq4 lq4Var = null;
        int iD = lu8.d(t50Var, null);
        boolean zA = a(Collections.singletonList(t50Var), null);
        pzf pzfVar = this.h;
        if (!zA) {
            pzfVar.a(e());
            return;
        }
        if (!((ju6) ((rs6) this.b.getValue())).a()) {
            this.g = new b0f(t50Var, j, j2);
            pzfVar.a(xze.a);
            return;
        }
        int iD2 = qt4.D(iD);
        int i = 3;
        int i2 = 1;
        if (iD2 == 0) {
            ylcVar = new ylc(Integer.valueOf(R.string.oneme_media_download_viewer_all_photo_download_complete), Integer.valueOf(R.drawable.download_photo_fill));
        } else {
            if (iD2 != 1) {
                if (iD2 == 2) {
                    ylcVar = new ylc(Integer.valueOf(R.string.oneme_media_download_viewer_start_downloading_many_medias), Integer.valueOf(R.drawable.download_file_fill));
                } else {
                    if (iD2 != 3) {
                        ore.o();
                        return;
                    }
                    ylcVar2 = new ylc(null, null);
                }
                num = (Integer) ylcVar2.a;
                num2 = (Integer) ylcVar2.b;
                if (num != null) {
                    pzfVar.a(new zze(new vnh(num.intValue(), a.n1(Arrays.copyOf(new Object[]{Integer.valueOf(size)}, 1))), num2));
                }
                e9i.j0(e9i.T(e9i.p(new fz6(new j3(new cu2(new jz(osl.b((xyj) wp6Var.n.getValue(), wp6Var.k, j, ww3.U1(Collections.singleton(Long.valueOf(j2))), ns5Var, null), 13), 8), 14, new jy6(i, lq4Var, i2)), new fb8(null, iD, this, size, num2, wp6Var, iD), i)), ((n0c) ((xhh) this.d.getValue())).a()), (wmi) this.f.getValue());
            }
            ylcVar = new ylc(Integer.valueOf(R.string.oneme_media_download_viewer_start_downloading_many_video), Integer.valueOf(R.drawable.download_video_fill));
        }
        ylcVar2 = ylcVar;
        num = (Integer) ylcVar2.a;
        num2 = (Integer) ylcVar2.b;
        if (num != null) {
            pzfVar.a(new zze(new vnh(num.intValue(), a.n1(Arrays.copyOf(new Object[]{Integer.valueOf(size)}, 1))), num2));
        }
        e9i.j0(e9i.T(e9i.p(new fz6(new j3(new cu2(new jz(osl.b((xyj) wp6Var.n.getValue(), wp6Var.k, j, ww3.U1(Collections.singleton(Long.valueOf(j2))), ns5Var, null), 13), 8), 14, new jy6(i, lq4Var, i2)), new fb8(null, iD, this, size, num2, wp6Var, iD), i)), ((n0c) ((xhh) this.d.getValue())).a()), (wmi) this.f.getValue());
    }

    /* JADX WARN: Code duplicated, block: B:26:0x008d A[PHI: r6
  0x008d: PHI (r6v3 java.lang.String) = 
  (r6v0 java.lang.String)
  (r6v1 java.lang.String)
  (r6v0 java.lang.String)
  (r6v0 java.lang.String)
  (r6v0 java.lang.String)
  (r6v0 java.lang.String)
 binds: [B:60:0x00f0, B:61:0x00f2, B:57:0x00eb, B:36:0x00aa, B:31:0x009d, B:25:0x008b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:27:0x0090 A[PHI: r4
  0x0090: PHI (r4v14 java.lang.String) = (r4v6 java.lang.String), (r4v10 java.lang.String), (r4v13 java.lang.String), (r4v23 java.lang.String) binds: [B:57:0x00eb, B:36:0x00aa, B:31:0x009d, B:25:0x008b] A[DONT_GENERATE, DONT_INLINE]] */
    public final void c(wp6 wp6Var, long j, t50 t50Var, long j2, long j3, ns5 ns5Var) {
        tnh tnhVar;
        int i;
        Object next;
        String strK;
        String str;
        boolean zA = a(Collections.singletonList(t50Var), Long.valueOf(j));
        pzf pzfVar = this.h;
        if (!zA) {
            pzfVar.a(e());
            return;
        }
        if (!((ju6) ((rs6) this.b.getValue())).a()) {
            this.g = new d0f(j, t50Var, j2, j3);
            pzfVar.a(xze.a);
            return;
        }
        int iD = lu8.d(t50Var, Long.valueOf(j));
        int iD2 = qt4.D(iD);
        int i2 = 1;
        int i3 = 3;
        lq4 lq4Var = null;
        if (iD2 == 0) {
            tnhVar = new tnh(R.string.oneme_media_download_viewer_photo_download_complete);
            i = R.drawable.download_photo_fill;
        } else if (iD2 == 1) {
            tnhVar = new tnh(R.string.oneme_media_download_viewer_start_downloading_single_video);
            i = R.drawable.download_video_fill;
        } else if (iD2 != 2 && iD2 != 3) {
            ore.o();
            return;
        } else {
            i = R.drawable.icon_download_round_fill;
            tnhVar = null;
        }
        String str2 = "";
        if (t50Var instanceof h8g) {
            strK = ((h8g) t50Var).c.k;
            if (strK == null) {
                str = str2;
            } else {
                str = strK;
            }
        } else if (t50Var instanceof eag) {
            strK = ((eag) t50Var).c.h;
            if (strK == null) {
                str = str2;
            } else {
                str = strK;
            }
        } else if (t50Var instanceof oxi) {
            strK = ((oxi) t50Var).c.h;
            if (strK == null) {
                str = str2;
            } else {
                str = strK;
            }
        } else {
            if (t50Var instanceof yv3) {
                Iterator it = ((yv3) t50Var).b.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    yu3 yu3Var = (yu3) next;
                    if (((yu3Var instanceof g58) && ((g58) yu3Var).a == j) || ((yu3Var instanceof fti) && ((fti) yu3Var).a == j)) {
                        break;
                    }
                }
                yu3 yu3Var2 = (yu3) next;
                strK = yu3Var2 != null ? yu3Var2.k() : null;
                if (strK != null) {
                    str = strK;
                }
            } else if (t50Var instanceof aq6) {
                str2 = ((aq6) t50Var).c;
            }
            str = str2;
        }
        if (tnhVar != null) {
            pzfVar.a(new zze(tnhVar, Integer.valueOf(i)));
        }
        e9i.j0(e9i.T(e9i.p(new fz6(new j3(new cu2(new jz(osl.b((xyj) wp6Var.n.getValue(), wp6Var.k, j2, ww3.U1(Collections.singleton(Long.valueOf(j3))), ns5Var, str), 13), 8), 14, new jy6(i3, lq4Var, i2)), new wd9(null, iD, this, wp6Var, iD), i3)), ((n0c) ((xhh) this.d.getValue())).a()), (wmi) this.f.getValue());
    }

    public final wp6 d() {
        return (wp6) this.a.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object f(long j, t50 t50Var, long j2, long j3, ns5 ns5Var, nq4 nq4Var) {
        i0f i0fVar;
        long j4;
        long j5;
        long j6;
        ns5 ns5Var2;
        t50 t50Var2 = t50Var;
        if (nq4Var instanceof i0f) {
            i0fVar = (i0f) nq4Var;
            int i = i0fVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                i0fVar.k = i - Integer.MIN_VALUE;
            } else {
                i0fVar = new i0f(this, nq4Var);
            }
        } else {
            i0fVar = new i0f(this, nq4Var);
        }
        Object objK0 = i0fVar.i;
        int i2 = i0fVar.k;
        sbi sbiVar = sbi.a;
        if (i2 == 0) {
            ch3.d0(objK0);
            if (t50Var2 instanceof yv3) {
                yv3 yv3Var = (yv3) t50Var2;
                i0fVar.g = yv3Var;
                ns5Var2 = ns5Var;
                i0fVar.h = ns5Var2;
                j4 = j;
                i0fVar.d = j4;
                j5 = j2;
                i0fVar.e = j5;
                j6 = j3;
                i0fVar.f = j6;
                i0fVar.k = 1;
                objK0 = yab.K0(((n0c) ((xhh) this.d.getValue())).b(), new g0f(yv3Var, this, null), i0fVar);
                hu4 hu4Var = hu4.a;
                if (objK0 == hu4Var) {
                    return hu4Var;
                }
            } else {
                j4 = j;
                j5 = j2;
                j6 = j3;
                ns5Var2 = ns5Var;
            }
            ns5 ns5Var3 = ns5Var2;
            c(d(), j4, t50Var2, j5, j6, ns5Var3);
            return sbiVar;
        }
        if (i2 != 1) {
            ore.k("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        long j7 = i0fVar.f;
        long j8 = i0fVar.e;
        long j9 = i0fVar.d;
        ns5 ns5Var4 = i0fVar.h;
        yv3 yv3Var2 = i0fVar.g;
        ch3.d0(objK0);
        j6 = j7;
        j5 = j8;
        j4 = j9;
        ns5Var2 = ns5Var4;
        t50Var2 = yv3Var2;
        ArrayList arrayList = (ArrayList) objK0;
        if (!arrayList.isEmpty()) {
            this.h.a(new yze(j4, t50Var2, arrayList));
            return sbiVar;
        }
        ns5 ns5Var5 = ns5Var2;
        c(d(), j4, t50Var2, j5, j6, ns5Var5);
        return sbiVar;
    }

    /* JADX WARN: Code duplicated, block: B:148:0x02e9  */
    /* JADX WARN: Code duplicated, block: B:155:0x011e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:157:0x0060 A[SYNTHETIC] */
    public final void g(long j, Map map, ns5 ns5Var) {
        int i;
        ylc ylcVar;
        ylc ylcVar2;
        ynh ynhVar;
        Integer num;
        Long lValueOf;
        boolean z;
        if (map.isEmpty()) {
            gm0.n(j0f.class.getName(), "items are empty, nothing to save");
            return;
        }
        lq4 lq4Var = null;
        if (!a(map.values(), null)) {
            this.h.a(e());
            return;
        }
        if (!((ju6) ((rs6) this.b.getValue())).a()) {
            this.g = new c0f(map, j);
            this.h.a(xze.a);
            return;
        }
        ufe ufeVar = new ufe();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = map.entrySet().iterator();
        while (true) {
            int i2 = 3;
            int i3 = 1;
            if (!it.hasNext()) {
                if (linkedHashSet.isEmpty()) {
                    String name = j0f.class.getName();
                    a4c a4cVar = gm0.f;
                    if (a4cVar != null) {
                        je9 je9Var = je9.f;
                        if (a4cVar.b(je9Var)) {
                            a4cVar.c(je9Var, name, "available for saving messages with attaches is empty, messages: " + map.keySet(), null);
                        }
                    }
                    this.h.a(new zze(new tnh(R.string.oneme_media_download_viewer_media_download_error), Integer.valueOf(R.drawable.icon_warning_fill)));
                    return;
                }
                if (linkedHashSet.size() == 1) {
                    long jLongValue = ((Number) ww3.q1(linkedHashSet)).longValue();
                    t50 t50Var = (t50) map.get(Long.valueOf(jLongValue));
                    if (t50Var == null) {
                        gm0.n(j0f.class.getName(), "Not found model by message id");
                        return;
                    }
                    if (t50Var instanceof yv3) {
                        b(d(), t50Var, j, jLongValue, ns5Var);
                        return;
                    }
                    if (t50Var instanceof h8g) {
                        lValueOf = Long.valueOf(((h8g) t50Var).c.a);
                    } else if (t50Var instanceof eag) {
                        lValueOf = Long.valueOf(((eag) t50Var).c.a);
                    } else if (t50Var instanceof aq6) {
                        lValueOf = Long.valueOf(((aq6) t50Var).a);
                    } else {
                        lValueOf = t50Var instanceof oxi ? Long.valueOf(((oxi) t50Var).c.a) : null;
                    }
                    if (lValueOf != null) {
                        c(d(), lValueOf.longValue(), t50Var, j, jLongValue, ns5Var);
                        return;
                    }
                    String name2 = j0f.class.getName();
                    a4c a4cVar2 = gm0.f;
                    if (a4cVar2 == null) {
                        return;
                    }
                    je9 je9Var2 = je9.d;
                    if (a4cVar2.b(je9Var2)) {
                        a4cVar2.c(je9Var2, name2, "caught wrong attachModel -> " + t50Var, null);
                        return;
                    }
                    return;
                }
                Iterator it2 = map.values().iterator();
                boolean z2 = false;
                boolean z3 = false;
                while (true) {
                    if (!it2.hasNext()) {
                        if (!z2) {
                            if (z3) {
                                i = 2;
                                break;
                            } else {
                                i = 4;
                                break;
                            }
                        }
                        i = 1;
                        break;
                    }
                    int iD = qt4.D(lu8.d((t50) it2.next(), null));
                    if (iD == 0) {
                        z2 = true;
                    } else {
                        if (iD != 1) {
                            if (iD != 2) {
                            }
                            i = 3;
                            break;
                        }
                        z3 = true;
                    }
                    if (z2 && z3) {
                        i = 3;
                        break;
                    }
                }
                int iD2 = qt4.D(i);
                if (iD2 == 0) {
                    ylcVar = new ylc(new vnh(R.string.oneme_media_download_viewer_all_photo_download_complete, a.n1(Arrays.copyOf(new Object[]{Integer.valueOf(ufeVar.a)}, 1))), Integer.valueOf(R.drawable.download_photo_fill));
                } else {
                    if (iD2 != 1) {
                        if (iD2 != 2) {
                            ylcVar2 = new ylc(null, null);
                        } else {
                            ylcVar = new ylc(new vnh(R.string.oneme_media_download_viewer_start_downloading_many_medias, a.n1(Arrays.copyOf(new Object[]{Integer.valueOf(ufeVar.a)}, 1))), Integer.valueOf(R.drawable.download_file_fill));
                        }
                        ynhVar = (ynh) ylcVar2.a;
                        num = (Integer) ylcVar2.b;
                        if (ynhVar != null) {
                            this.h.a(new zze(ynhVar, num));
                        }
                        wp6 wp6VarD = d();
                        int i4 = i;
                        e9i.j0(e9i.T(e9i.p(new fz6(new j3(new cu2(new jz(osl.b((xyj) wp6VarD.n.getValue(), wp6VarD.k, j, ww3.U1(linkedHashSet), ns5Var, null), 13), 8), 14, new jy6(i2, lq4Var, i3)), new je0(null, i4, this, ufeVar, num, i4), i2)), ((n0c) ((xhh) this.d.getValue())).a()), (wmi) this.f.getValue());
                        return;
                    }
                    ylcVar = new ylc(new vnh(R.string.oneme_media_download_viewer_start_downloading_many_video, a.n1(Arrays.copyOf(new Object[]{Integer.valueOf(ufeVar.a)}, 1))), Integer.valueOf(R.drawable.download_video_fill));
                }
                ylcVar2 = ylcVar;
                ynhVar = (ynh) ylcVar2.a;
                num = (Integer) ylcVar2.b;
                if (ynhVar != null) {
                    this.h.a(new zze(ynhVar, num));
                }
                wp6 wp6VarD2 = d();
                int i5 = i;
                e9i.j0(e9i.T(e9i.p(new fz6(new j3(new cu2(new jz(osl.b((xyj) wp6VarD2.n.getValue(), wp6VarD2.k, j, ww3.U1(linkedHashSet), ns5Var, null), 13), 8), 14, new jy6(i2, lq4Var, i3)), new je0(null, i5, this, ufeVar, num, i5), i2)), ((n0c) ((xhh) this.d.getValue())).a()), (wmi) this.f.getValue());
                return;
            }
            Map.Entry entry = (Map.Entry) it.next();
            long jLongValue2 = ((Number) entry.getKey()).longValue();
            t50 t50Var2 = (t50) entry.getValue();
            if ((t50Var2 instanceof h8g) || (t50Var2 instanceof eag)) {
                ufeVar.a++;
            } else {
                if (t50Var2 instanceof yv3) {
                    z = false;
                    for (yu3 yu3Var : ((yv3) t50Var2).b) {
                        if (yu3Var instanceof g58) {
                            ufeVar.a++;
                        } else {
                            if (!(yu3Var instanceof fti)) {
                                ore.o();
                                return;
                            }
                            ufeVar.a++;
                        }
                        z = true;
                    }
                } else if (t50Var2 instanceof aq6) {
                    int iD3 = qt4.D(((aq6) t50Var2).i);
                    if (iD3 == 0 || iD3 == 1 || iD3 == 2) {
                        ufeVar.a++;
                    } else {
                        if (iD3 != 3) {
                            ore.o();
                            return;
                        }
                        z = false;
                    }
                } else if (t50Var2 instanceof oxi) {
                    ufeVar.a++;
                } else {
                    if (!(t50Var2 instanceof y90) && !(t50Var2 instanceof yb1) && !(t50Var2 instanceof jh4) && !(t50Var2 instanceof zj7) && !(t50Var2 instanceof e7d) && !(t50Var2 instanceof mxf) && !(t50Var2 instanceof plg) && !(t50Var2 instanceof n1h)) {
                        ore.o();
                        return;
                    }
                    z = false;
                }
                if (z) {
                    linkedHashSet.add(Long.valueOf(jLongValue2));
                }
            }
            z = true;
            if (z) {
                linkedHashSet.add(Long.valueOf(jLongValue2));
            }
        }
    }

    public final void h(ns5 ns5Var) {
        e0f e0fVar = this.g;
        if (e0fVar == null) {
            gm0.n(j0f.class.getName(), "No pending events for start download");
            return;
        }
        this.g = null;
        if (e0fVar instanceof b0f) {
            b0f b0fVar = (b0f) e0fVar;
            b(d(), b0fVar.a, b0fVar.b, b0fVar.c, ns5Var);
        } else if (e0fVar instanceof d0f) {
            d0f d0fVar = (d0f) e0fVar;
            c(d(), d0fVar.a, d0fVar.b, d0fVar.c, d0fVar.d, ns5Var);
        } else if (!(e0fVar instanceof c0f)) {
            ore.o();
        } else {
            c0f c0fVar = (c0f) e0fVar;
            g(c0fVar.b, c0fVar.a, ns5Var);
        }
    }
}
