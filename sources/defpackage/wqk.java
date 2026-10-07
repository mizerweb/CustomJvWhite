package defpackage;

import android.opengl.Matrix;

/* JADX INFO: loaded from: classes4.dex */
public abstract class wqk {
    public static final do6[] a = {new do6("name_ulr_private", 1), new do6("name_sleep_segment_request", 1), new do6("get_last_activity_feature_id", 1), new do6("support_context_feature_id", 1), new do6("get_current_location", 2), new do6("get_last_location_with_request", 1), new do6("set_mock_mode_with_callback", 1), new do6("set_mock_location_with_callback", 1), new do6("inject_location_with_callback", 1), new do6("location_updates_with_callback", 1), new do6("use_safe_parcelable_in_intents", 1), new do6("flp_debug_updates", 1), new do6("google_location_accuracy_enabled", 1), new do6("geofences_with_callback", 1), new do6("location_enabled", 1)};

    public static void a(float[] fArr, float f) {
        Matrix.translateM(fArr, 0, 0.5f, 0.5f, 0.0f);
        Matrix.rotateM(fArr, 0, f, 0.0f, 0.0f, 1.0f);
        Matrix.translateM(fArr, 0, -0.5f, -0.5f, 0.0f);
    }

    public static void b(float[] fArr) {
        Matrix.translateM(fArr, 0, 0.0f, 0.5f, 0.0f);
        Matrix.scaleM(fArr, 0, 1.0f, -1.0f, 1.0f);
        Matrix.translateM(fArr, 0, -0.0f, -0.5f, 0.0f);
    }
}
