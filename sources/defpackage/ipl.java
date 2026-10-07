package defpackage;

import android.content.ContentValues;
import org.webrtc.SdpObserver;
import org.webrtc.SessionDescription;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ipl implements SdpObserver {
    public static final ContentValues a(ylc... ylcVarArr) {
        ContentValues contentValues = new ContentValues(ylcVarArr.length);
        for (ylc ylcVar : ylcVarArr) {
            String str = (String) ylcVar.a;
            Object obj = ylcVar.b;
            if (obj == null) {
                contentValues.putNull(str);
            } else if (obj instanceof String) {
                contentValues.put(str, (String) obj);
            } else if (obj instanceof Integer) {
                contentValues.put(str, (Integer) obj);
            } else if (obj instanceof Long) {
                contentValues.put(str, (Long) obj);
            } else if (obj instanceof Boolean) {
                contentValues.put(str, (Boolean) obj);
            } else if (obj instanceof Float) {
                contentValues.put(str, (Float) obj);
            } else if (obj instanceof Double) {
                contentValues.put(str, (Double) obj);
            } else if (obj instanceof byte[]) {
                contentValues.put(str, (byte[]) obj);
            } else if (obj instanceof Byte) {
                contentValues.put(str, (Byte) obj);
            } else {
                if (!(obj instanceof Short)) {
                    c.k("Illegal value type ", obj.getClass().getCanonicalName(), " for key \"", str, 34);
                    return null;
                }
                contentValues.put(str, (Short) obj);
            }
        }
        return contentValues;
    }

    @Override // org.webrtc.SdpObserver
    public void onCreateFailure(String str) {
        throw new RuntimeException(str);
    }

    @Override // org.webrtc.SdpObserver
    public void onCreateSuccess(SessionDescription sessionDescription) {
    }

    @Override // org.webrtc.SdpObserver
    public void onSetFailure(String str) {
        throw new RuntimeException(str);
    }

    @Override // org.webrtc.SdpObserver
    public void onSetSuccess() {
    }
}
