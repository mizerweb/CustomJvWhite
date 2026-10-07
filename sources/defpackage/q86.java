package defpackage;

import android.media.CamcorderProfile;
import android.media.EncoderProfiles;
import android.os.Build;
import androidx.camera.camera2.compat.quirk.CamcorderProfileResolutionQuirk;
import androidx.camera.camera2.compat.quirk.InvalidVideoProfilesQuirk;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class q86 implements p86 {
    public final String c;
    public final s2e d;
    public final boolean e;
    public final int f;
    public final LinkedHashMap g = new LinkedHashMap();

    public q86(String str, s2e s2eVar) {
        boolean z;
        int i;
        this.c = str;
        this.d = s2eVar;
        try {
            i = Integer.parseInt(str);
            z = true;
        } catch (NumberFormatException unused) {
            tvj.g("EncoderProfilesProviderAdapter", "Camera id is not an integer:  " + this.c + ", unable to create EncoderProfilesProviderAdapter.");
            z = false;
            i = -1;
        }
        this.e = z;
        this.f = i;
    }

    @Override // defpackage.p86
    public final boolean a(int i) {
        return this.e && b(i) != null;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x003b  */
    /* JADX WARN: Code duplicated, block: B:35:0x0098  */
    /* JADX WARN: Code duplicated, block: B:37:0x009c  */
    /* JADX WARN: Code duplicated, block: B:40:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:42:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:43:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:44:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:45:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:46:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:49:0x00de  */
    /* JADX WARN: Code duplicated, block: B:51:0x00e2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:52:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:53:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:54:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:57:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:59:0x0100  */
    /* JADX WARN: Code duplicated, block: B:60:0x0103  */
    /* JADX WARN: Code duplicated, block: B:61:0x0106  */
    /* JADX WARN: Code duplicated, block: B:62:0x0109  */
    /* JADX WARN: Code duplicated, block: B:63:0x010c  */
    /* JADX WARN: Code duplicated, block: B:64:0x010f  */
    /* JADX WARN: Code duplicated, block: B:65:0x0112  */
    /* JADX WARN: Code duplicated, block: B:66:0x0115  */
    /* JADX WARN: Code duplicated, block: B:71:0x0145  */
    /* JADX WARN: Instruction removed from duplicated block: B:37:0x009c, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.p86
    public final r86 b(int i) {
        CamcorderProfile camcorderProfile;
        int i2;
        int i3;
        String str;
        int i4;
        int i5;
        String str2;
        hh0 hh0VarE;
        boolean zContains;
        hh0 hh0VarA;
        hh0 hh0VarA2;
        r86 r86Var = null;
        if (this.e) {
            int i6 = this.f;
            if (CamcorderProfile.hasProfile(i6, i)) {
                Integer numValueOf = Integer.valueOf(i);
                LinkedHashMap linkedHashMap = this.g;
                if (linkedHashMap.containsKey(numValueOf)) {
                    return (r86) linkedHashMap.get(Integer.valueOf(i));
                }
                int i7 = Build.VERSION.SDK_INT;
                if (i7 < 31) {
                    try {
                        camcorderProfile = CamcorderProfile.get(i6, i);
                    } catch (RuntimeException e) {
                        tvj.i("EncoderProfilesProviderAdapter", "Unable to get CamcorderProfile by quality: " + i, e);
                        camcorderProfile = null;
                    }
                    if (camcorderProfile != null) {
                        i2 = Build.VERSION.SDK_INT;
                        if (i2 >= 31) {
                            tvj.g("EncoderProfilesProxyCompat", "Should use from(EncoderProfiles) on API " + i2 + "instead. CamcorderProfile is deprecated on API 31.");
                        }
                        int i8 = camcorderProfile.duration;
                        int i9 = camcorderProfile.fileFormat;
                        ArrayList arrayList = new ArrayList();
                        i3 = camcorderProfile.audioCodec;
                        switch (i3) {
                            case 1:
                                str = "audio/3gpp";
                                break;
                            case 2:
                                str = "audio/amr-wb";
                                break;
                            case 3:
                            case 4:
                            case 5:
                                str = "audio/mp4a-latm";
                                break;
                            case 6:
                                str = "audio/vorbis";
                                break;
                            case 7:
                                str = "audio/opus";
                                break;
                            default:
                                str = "audio/none";
                                break;
                        }
                        String str3 = str;
                        int i10 = camcorderProfile.audioBitRate;
                        int i11 = camcorderProfile.audioSampleRate;
                        int i12 = camcorderProfile.audioChannels;
                        if (i3 != 3) {
                            i4 = 5;
                            if (i3 != 4) {
                                if (i3 != 5) {
                                    i4 = -1;
                                } else {
                                    i4 = 39;
                                }
                            }
                        } else {
                            i4 = 2;
                        }
                        arrayList.add(new gh0(i3, i10, i11, i12, i4, str3));
                        ArrayList arrayList2 = new ArrayList();
                        i5 = camcorderProfile.videoCodec;
                        switch (i5) {
                            case 1:
                                str2 = "video/3gpp";
                                break;
                            case 2:
                                str2 = "video/avc";
                                break;
                            case 3:
                                str2 = "video/mp4v-es";
                                break;
                            case 4:
                                str2 = "video/x-vnd.on2.vp8";
                                break;
                            case 5:
                                str2 = "video/hevc";
                                break;
                            case 6:
                                str2 = "video/x-vnd.on2.vp9";
                                break;
                            case 7:
                                str2 = "video/dolby-vision";
                                break;
                            case 8:
                                str2 = "video/av01";
                                break;
                            default:
                                str2 = "video/none";
                                break;
                        }
                        arrayList2.add(new ih0(i5, str2, camcorderProfile.videoBitRate, camcorderProfile.videoFrameRate, camcorderProfile.videoFrameWidth, camcorderProfile.videoFrameHeight, -1, 8, 0, 0));
                        hh0VarE = hh0.e(i8, i9, arrayList, arrayList2);
                    } else {
                        hh0VarE = 0;
                    }
                } else {
                    EncoderProfiles encoderProfilesB = jo.b(i, this.c);
                    if (encoderProfilesB != null) {
                        if (uk5.a(InvalidVideoProfilesQuirk.class) != null) {
                            tvj.a("EncoderProfilesProviderAdapter", "EncoderProfiles contains invalid video profiles, use CamcorderProfile to create EncoderProfilesProxy.");
                        } else {
                            try {
                                if (i7 >= 33) {
                                    hh0VarA2 = u4.a(encoderProfilesB);
                                } else {
                                    if (i7 < 31) {
                                        throw new RuntimeException("Unable to call from(EncoderProfiles) on API " + i7 + ". Version 31 or higher required.");
                                    }
                                    hh0VarA = jo.a(encoderProfilesB);
                                }
                            } catch (NullPointerException e2) {
                                tvj.i("EncoderProfilesProviderAdapter", "Failed to create EncoderProfilesProxy, EncoderProfiles might contain invalid video profiles. Use CamcorderProfile instead.", e2);
                                camcorderProfile = CamcorderProfile.get(i6, i);
                                if (camcorderProfile != null) {
                                    i2 = Build.VERSION.SDK_INT;
                                    if (i2 >= 31) {
                                        tvj.g("EncoderProfilesProxyCompat", "Should use from(EncoderProfiles) on API " + i2 + "instead. CamcorderProfile is deprecated on API 31.");
                                    }
                                    int i13 = camcorderProfile.duration;
                                    int i14 = camcorderProfile.fileFormat;
                                    ArrayList arrayList3 = new ArrayList();
                                    i3 = camcorderProfile.audioCodec;
                                    switch (i3) {
                                        case 1:
                                            str = "audio/3gpp";
                                            break;
                                        case 2:
                                            str = "audio/amr-wb";
                                            break;
                                        case 3:
                                        case 4:
                                        case 5:
                                            str = "audio/mp4a-latm";
                                            break;
                                        case 6:
                                            str = "audio/vorbis";
                                            break;
                                        case 7:
                                            str = "audio/opus";
                                            break;
                                        default:
                                            str = "audio/none";
                                            break;
                                    }
                                    String str4 = str;
                                    int i15 = camcorderProfile.audioBitRate;
                                    int i16 = camcorderProfile.audioSampleRate;
                                    int i17 = camcorderProfile.audioChannels;
                                    if (i3 != 3) {
                                        i4 = 5;
                                        if (i3 != 4) {
                                            if (i3 != 5) {
                                                i4 = -1;
                                            } else {
                                                i4 = 39;
                                            }
                                        }
                                    } else {
                                        i4 = 2;
                                    }
                                    arrayList3.add(new gh0(i3, i15, i16, i17, i4, str4));
                                    ArrayList arrayList4 = new ArrayList();
                                    i5 = camcorderProfile.videoCodec;
                                    switch (i5) {
                                        case 1:
                                            str2 = "video/3gpp";
                                            break;
                                        case 2:
                                            str2 = "video/avc";
                                            break;
                                        case 3:
                                            str2 = "video/mp4v-es";
                                            break;
                                        case 4:
                                            str2 = "video/x-vnd.on2.vp8";
                                            break;
                                        case 5:
                                            str2 = "video/hevc";
                                            break;
                                        case 6:
                                            str2 = "video/x-vnd.on2.vp9";
                                            break;
                                        case 7:
                                            str2 = "video/dolby-vision";
                                            break;
                                        case 8:
                                            str2 = "video/av01";
                                            break;
                                        default:
                                            str2 = "video/none";
                                            break;
                                    }
                                    arrayList4.add(new ih0(i5, str2, camcorderProfile.videoBitRate, camcorderProfile.videoFrameRate, camcorderProfile.videoFrameWidth, camcorderProfile.videoFrameHeight, -1, 8, 0, 0));
                                    hh0VarE = hh0.e(i13, i14, arrayList3, arrayList4);
                                } else {
                                    hh0VarE = 0;
                                }
                            }
                        }
                        camcorderProfile = CamcorderProfile.get(i6, i);
                        if (camcorderProfile != null) {
                            i2 = Build.VERSION.SDK_INT;
                            if (i2 >= 31) {
                                tvj.g("EncoderProfilesProxyCompat", "Should use from(EncoderProfiles) on API " + i2 + "instead. CamcorderProfile is deprecated on API 31.");
                            }
                            int i18 = camcorderProfile.duration;
                            int i19 = camcorderProfile.fileFormat;
                            ArrayList arrayList5 = new ArrayList();
                            i3 = camcorderProfile.audioCodec;
                            switch (i3) {
                                case 1:
                                    str = "audio/3gpp";
                                    break;
                                case 2:
                                    str = "audio/amr-wb";
                                    break;
                                case 3:
                                case 4:
                                case 5:
                                    str = "audio/mp4a-latm";
                                    break;
                                case 6:
                                    str = "audio/vorbis";
                                    break;
                                case 7:
                                    str = "audio/opus";
                                    break;
                                default:
                                    str = "audio/none";
                                    break;
                            }
                            String str5 = str;
                            int i110 = camcorderProfile.audioBitRate;
                            int i111 = camcorderProfile.audioSampleRate;
                            int i112 = camcorderProfile.audioChannels;
                            if (i3 != 3) {
                                i4 = 5;
                                if (i3 != 4) {
                                    if (i3 != 5) {
                                        i4 = -1;
                                    } else {
                                        i4 = 39;
                                    }
                                }
                            } else {
                                i4 = 2;
                            }
                            arrayList5.add(new gh0(i3, i110, i111, i112, i4, str5));
                            ArrayList arrayList6 = new ArrayList();
                            i5 = camcorderProfile.videoCodec;
                            switch (i5) {
                                case 1:
                                    str2 = "video/3gpp";
                                    break;
                                case 2:
                                    str2 = "video/avc";
                                    break;
                                case 3:
                                    str2 = "video/mp4v-es";
                                    break;
                                case 4:
                                    str2 = "video/x-vnd.on2.vp8";
                                    break;
                                case 5:
                                    str2 = "video/hevc";
                                    break;
                                case 6:
                                    str2 = "video/x-vnd.on2.vp9";
                                    break;
                                case 7:
                                    str2 = "video/dolby-vision";
                                    break;
                                case 8:
                                    str2 = "video/av01";
                                    break;
                                default:
                                    str2 = "video/none";
                                    break;
                            }
                            arrayList6.add(new ih0(i5, str2, camcorderProfile.videoBitRate, camcorderProfile.videoFrameRate, camcorderProfile.videoFrameWidth, camcorderProfile.videoFrameHeight, -1, 8, 0, 0));
                            hh0VarE = hh0.e(i18, i19, arrayList5, arrayList6);
                        } else {
                            hh0VarE = 0;
                        }
                    } else {
                        hh0VarE = 0;
                    }
                }
                if (hh0VarE != 0) {
                    hh0VarE = hh0VarA;
                    hh0VarE = hh0VarA2;
                    CamcorderProfileResolutionQuirk camcorderProfileResolutionQuirk = (CamcorderProfileResolutionQuirk) this.d.b(CamcorderProfileResolutionQuirk.class);
                    if (camcorderProfileResolutionQuirk == null) {
                        zContains = true;
                    } else {
                        List list = hh0VarE.d;
                        if (list.isEmpty()) {
                            zContains = true;
                        } else {
                            zContains = ww3.T1((List) camcorderProfileResolutionQuirk.b.getValue()).contains(((ih0) list.get(0)).a());
                        }
                    }
                    if (!zContains) {
                        List list2 = p86.b;
                        if (i == 0) {
                            for (int iO0 = xw3.O0(list2); -1 < iO0; iO0--) {
                                r86 r86VarB = b(((Number) list2.get(iO0)).intValue());
                                if (r86VarB != null) {
                                    r86Var = r86VarB;
                                }
                            }
                        } else if (i == 1) {
                            Iterator it = list2.iterator();
                            while (it.hasNext()) {
                                r86 r86VarB2 = b(((Integer) it.next()).intValue());
                                if (r86VarB2 != null) {
                                    r86Var = r86VarB2;
                                }
                            }
                        }
                        hh0VarE = r86Var;
                    }
                }
                hh0VarE = hh0VarA;
                hh0VarE = hh0VarA2;
                linkedHashMap.put(Integer.valueOf(i), hh0VarE);
                return hh0VarE;
            }
        }
        return null;
    }
}
