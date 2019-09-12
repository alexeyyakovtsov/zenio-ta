@pricing

  Feature: Billing and Pricing

    Scenario: Subscribe page
      Given click profile - subscription menu button
      When open Subscribe page
      Then will be showed My team block
      And subscription details block

    Scenario: Edit subscription details
      Given click edit subscription details
      When will be opened modal windows Credit Card
      And fill Cardholder Name
      And fill Card number
      And fill Company Name or Your Name
      And fill Country
      And fill Street Address
      And fill State
      And fill City
      And click Save subscription button
      Then credit card will be saved

    Scenario: Cancel subscription
      Given click Cancel subscription link
      When will be opened modal window Cancel Subscription
      And click Yes button
      Then button Add payment Method will be showed

    Scenario: Add Payment Method
      Given click Add Payment Method button
      When will be opened modal window Add payment method
      And fill credit card fields and billing address fields
      And click Save payment method button
      Then payment method successfully added

