package com.example.cybersecvk

object ElementList {

     fun  getElement():ArrayList<Element>
     {
          val   elementList=ArrayList<Element>()
          elementList.add(Element(1,"Keep You Away From Hackers ",R.drawable.hacker,"Increase your resistance to attack by tapping the world’s top ethical hackers.\n" +
                  "Understand your attack surface, hunt bugs, test apps, and fix vulnerabilities\n" +
                  "before anyone else knows they exist"))
          elementList.add(Element(2,"Provide Information Security ",R.drawable.secure," Information Security is the component of cyber security that denotes the methods for defending unapproved access, use, revelation, interruption, modification, or deletion of information"))
          elementList.add(Element(3,"Enjoy Operational Security ",R.drawable.security,"The process that encourages the managers to see the activities according to the viewpoint of a hacker to protect sensitive data from various threats is known as Operational Security (OPSEC)n or Procedural security. Operations security (OPSEC) is utilized to defend the functions of an association"))
          elementList.add(Element(4,"Secure End-User ",R.drawable.end_user," End-user training is most the significant element of computer security. End users are turning into the biggest security threat in any association since it can happen whenever"))
          elementList.add(Element(5,"Full Secure Network ",R.drawable.internet_security," Network security is the security given to a network from unapproved access and dangers. It is the obligation of network heads to embrace preventive measures to safeguard their networks from potential security dangers"))
          elementList.add(Element(6,"Provide You Application Security", R.drawable.mobile_application," Application security is the principal key component of cyber security which adds security highlights inside applications during the improvement time frame to defend against cyberattacks"))
          elementList.add(Element(7,"All Disaster Recovery", R.drawable.data_recovery,"The planning that describes the continuity of work in a fast and efficient way after a disaster is known as Disaster Recovery Planning or Business Continuity Planning."))
         return elementList;
     }
}