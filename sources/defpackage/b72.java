package defpackage;

import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.webrtc.CameraVideoCapturer;

/* JADX INFO: loaded from: classes3.dex */
public final class b72 implements CameraVideoCapturer.CameraEventsHandler {
    public final y3e a;

    public /* synthetic */ b72(y3e y3eVar) {
        this.a = y3eVar;
    }

    public a72 a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            JSONArray jSONArray = jSONObject.getJSONArray("participants");
            int length = jSONArray.length();
            ArrayList arrayList = new ArrayList(length);
            for (int i = 0; i < length; i++) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                JSONObject jSONObject3 = jSONObject2.getJSONObject("id");
                arrayList.add(new g62(new h62(yt1.a(jSONObject3.getString("id")), jSONObject3.getLong("addedTs")), kql.i(jSONObject2)));
            }
            return new a72(jSONObject.optInt("totalCount", 0), arrayList, jSONObject.optBoolean("hasMore", false));
        } catch (JSONException e) {
            this.a.log("WaitingRoomParticipantsParser", "can't parse waiting room participants " + e.getMessage());
            return null;
        }
    }

    @Override // org.webrtc.CameraVideoCapturer.CameraEventsHandler
    public void onCameraClosed() {
    }

    @Override // org.webrtc.CameraVideoCapturer.CameraEventsHandler
    public void onCameraDisconnected() {
    }

    @Override // org.webrtc.CameraVideoCapturer.CameraEventsHandler
    public void onCameraError(String str, Throwable th) {
        this.a.reportException("OKRTCSvcFactory", "onCameraError(): " + str, new RuntimeException(qv1.k("Camera error: ", str), th));
    }

    @Override // org.webrtc.CameraVideoCapturer.CameraEventsHandler
    public void onCameraFreezed(String str) {
        this.a.log("OKRTCSvcFactory", "onCameraFreezed(): " + str);
    }

    @Override // org.webrtc.CameraVideoCapturer.CameraEventsHandler
    public void onCameraOpening(String str) {
    }

    @Override // org.webrtc.CameraVideoCapturer.CameraEventsHandler
    public void onFirstFrameAvailable() {
    }
}
