<?xml version="1.0" encoding="utf-8"?>

<LinearLayout
    xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:gravity="center"
    android:orientation="vertical"
    android:padding="16dp">

    <ImageView
        android:id="@+id/fanImage"
        android:layout_width="250dp"
        android:layout_height="250dp"
        android:src="@drawable/fan"
        android:scaleType="fitCenter"/>

    <Button
        android:id="@+id/btnOn"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text="ON"/>

    <Button
        android:id="@+id/btnOff"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text="OFF"/>

    <Button
        android:id="@+id/btnSlow"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text="Slow"/>

    <Button
        android:id="@+id/btnMedium"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text="Medium"/>

    <Button
        android:id="@+id/btnFast"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text="Fast"/>

</LinearLayout>