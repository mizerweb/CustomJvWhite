package defpackage;

import android.graphics.Canvas;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.os.Build;
import android.system.Os;
import android.system.OsConstants;
import java.util.ArrayList;
import kotlin.collections.a;
import one.me.login.confirm.ConfirmPhoneScreen;
import org.apache.http.conn.params.ConnManagerParams;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class zn3 implements af7 {
    public final /* synthetic */ int a;

    @Override // defpackage.af7
    public final Object invoke() {
        Object poeVar;
        int maxSupportedInstances = 0;
        switch (this.a) {
            case 0:
                return new hj3();
            case 1:
                return new lge("^(http[s]?://www\\.|http[s]?://|www\\.)");
            case 2:
                if (Build.VERSION.SDK_INT >= 29) {
                    MediaCodecInfo[] codecInfos = new MediaCodecList(0).getCodecInfos();
                    codecInfos.getClass();
                    ArrayList arrayList = new ArrayList();
                    for (MediaCodecInfo mediaCodecInfo : codecInfos) {
                        String[] supportedTypes = mediaCodecInfo.getSupportedTypes();
                        supportedTypes.getClass();
                        if (a.N0(supportedTypes, "video/avc") && !mediaCodecInfo.isEncoder() && mediaCodecInfo.isHardwareAccelerated()) {
                            arrayList.add(mediaCodecInfo);
                        }
                    }
                    int size = arrayList.size();
                    int i = 0;
                    while (i < size) {
                        Object obj = arrayList.get(i);
                        i++;
                        MediaCodecInfo.CodecCapabilities capabilitiesForType = ((MediaCodecInfo) obj).getCapabilitiesForType("video/avc");
                        if (capabilitiesForType.getMaxSupportedInstances() > 0) {
                            maxSupportedInstances = capabilitiesForType.getMaxSupportedInstances();
                        }
                    }
                }
                return Integer.valueOf(oc9.v(maxSupportedInstances - 5, 4, 10));
            case 3:
                return new gqd(R.string.oneme_profile_section_common_chats, (noh) null, 6);
            case 4:
                return new r7g(false);
            case 5:
                return new r7g(true);
            case 6:
                zv8[] zv8VarArr = ConfirmPhoneScreen.z;
                int i2 = uw8.a;
                return Boolean.valueOf(uw8.b(uw8.c));
            case 7:
                zv8[] zv8VarArr2 = ConfirmPhoneScreen.z;
                return y3f.AUTH_OTP;
            case 8:
                return "connect";
            case 9:
                return "registerRead";
            case 10:
                return "readyForReadPayload";
            case 11:
                return "readyForWritePayload";
            case 12:
                return "disableWriteInterest";
            case 13:
                return "close";
            case 14:
                return "onConnected";
            case 15:
                return "registerConnect";
            case 16:
                return "readyForWrite";
            case 17:
                return "enableWriteInterest";
            case 18:
                return "readyForRead";
            case 19:
                return "registerWrite";
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                return new r7g(false);
            case 21:
                return new r7g(true);
            case 22:
                return rki.c(R.drawable.blocked_ghost_avatar).toString();
            case 23:
                return new ShapeDrawable(new OvalShape());
            case 24:
                return new mld();
            case 25:
                return new tnh(R.string.chat_screen_action_copy_photo_failed);
            case 26:
                return new tnh(R.string.chat_screen_action_copy_photo_success);
            case 27:
                try {
                    poeVar = Long.valueOf(Os.sysconf(OsConstants._SC_CLK_TCK));
                    break;
                } catch (Throwable th) {
                    poeVar = new poe(th);
                }
                if (poeVar instanceof poe) {
                    poeVar = 100L;
                }
                return Long.valueOf(((Number) poeVar).longValue());
            case 28:
                return new Canvas();
            default:
                return Long.valueOf(System.currentTimeMillis());
        }
    }

    public /* synthetic */ zn3(int i) {
        this.a = i;
    }
}
