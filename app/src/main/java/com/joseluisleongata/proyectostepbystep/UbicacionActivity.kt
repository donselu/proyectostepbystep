package com.joseluisleongata.proyectostepbystep

import android.os.Bundle
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.GoogleMap.OnMapClickListener
import com.google.android.gms.maps.GoogleMap.OnMapLongClickListener
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions


class UbicacionActivity : AppCompatActivity(), OnMapReadyCallback, OnMapClickListener,
    OnMapLongClickListener {
    var txtLatitud: EditText? = null
    var txtLongitud: EditText? = null
    var mMap: GoogleMap? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ubicacion)
        val mapFragment = supportFragmentManager.findFragmentById(R.id.map) as SupportMapFragment?
        mapFragment!!.getMapAsync(this)
    }

    override fun onMapReady(googleMap: GoogleMap) {
        mMap = googleMap
        mMap!!.setOnMapClickListener(this)
        mMap!!.setOnMapLongClickListener(this)
        val Sevilla = LatLng(37.4045948,-5.9447571);
        mMap!!.addMarker(MarkerOptions().position(Sevilla).title("Sevilla"))
        mMap!!.moveCamera(CameraUpdateFactory.newLatLng(Sevilla))
    }

    override fun onMapClick(latLng: LatLng) {
        txtLatitud!!.setText(latLng.latitude.toString())
        txtLongitud!!.setText(latLng.longitude.toString())
        mMap!!.clear()
        val Sevilla = LatLng(latLng.latitude, latLng.longitude)
        mMap!!.addMarker(MarkerOptions().position(Sevilla).title(""))
        mMap!!.moveCamera(CameraUpdateFactory.newLatLng(Sevilla))
    }

    override fun onMapLongClick(latLng: LatLng) {
        txtLatitud!!.setText(latLng.latitude.toString())
        txtLongitud!!.setText(latLng.longitude.toString())
        mMap!!.clear()
        val Sevilla = LatLng(latLng.latitude, latLng.longitude)
        mMap!!.addMarker(MarkerOptions().position(Sevilla).title(""))
        mMap!!.moveCamera(CameraUpdateFactory.newLatLng(Sevilla))
    }
}





